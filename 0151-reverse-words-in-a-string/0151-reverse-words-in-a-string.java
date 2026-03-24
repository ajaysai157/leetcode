class Solution {
    public String reverseWords(String s) {
        String res="",curr_res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                curr_res+=s.charAt(i);
            }
            if(s.charAt(i)==' ' || i==s.length()-1){
                if(!curr_res.equals("")){
                    if(!res.equals("")){
                        res=" "+res;
                    }
                    res=curr_res+res;
                    curr_res="";
                }
            }
        }
        return res;
    }
}