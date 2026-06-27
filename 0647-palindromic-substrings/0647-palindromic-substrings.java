class Solution {
    public int countSubstrings(String s) {
        int n=s.length(),cnt=0;
        for(int i=0;i<n;i++){
            cnt+=expandString(s,i,i);
            cnt+=expandString(s,i,i+1);
        }
        return cnt;
    }
    private int expandString(String str,int left,int right){
        int count=0;
        while(left>=0 && right<str.length() && 
            str.charAt(left)==str.charAt(right)
        ){
            count++;
            left--;
            right++;
        }
        return count;
    }
}