class Solution {
public:
    int trap(vector<int>& height) {
        int left=0,right=height.size()-1,water=0;
        int rightMax=height[right],leftMax=height[left];
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=max(leftMax,height[left]);
                water+=leftMax-height[left];
            }else{
                right--;
                rightMax=max(rightMax,height[right]);
                water+=rightMax-height[right];
            }
        }
        return water;
    }
};