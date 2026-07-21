class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        long fstMax=Long.MIN_VALUE,secMax=Long.MIN_VALUE,trdMax=Long.MIN_VALUE;
        for(int num : nums){
            if(num==fstMax || num==secMax || num==trdMax) continue;
            if(num>fstMax){
                trdMax=secMax;
                secMax=fstMax;
                fstMax=num;
            }else if(num>secMax){
                trdMax=secMax;
                secMax=num;
            }else if(num>trdMax){
                trdMax=num;
            }
        }
        return trdMax==Long.MIN_VALUE?(int)fstMax:(int)trdMax;
    }
}