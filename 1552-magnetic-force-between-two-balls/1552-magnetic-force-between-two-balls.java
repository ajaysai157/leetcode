class Solution {
    private boolean possible(int[] position,int dist,int k){
        int ballCount=1,lastBall=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastBall>=dist){
                ballCount++;
                lastBall=position[i];
            }
        }
        return ballCount>=k;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1,right=position[position.length-1];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(position,mid,m)){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }
}