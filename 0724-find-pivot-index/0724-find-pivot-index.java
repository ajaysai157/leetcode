class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int rightSum=0,leftSum=0;
        for(int x: nums){
            rightSum+=x;
        }
        for(int i=0;i<n;i++){
            if(leftSum==rightSum-nums[i]){
                return i;
            }
            leftSum+=nums[i];
            rightSum-=nums[i];
        }
        return -1;
    }
}