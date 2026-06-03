class Solution {
    private int sumOfDivisors(int[] arr,int divisor){
        int sum=0;
        for(int num:arr){
            sum=sum+(num+divisor-1)/divisor;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1,right=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                right=nums[i];
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(sumOfDivisors(nums,mid)<=threshold){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}