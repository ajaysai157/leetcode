class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix=strs[0];
        int n=strs.size();
        for(int i=0;i<n;i++){
            while(!strs[i].starts_with(prefix)){
                prefix=prefix.substr(0,prefix.size()-1);
            }
        }
        return prefix;
    }
};