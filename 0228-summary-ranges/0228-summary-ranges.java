class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> arr=new ArrayList<>();
        if(n==0){return arr;}
        int first=nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]+1!=nums[i+1]){
                if(first!=nums[i]){
                    arr.add(first+"->"+nums[i]);
                }else{
                    arr.add(String.valueOf(nums[i]));
                }
                first=nums[i+1];
            }
        }
        if(first!=nums[n-1]){
            arr.add(first+"->"+nums[n-1]);
        }else{
            arr.add(String.valueOf(first));
        }
        return arr;
    }
}