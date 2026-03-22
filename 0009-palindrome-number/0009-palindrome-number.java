public class Solution {

    public boolean isPalindrome(int n) {
        if (n < 0) return false; // negative numbers are not palindromes

        int revNum = 0, dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = revNum * 10 + ld;
            n /= 10;
        }
        return dup == revNum;
    }
}
