class Solution {
public:
    int minPairSum(vector<int>& nums) {
        int sum=0;
        int n=nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n/2;i++){
            if(nums[i]+nums[n-i-1]>sum){
                sum=nums[i]+nums[n-i-1];
            }
        }
        return sum;
    }
};