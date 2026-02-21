class Solution {
public:

    void expandFromCenter(string &s, int left, int right, int &start, int &maxLen)
    {
        int n = s.size();
        while (left >= 0 && right < n && s[left] == s[right]) {
            int currLen = right - left + 1;
            if (currLen > maxLen) {
                start = left;
                maxLen = currLen;
            }
            left--;
            right++;
        }
    }

    string longestPalindrome(string s) {
        int n = s.size();
        if (n == 0) return "";
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            expandFromCenter(s, i, i, start, maxLen);
            expandFromCenter(s, i, i + 1, start, maxLen);
        }

        return s.substr(start, maxLen);
    }
};