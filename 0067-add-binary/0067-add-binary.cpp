class Solution {
public:
    string addBinary(string a, string b) {
        if(a.size()<b.size()){
            a.insert(0,b.size()-a.size(),'0');
        }else{
            b.insert(0,a.size()-b.size(),'0');
        }
        int n = a.size();
        string result="";
        int carry=0;
        for(int i=n-1;i>=0;i--){
            int total=(a[i]-'0') + (b[i]-'0') + carry;
            if(total==0){
                result='0'+result;
                carry=0;
            }else if(total==1){
                result='1'+result;
                carry=0;
            }else if(total==2){
                result='0'+result;
                carry=1;
            }else if(total==3){
                result='1'+result;
                carry=1;
            }
        }
        if(carry==1){
            result='1'+result;
        }
        return result;
    }
};