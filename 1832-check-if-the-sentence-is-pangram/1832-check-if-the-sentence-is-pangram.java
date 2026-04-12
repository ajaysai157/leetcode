class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(!sentence.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}