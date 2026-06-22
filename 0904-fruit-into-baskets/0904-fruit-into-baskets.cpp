class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int left=0,maxLen=0,i=0,n=fruits.size();
        unordered_map<int,int> mp;
        while(i<n){
            mp[fruits[i]]++;
            while(mp.size()>2){
                mp[fruits[left]]--;
                if(mp[fruits[left]]==0) mp.erase(fruits[left]);
                left++;
            }
            maxLen=max(maxLen,i-left+1);
            i++;
        }
        return maxLen;
    }
};