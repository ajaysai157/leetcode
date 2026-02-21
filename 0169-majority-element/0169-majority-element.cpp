class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> freq;
        int n=nums.size();
        int maj=0;
        for(int x:nums){
            freq[x]++;
        }
        int majority=n/2;
        for(auto x : freq)
        {
            if(x.second>majority){
                maj=x.first;
            }
        }
        return maj;
    }
};