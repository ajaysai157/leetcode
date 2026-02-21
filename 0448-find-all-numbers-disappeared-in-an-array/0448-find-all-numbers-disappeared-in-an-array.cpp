class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n=nums.size();
        vector<int> freq(n+1,0);
        vector<int> result;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int j=1;j<=n;j++){
            if(freq[j]==0){
                result.push_back(j);
            }
        }
        return result;
    }
};