class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0,n=nums.length;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
               return i; 
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}