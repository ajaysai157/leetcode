class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int> freq;
        bool val=false;
        for(int ele:nums){
            freq[ele]++;
        }
        for(auto p : freq){
            if(p.second>1){
                val=true;
            }
        }
        return val;
    }
};