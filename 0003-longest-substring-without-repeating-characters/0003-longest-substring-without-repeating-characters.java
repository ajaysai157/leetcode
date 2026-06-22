class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] idx=new int[128];
        int len=0,l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            l=Math.max(l,idx[c]);
            len=Math.max(len,r-l+1);
            idx[c]=r+1;
        }
        return len;
    }
}