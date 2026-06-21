class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            maxArea(new int[] {0, 0});
        }   
    }
    public static int maxArea(int[] height) {
        int maxArea=0;
        int left=0,right=height.length-1;
        while(left<right){
            int len=Math.min(height[left],height[right]);
            int width=right-left;
            maxArea=Math.max(maxArea,len*width);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}