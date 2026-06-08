class Solution {
    private int maxElement(int[][]mat, int n, int m,int col){
        int maxValue=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>maxValue){
                maxValue=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int low=0,high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rowIndex=maxElement(mat,n,m,mid);
            int left=mid-1>=0?mat[rowIndex][mid-1]:-1;
            int right=mid+1<m?mat[rowIndex][mid+1]:-1;
            if(mat[rowIndex][mid]>left && mat[rowIndex][mid]>right){
                return new int[]{rowIndex,mid};
            }else if(mat[rowIndex][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}