class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] pic=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pic[i][j]=image[i][n-j-1];
                if(pic[i][j]==0){
                    pic[i][j]=1;
                }else{
                    pic[i][j]=0;
                }
            }
        }
        return pic;
    }
}