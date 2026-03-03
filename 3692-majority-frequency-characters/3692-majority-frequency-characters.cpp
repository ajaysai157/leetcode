class Solution {
public:
    string majorityFrequencyGroup(string s) {
        // Step 1: Count frequency of each character
        unordered_map<char, int> freq;
        for (char c : s) {
            freq[c]++;
        }

        // Step 2: Group characters by their frequency
        unordered_map<int, vector<char>> groups;
        for (auto &p : freq) {
            groups[p.second].push_back(p.first);
        }

        // Step 3: Find majority group
        int bestSize = 0;
        int bestFreq = 0;
        vector<char> bestGroup;

        for (auto &g : groups) {
            int k = g.first;              // frequency
            int size = g.second.size();   // number of distinct chars

            // Pick if larger size OR (same size but higher frequency)
            if (size > bestSize || (size == bestSize && k > bestFreq)) {
                bestSize = size;
                bestFreq = k;
                bestGroup = g.second;
            }
        }

        // Step 4: Sort group for deterministic output
        sort(bestGroup.begin(), bestGroup.end());

        // Step 5: Build result string
        string result;
        for (char c : bestGroup) {
            result.push_back(c);
        }

        return result;
    }
};
