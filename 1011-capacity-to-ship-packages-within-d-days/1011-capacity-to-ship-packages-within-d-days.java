class Solution {
    private int calcDays(int[] arr,int capacity){
        int days=1,sum=0;
        for(int weight : arr){
            if(sum+weight<=capacity){
                sum+=weight;
            }else{
                days++;
                sum=weight;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int right=0,left=Integer.MIN_VALUE;
        for(int num:weights){
            right+=num;
            if(num>left){
                left=num;
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(calcDays(weights,mid)<=days){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}