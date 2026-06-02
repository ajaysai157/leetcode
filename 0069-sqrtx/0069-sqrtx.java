class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int ans=1;
        for(long i=2;i<x;i++){
            if(i*i<=x){
                ans=(int)i;
            }else{
                break;
            }
        }
        return ans;
    }
}