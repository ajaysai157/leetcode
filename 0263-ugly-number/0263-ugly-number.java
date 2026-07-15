class Solution {
    public boolean isUgly(int n) {
        if(n==0) return false;
        int[] fact={2,3,5};
        for(int x:fact){
            while(n%x==0){
                n/=x;
            }
        }
        return n==1;
    }
}