class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> result;
        int length=nums.size();
        for(int i=0;i<length/2;i++){
            result.push_back(nums[i]);
            result.push_back(nums[i+n]);
        }   
        return result;
    }
};