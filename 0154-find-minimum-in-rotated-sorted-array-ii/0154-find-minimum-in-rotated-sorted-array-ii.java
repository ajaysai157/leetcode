class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE,left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[left]<=nums[mid]){
                min=Math.min(nums[left],min);
                left++;
            }else{
                min=Math.min(nums[mid],min);
                right--;
            }
        }
        return min;
    }
}