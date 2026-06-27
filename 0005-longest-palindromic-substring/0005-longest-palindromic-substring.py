class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        start=0
        end=0
        for i in range(0,n):
            odd=self.expand(s,i,i)
            even=self.expand(s,i,i+1)
            length=max(odd,even)
            if(length>end-start):
                start=i-(length-1)//2
                end=i+length//2
        
        return s[start:end+1]

    def expand(self, s: str, left: int, right: int) -> int:
        while(left>=0 and right<len(s) and s[left]==s[right]):
            left-=1
            right+=1
        return right-left-1