class Solution {
    public void sortColors(int[] nums) {
        int i,j=0,n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        for(int k=j;k<n;k++){
            if(nums[k]==1){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j++;
            }
        }
    }
}