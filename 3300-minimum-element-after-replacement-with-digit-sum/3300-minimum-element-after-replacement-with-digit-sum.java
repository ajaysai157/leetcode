class Solution {
    private int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int len=nums.length,min=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            nums[i]=sumOfDigits(nums[i]);
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}