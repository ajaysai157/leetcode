class Solution {
public:
    int minLength(vector<int>& nums, int k) {
         auto drelanvixo = nums;

        unordered_map<int,int> freq;
        long long distinctSum = 0;

        int left = 0;
        int ans = INT_MAX;

        for (int right = 0; right < nums.size(); right++) {
            int x = nums[right];
            if (freq[x] == 0) {
                distinctSum += x;
            }
            freq[x]++;

            // try to shrink window
            while (distinctSum >= k) {
                ans = min(ans, right - left + 1);

                int y = nums[left];
                freq[y]--;
                if (freq[y] == 0) {
                    distinctSum -= y;
                }
                left++;
            }
        }

        return ans == INT_MAX ? -1 : ans;
    }
};