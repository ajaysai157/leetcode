class Solution {
    public int maxProduct(int[] nums) {
        int fstMax=Integer.MIN_VALUE,secMax=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>fstMax){
                secMax=fstMax;
                fstMax=num;
            }else if(num>secMax){
                secMax=num;
            }
        }
        int sum=(fstMax-1)*(secMax-1);
        return sum;
    }
}