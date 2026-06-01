class Solution {
public:
    int gcdOfTwonumbers(int a,int b){
        return (b==0)?a:gcdOfTwonumbers(b,a%b);
    }
    int findGCD(vector<int>& nums) {
        int min=INT_MAX,max=INT_MIN;
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        return gcdOfTwonumbers(min,max);
    }
};