class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res=new int[2];
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            int curr_count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    curr_count++;
                }
            }
            if(curr_count>res[1]){
                res[0]=i;
                res[1]=curr_count;
            }
        }
        return res;
    }
}