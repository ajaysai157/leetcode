class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,maxLen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(map.containsKey(ch)){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
                left++;
            }
            map.put(ch,1);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}