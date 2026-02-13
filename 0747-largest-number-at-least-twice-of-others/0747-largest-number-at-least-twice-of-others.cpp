class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int n=nums.size();
        bool is_true=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(nums[i]<2*nums[j]){
                        is_true=false;
                    }
                }
            }
            if(is_true){
                return i;
            }
            is_true=true;
        }
        return -1;
    }
};