class Solution {
public:
    string removeOuterParentheses(string s) {
        int level=0;
        string res="";
        for(char c:s){
            if(c=='('){
                if(level>0){
                    res+=c;
                }
                level++;
            }else if(c==')'){
                level--;
                if(level>0){
                    res+=c;
                }
            }
        }
        return res;
    }
};