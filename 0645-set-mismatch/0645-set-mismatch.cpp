class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n=nums.size();
        int expected=(n*(n+1))/2,actual=0;
        sort(nums.begin(),nums.end());
        int duplicate=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                duplicate=nums[i];
                break;
            }
        }
        for(int i=0;i<n;i++){
            actual+=nums[i];
        }
        int missed=(expected-actual)+duplicate;
        return {duplicate,missed};
    }
};