class Solution {
public:
    string reverseVowels(string s) {
        int n=s.size();
        int j=n-1,i=0;
        string vowels="aeiouAEIOU";
        while(i<j){
            if(vowels.find(s[i])!=string::npos and vowels.find(s[j])!=string::npos){
                swap(s[i],s[j]);
                j--;
                i++;
            }else if(vowels.find(s[j])==string::npos){
                j--;
            }else if(vowels.find(s[i])==string::npos){
                i++;
            }
        }
        return s;
    }
};