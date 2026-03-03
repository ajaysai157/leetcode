class Solution {
public:
    int minimumChairs(string s) {
        int n=s.size();
        int max_count=0,curr_count=0;
        for(int i=0;i<n;i++){
            if(s[i]=='E'){
                curr_count++;
            }else{
                curr_count--;
            }
            max_count=max(max_count,curr_count);
        }
        return max_count;
    }
};