class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int left=0,count=0,n=nums.length;
        long prod=1L;
        for(int right=0;right<n;right++){
            prod*=nums[right];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
}