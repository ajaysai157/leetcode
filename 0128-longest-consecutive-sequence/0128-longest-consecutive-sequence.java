class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max_cnt=0;
        for(Integer item: set){
            if(!set.contains(item-1)){
                int cur_cnt=1;
                int ele=item;
                while(set.contains(ele+1)){
                    ele+=1;
                    cur_cnt+=1;
                }
                max_cnt=Math.max(max_cnt,cur_cnt);
            }
        }
        return max_cnt;
    }
}
