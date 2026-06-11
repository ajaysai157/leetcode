class Solution {
public:
    string largestOddNumber(string num) {
        int largestOdd=0;
        string curr="";
        for(int i=num.size()-1;i>=0;i--){
            if((num[i]-'0')%2==1){
                return num.substr(0,i+1);
            }
        }
        return "";
    }
};