class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n=arr.size();
        vector<int> result(n);
        int largest=-1;
        for(int i=n-1;i>=0;i--){
            result[i]=largest;
            if(arr[i]>largest) largest=arr[i];
            if(largest>arr[i]){
                result[i]=largest;
            }
        }
        return result;
    }
};