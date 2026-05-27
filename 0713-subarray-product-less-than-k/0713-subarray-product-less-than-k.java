class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            long prod=1L;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                if(prod<k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}