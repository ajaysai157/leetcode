class Solution {
public:
    int maxArea(vector<int>& height) {
        int maximum=0;
        int left=0,right=height.size()-1;
        while(left<right){
            maximum=max(maximum,(right-left)*min(height[left],height[right]));

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maximum;
    }
};