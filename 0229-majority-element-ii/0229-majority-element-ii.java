class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int maj=n/3;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>maj){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}