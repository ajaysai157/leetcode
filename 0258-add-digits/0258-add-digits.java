class Solution {
    public int addDigits(int num) {
        if(num<=9) return num;
        int temp=num;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        return addDigits(sum);
    }
}