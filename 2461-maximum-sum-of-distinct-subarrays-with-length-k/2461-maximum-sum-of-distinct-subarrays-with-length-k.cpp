class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int n=nums.size(),left=0;
        long long cur_sum=0,max_sum=0;
        unordered_map<int,int> mp;
        for(int right=0;right<n;right++){
            cur_sum+=nums[right];
            mp[nums[right]]++;
            if(right-left+1>k){
                cur_sum-=nums[left];
                mp[nums[left]]--;
                if(mp[nums[left]]==0) mp.erase(nums[left]);
                left++;
            }
            if(right-left+1==k && mp.size()==k){
                max_sum=max(max_sum,cur_sum);
            }
        }
        return max_sum;
    }
};