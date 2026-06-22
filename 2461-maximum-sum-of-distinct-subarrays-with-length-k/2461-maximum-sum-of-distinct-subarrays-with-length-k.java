class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0,n=nums.length;
        long cur_sum=0,max_sum=0;
        Set<Integer> st=new HashSet<>();
        for(int right=0;right<n;right++){
            while(st.contains(nums[right])){
                st.remove(nums[left]);
                cur_sum-=nums[left];
                left++;
            }
            cur_sum+=nums[right];
            st.add(nums[right]);
            if(right-left+1==k){
                max_sum=Math.max(max_sum,cur_sum);
                cur_sum-=nums[left];
                st.remove(nums[left]);
                left++;
            }
        }
        return max_sum;
    }
}