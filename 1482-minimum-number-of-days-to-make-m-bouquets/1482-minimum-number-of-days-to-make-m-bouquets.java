class Solution {
    private boolean bloom(int[] bloomDay,int day,int m,int flowers){
        int n=bloomDay.length,cnt=0,boquets=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }else{
                boquets=boquets+(cnt/flowers);
                cnt=0;
            }
        }
        boquets=boquets+(cnt/flowers);
        return boquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int left=Integer.MAX_VALUE,right=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(right<bloomDay[i]){
                right=bloomDay[i];
            }
            if(bloomDay[i]<left){
                left=bloomDay[i];
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(bloom(bloomDay,mid,m,k)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}