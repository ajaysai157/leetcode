class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currOnes=0,maxOnes=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currOnes++;
            }else{
                currOnes=0;
            }
            maxOnes=Math.max(currOnes,maxOnes);
        }
        return maxOnes;
    }
}