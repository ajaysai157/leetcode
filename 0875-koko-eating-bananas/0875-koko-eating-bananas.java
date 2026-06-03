class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            right=Math.max(right,piles[i]);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(calcHours(piles,mid,h)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean calcHours(int[] arr,int hrs,int h){
        long totalHrs=0;
        for(int i=0;i<arr.length;i++){
            totalHrs=totalHrs+(arr[i]+hrs-1)/hrs;
        }
        return totalHrs<=h;
    }
}