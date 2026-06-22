class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones=0,left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                max_ones=Math.max(max_ones,right-left);
                left=right+1;
            }
        }
        max_ones=Math.max(max_ones,nums.length-left);
        return max_ones;
    }
}