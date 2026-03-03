class Solution {
public:
    int mirrorDistance(int n) {
        int reverse=0;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            reverse=(reverse*10)+rem;
            temp/=10;
        }
        int res=abs(n-reverse);
        return res;
    }
};