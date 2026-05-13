class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones=0,curr_ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr_ones++;
                max_ones=Math.max(curr_ones,max_ones);
            }else{
                curr_ones=0;
            }
        }
        return max_ones;
    }
}