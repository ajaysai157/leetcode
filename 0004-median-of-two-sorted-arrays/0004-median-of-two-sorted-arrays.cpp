class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        nums1.insert(nums1.end(),nums2.begin(),nums2.end());
        sort(nums1.begin(),nums1.end());
        int n=nums1.size();
        if(n%2!=0){
            int index=n/2;
            return nums1[index];
        }else{
            double index=nums1[int(n/2-1)]+nums1[int(n/2)];
            return index/2;
        }
    }
};