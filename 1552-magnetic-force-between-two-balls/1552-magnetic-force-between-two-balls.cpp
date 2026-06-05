class Solution {
public:
    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(),position.end());
        int left=1,right=position[position.size()-1];
        while(left<=right){
            int mid=left+(right-left)/2;
            int cnt=1,last=position[0];
            for(int x:position){
                if(x-last>=mid){
                    cnt++;
                    last=x;
                }
            }
            if(cnt>=m){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }
};