class Solution {
public:
    int firstHalf(vector<int>& nums,int target){
        int left=0,right=nums.size()-1,index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
                    index=mid;
                }
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return index;
    }
    int secondHalf(vector<int>& nums,int target){
        int left=0,right=nums.size()-1,index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    index=mid;
                }
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return index;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        return {firstHalf(nums,target),secondHalf(nums,target)};
    }
};