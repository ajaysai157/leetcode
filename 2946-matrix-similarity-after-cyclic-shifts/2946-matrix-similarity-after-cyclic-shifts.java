class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int i=0;i<mat.length;i++) {
            int n=mat[i].length;
            for(int j=0;j<n;j++) {
                if(mat[i][j]!=mat[i][(j+k)%n]) {
                    return false;
                }
            }
        }
        return true;
    }
}