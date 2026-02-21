class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        int i=0,j=0,k=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                swap(nums[i],nums[j]);
                j++;
            }
        }
        for(int i=j;i<k;){
            if(nums[i]==2){
                swap(nums[i],nums[k]);
                k--;
            }else{
                i++;
            }
        }
    }
};