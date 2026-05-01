class Solution {
    public int largestAltitude(int[] gain) {
        int curr_altitude=0,max_altitude=0;
        for(int i=0;i<gain.length;i++){
            curr_altitude+=gain[i];
            max_altitude=Math.max(curr_altitude,max_altitude);
        }
        return max_altitude;
    }
}