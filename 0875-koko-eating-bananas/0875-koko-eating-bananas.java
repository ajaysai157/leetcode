class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int left=1,right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(calHours(piles,mid)<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    private long calHours(int[] arr,int hrs){
        long totalHrs=0;
        for(int i=0;i<arr.length;i++){
            totalHrs=totalHrs+(arr[i]+hrs-1)/hrs;
        }
        return totalHrs;
    }
}