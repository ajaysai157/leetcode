class Solution {
    public int countDigits(int num) {
        int temp=num;
        int cnt=0;
        while(temp>0){
            int rem=temp%10;
            if(rem!=0 && num%rem==0){
                cnt++;
            }
            temp/=10;
        }
        return cnt;
    }
}