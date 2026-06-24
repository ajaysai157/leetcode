class Solution {
    private int atMost(int[] nums,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0,i=0;
        for(int j=0;j<nums.length;j++){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.size()>k){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)-1);
                if(mp.get(nums[i])==0) mp.remove(nums[i]);
                i++;
            }
            ans+=j-i+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}