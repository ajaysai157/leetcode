class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> concatenated;
        concatenated.insert(concatenated.end(),nums.begin(),nums.end());
        concatenated.insert(concatenated.end(),nums.begin(),nums.end());
        return concatenated;
    }
};