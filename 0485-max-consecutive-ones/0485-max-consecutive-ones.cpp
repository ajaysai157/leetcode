class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int max_ones=0,consecutive_ones=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                consecutive_ones++;
            }else{
                consecutive_ones=0;
            }
            max_ones=max(max_ones,consecutive_ones);
        }
        return max_ones;
    }
};