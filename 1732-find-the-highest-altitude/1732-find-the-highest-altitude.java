class Solution {
    public int largestAltitude(int[] gain) {
        int cur_alt=0,max_alt=0;
        for(var x : gain){
            cur_alt+=x;
            max_alt=Math.max(cur_alt,max_alt);
        }
        return max_alt;
    }
}