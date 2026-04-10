class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length,max_wealth=0,ind_wealth=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<accounts[i].length;j++){
                ind_wealth+=accounts[i][j];
            }
            max_wealth=Math.max(max_wealth,ind_wealth);
            ind_wealth=0;
        }
        return max_wealth;
    }
}