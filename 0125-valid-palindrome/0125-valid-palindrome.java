class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int left=0,right=s.length()-1;
        while(left<right){
            char ch1=s.charAt(left);
            char ch2=s.charAt(right);
            if(!Character.isLetterOrDigit(ch1)){
                left++;
            }else if(!Character.isLetterOrDigit(ch2)){
                right--;
            }else{
                if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
                    return false;
                }
                left++;
                right--;
            }           
        }
        return true;

    }
}