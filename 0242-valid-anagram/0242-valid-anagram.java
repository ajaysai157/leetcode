class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] res=new int[26];
        for(char ch:s.toCharArray()){
            res[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            res[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(res[i]!=0){
                return false;
            }
        }
        return true;
    }
}