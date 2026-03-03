class Solution {
public:
    int absDifference(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int sum1=accumulate(nums.begin(),nums.begin()+k,0);
        int sum2=accumulate(nums.end()-k,nums.end(),0);
        int diff=abs(sum1-sum2);
        return diff;
    }
};