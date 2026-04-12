class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character,Integer> freq=new HashMap<>();
        for( char ch : sentence.toCharArray()){
            if(ch>='a' && ch<='z'){
                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }else if(ch>='A' && ch<='Z'){
                ch=(char)(ch-'A'+'a');
                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }
        }
        return freq.size()==26;
    }
}