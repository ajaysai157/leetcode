class Solution {
public:
    bool isTrionic(vector<int>& nums) {
        int n=nums.size();
        int i=0;
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0) return false;
        int downStart=i;
        while(i+1<n && nums[i]>nums[i+1]){
            i++;
        }
        if(downStart==i) return false;
        int upStart=i;
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(upStart==i) return false;
        return i==n-1;
    }
};