class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0,y=0,xor=0;
        int[] arr=new int[2];
        for(int num:nums){
            xor=xor^num;
        }
        int diff=xor&(-xor);
        for(int num:nums){
            if((num&diff)==0){
                x=x^num;
            }else{
                y=y^num;
            }
        }
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
}