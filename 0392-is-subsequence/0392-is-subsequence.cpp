class Solution {
public:
    bool isSubsequence(string s, string t) {
        int count=0,idx=0;
        for(int i=0;i<t.size();i++){
            if(s[idx]==t[i]){
                count++;
                idx++;
            }
        }
        return count==s.size();
    }
};