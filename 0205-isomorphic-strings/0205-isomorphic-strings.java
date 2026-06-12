class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] pos1 = new int[256];
        int[] pos2 = new int[256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(pos1[c1] != pos2[c2]){
                return false;
            }
            pos1[c1]=i+1;
            pos2[c2]=i+1;
        }
        return true;
    }
}