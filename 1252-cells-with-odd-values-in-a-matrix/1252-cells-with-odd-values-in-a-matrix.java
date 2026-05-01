class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] nums=new int[m][n];
        int count=0;
        for(int[] arr:indices){
            for(int i=0;i<n;i++){
                nums[arr[0]][i]++;
            }
            for(int j=0;j<m;j++){
                nums[j][arr[1]]++;
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j]%2!=0){
                    count++;
                }
            }
         }
        return count;
    }
}