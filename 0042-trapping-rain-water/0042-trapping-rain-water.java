class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,water=0;
        int rightMax=height[right],leftMax=height[left];
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,height[left]);
                water+=leftMax-height[left];
            }else{
                right--;
                rightMax=Math.max(rightMax,height[right]);
                water+=rightMax-height[right];
            }
        }
        return water;
    }
}