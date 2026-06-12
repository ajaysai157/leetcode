class Solution {
    public int maxDepth(String s) {
        int level=0,maxLevel=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                level++;
            }else if(ch==')'){
                maxLevel=Math.max(maxLevel,level);
                level--;
            }
        }
        return maxLevel;
    }
}