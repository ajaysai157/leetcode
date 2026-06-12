class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int pos1[256];
        int pos2[256];
        for(int i=0;i<s.size();i++){
            if(pos1[s[i]] != pos2[t[i]]){
                return false;
            }
            pos1[s[i]]=i+1;
            pos2[t[i]]=i+1;
        }
        return true;
    }
};