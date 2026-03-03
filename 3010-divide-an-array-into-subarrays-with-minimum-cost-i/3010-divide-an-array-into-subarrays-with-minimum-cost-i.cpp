class Solution {
public:
    int minimumCost(vector<int>& nums) {
        int max_value=nums[0];
        sort(nums.begin()+1,nums.end());
        max_value+=nums[1]+nums[2];
        return max_value;
    }
};