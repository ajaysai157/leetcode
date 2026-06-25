class Solution {
    private boolean isPalindrome(String word){
        int left=0,right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPalindrome(s)){
                return s;
            }
        }
        return "";
    }
}