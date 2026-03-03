class Solution {
public:
    string reverseWords(string s) {
        long length=s.size();
        string res="";
        string curr_res="";
        for(long i=0;i<length;i++){
            if(s[i]!=' '){
                curr_res+=s[i];
            }
            if(s[i]==' ' || i==length-1){
                if(!curr_res.empty()){
                    if(!res.empty()) res=" "+res;
                    res=curr_res+res;
                    curr_res="";
                }
            }
        }
        return res;
    }
};