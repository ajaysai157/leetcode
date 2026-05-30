class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:nums){
            int rem=k-num;
            if(map.getOrDefault(rem,0)>0){
                count++;
                map.put(rem,map.get(rem)-1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return count;
    }
}