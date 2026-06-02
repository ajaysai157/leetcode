class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int left=1,right=n-2;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid+1] > arr[mid]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}