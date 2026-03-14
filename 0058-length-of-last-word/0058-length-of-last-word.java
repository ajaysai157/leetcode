class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int res=s.lastIndexOf(' ');
        return s.length()-res-1;
    }
}