class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        vector<vector<int>> result;
        int n=arr.size();
        int min_diff=abs(arr[0]-arr[1]);
        for(int j=0;j<n-1;j++){
            int diff=abs(arr[j]-arr[j+1]);
            if(min_diff>diff){
                min_diff=diff;
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]==min_diff){
                result.push_back({arr[i],arr[i+1]});
            }
        }
        return result;
    }
};