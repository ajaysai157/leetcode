class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remFreq=new int[k];
        remFreq[0]=1;
        int sum=0,count=0;
        for(int num:nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            count+=remFreq[rem];
            remFreq[rem]++;
        }
        return count;
    }
}