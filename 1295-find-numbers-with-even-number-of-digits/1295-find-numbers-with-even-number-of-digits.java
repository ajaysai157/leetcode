class Solution {
    public boolean oddOrEven(int n) {
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(oddOrEven(num)){
                count++;
            }
        }
        return count;
    }
}