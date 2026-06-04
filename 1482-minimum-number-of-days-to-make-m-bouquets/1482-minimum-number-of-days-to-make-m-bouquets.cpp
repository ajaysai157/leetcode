class Solution {
public:
    bool bloom(vector<int>& bloomDay,int day, int m, int k){
        int cnt=0,boquets=0;
        for(int n:bloomDay){
            if(n<=day){
                cnt++;
                if(cnt==k){
                    boquets++;
                    cnt=0;
                }
            }else{
                cnt=0;
            }
        }
        return boquets>=m;
    }

    int minDays(vector<int>& bloomDay, int m, int k) {
        long long val=m*1LL*k*1LL;
        if(val>bloomDay.size()){
            return -1;
        }
        int left=INT_MAX,right=INT_MIN;
        for(int x:bloomDay){
            if(x>right){
                right=x;
            }if(x<left){
                left=x;
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(bloom(bloomDay,mid,m,k)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
};