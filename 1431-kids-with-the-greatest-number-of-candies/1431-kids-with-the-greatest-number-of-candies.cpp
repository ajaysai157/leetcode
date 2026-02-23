class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int maxVal=*max_element(candies.begin(),candies.end());
        vector<bool> great(candies.size());
        for(int i=0;i<candies.size();i++){
            if(candies[i]+extraCandies>=maxVal) great[i]=true;
            else great[i]=false;
        }

        return great;
    }
};