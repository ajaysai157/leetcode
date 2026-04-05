class Solution {
    public boolean checkString(String s) {
        boolean flag=false;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(flag) return false;
            }else{
                flag=true;
            }
        }
        return true;
    }
}