class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int n=nums.size();
        int fst_max=INT_MIN,sec_max=INT_MIN,thrd_max=INT_MIN,fst_min=INT_MAX,sec_min=INT_MAX;
        for(int i=0;i<n;i++){
            if(nums[i]>fst_max){
                thrd_max=sec_max;
                sec_max=fst_max;
                fst_max=nums[i];
            }else if(nums[i]<=fst_max && nums[i]>sec_max){
                thrd_max=sec_max;
                sec_max=nums[i];
            }else if(nums[i]<=sec_max && nums[i]>thrd_max){
                thrd_max=nums[i];
            }
            if(nums[i]<fst_min){
                sec_min=fst_min;
                fst_min=nums[i];
            }else if(nums[i]<sec_min){
                sec_min=nums[i];
            }
        }
        int result=max((fst_max*sec_max*thrd_max),(fst_max*fst_min*sec_min));
        return result;
    }
};