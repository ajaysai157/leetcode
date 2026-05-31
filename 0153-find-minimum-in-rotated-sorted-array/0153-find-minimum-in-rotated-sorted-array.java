class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1,minEle=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[left]<=nums[mid]){
                minEle=Math.min(minEle,nums[left]);
                left=mid+1;
            }else{
                minEle=Math.min(minEle,nums[mid]);
                right=mid-1;
            }
        }
        return minEle;
    }
}