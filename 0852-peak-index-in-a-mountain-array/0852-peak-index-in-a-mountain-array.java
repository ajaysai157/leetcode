class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        if(n==3) return 1;
        int left=1,right=n-2;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid+1] > arr[mid]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}