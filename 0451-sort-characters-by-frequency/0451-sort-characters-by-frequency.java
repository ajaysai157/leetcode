class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> li=new ArrayList<>(map.keySet());
        li.sort((a,b)->map.get(b)-map.get(a));
        StringBuilder str=new StringBuilder();
        for(char ch:li){
            for(int i=0;i<map.get(ch);i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}