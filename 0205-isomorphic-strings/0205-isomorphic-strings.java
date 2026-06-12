class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i=0;i<s.length();i++){
            if(t.indexOf(t.charAt(i)) != s.indexOf(s.charAt(i)))
                return false;
        }
        return true;
    }
}