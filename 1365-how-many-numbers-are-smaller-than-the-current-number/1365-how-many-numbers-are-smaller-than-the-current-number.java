class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101]; 
        for(var num : nums){
            freq[num]++;
        }
        for(int i=1;i<=100;i++){
            freq[i]+=freq[i-1];
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
                res[i]=freq[nums[i]-1];
            }
        }
        return res;
    }
}