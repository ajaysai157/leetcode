class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder res=new StringBuilder();
        int n=strs.length;
        String first=strs[0];
        String second=strs[n-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==second.charAt(i)){
                res.append(first.charAt(i));
            }else{
                break;
            }
        }
        return res.toString();

    }
}