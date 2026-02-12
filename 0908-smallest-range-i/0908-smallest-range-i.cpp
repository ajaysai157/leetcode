class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int maximum=INT_MIN;
        int minimum=INT_MAX;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
            if(nums[i]<minimum){
                minimum=nums[i];
            }
        }
        maximum-=k,minimum+=k;
        if(minimum>=maximum){
            return 0;
        }
        return maximum-minimum;
    }
};