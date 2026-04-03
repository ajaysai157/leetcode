class Solution {
    public int countPairs(int[] deliciousness) {
        Map<Integer,Integer> freq=new HashMap<>();
        int count=0;
        int MOD = 1_000_000_007;
        for(int num : deliciousness){
            for(int power=1;power<=(1<<21);power<<=1){
                int target=power-num;
                if(freq.containsKey(target)){
                    count=(count+freq.get(target))%MOD;
                }
            }
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        return count;
    }
}