class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> m1;
        unordered_map<char,char> m2;
        for(int i=0;i<s.size();i++){
            char k1=s[i];
            char k2=t[i];
            if(m1.find(k1) != m1.end()){
                if(m1[k1]!=k2)
                    return false;
            }else{
                m1[k1]=k2;
            }
            if(m2.find(k2) != m2.end()){
                if(m2[k2]!=k1)
                    return false;
            }else{
                m2[k2]=k1;
            }
        }
        return true;
    }
};