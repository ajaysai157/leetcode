class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1,right=position[position.length-1];
        while(left<=right){
            int mid=left+(right-left)/2;
            int ballCount=1,lastBall=position[0];
            for(int ball:position){
                if(ball-lastBall>=mid){
                    ballCount++;
                    lastBall=ball;
                }
            }
            if(ballCount>=m){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }
}