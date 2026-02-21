class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> res;
        int n=nums.size();
        if(n==0){
            return res;
        }
        int first=nums[0],second=nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]+1!=nums[i+1]){
                second=nums[i];
                if(first!=second){
                    res.push_back(to_string(first)+"->"+to_string(second));
                }else{
                    res.push_back(to_string(first));
                }
                first=nums[i+1];
            }
        }
        if(first!=nums[n-1]){
            res.push_back(to_string(first)+"->"+to_string(nums[n-1]));
        }else{
            res.push_back(to_string(first));
        }
        return res;
    }
};