class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int idx1=0,idx2=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[idx1]=nums[i];
                idx1+=2;
            } else if(nums[i]<0){
                res[idx2]=nums[i];
                idx2+=2;
            }
        }
        return res;
    }
}