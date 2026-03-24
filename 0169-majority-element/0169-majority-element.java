class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int highest=Integer.MIN_VALUE,element=0;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()>highest){
                highest=entry.getValue();
                element=entry.getKey();
            }
        }
        return element;
    }
}