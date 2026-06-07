class Solution {
    private boolean splitPossible(int[] nums,int mid,int k){
        int split=1,sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                sum=nums[i];
                split++;
            }
        }
        return split<=k;
    }
    public int splitArray(int[] nums, int k) {
        int left=0,right=0;
        for(int num:nums){
            if(left<num){
                left=num;
            }
            right+=num;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(splitPossible(nums,mid,k)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}