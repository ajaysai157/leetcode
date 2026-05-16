class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=-1,min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                maxDiff=Math.max(maxDiff,nums[i]-min);
            }else if(nums[i]<min){
                min=nums[i];
            }
        }
        return maxDiff;
    }
}