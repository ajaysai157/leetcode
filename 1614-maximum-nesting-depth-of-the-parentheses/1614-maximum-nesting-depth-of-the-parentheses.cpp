class Solution {
public:
    int maxDepth(string s) {
        int cnt=0,maxCnt=0;
        for(char c:s){
            if(c=='('){
                cnt++;
            }else if(c==')'){
                maxCnt=max(cnt,maxCnt);
                cnt--;
            }
        }
        return maxCnt;
    }
};