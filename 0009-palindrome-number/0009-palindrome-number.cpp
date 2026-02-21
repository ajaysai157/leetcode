class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        long reverse=0;
        while(temp>0)
        {
            int rem=temp%10;
            reverse=(reverse*10)+rem;
            temp/=10;
        }
        if(x==reverse){
            return true;
        }
        else{
            return false;
        }
    }
};