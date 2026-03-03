class Solution {
public:
    int maxPower(string s) {
        int n=s.size();
        int max_chars=0,curr_chars=1;
        for(int i=1;i<n;i++){
            if(s[i-1]==s[i]){
                curr_chars++;
            }else{
                max_chars=max(max_chars,curr_chars);
                curr_chars=1;
            }
        }
        max_chars=max(max_chars,curr_chars);
        return max_chars;
    }
};