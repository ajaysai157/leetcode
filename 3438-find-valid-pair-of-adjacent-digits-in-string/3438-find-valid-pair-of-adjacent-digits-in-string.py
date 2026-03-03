from collections import Counter

class Solution:
    def findValidPair(self, s):
        # Count the frequency of each digit in the string
        count = Counter(s)
        
        # Iterate through the string to check adjacent pairs
        for i in range(len(s) - 1):
            # Get the current pair of adjacent digits
            d1, d2 = s[i], s[i+1]
            
            # Check if the digits are different and their frequency matches their numeric value
            if d1 != d2 and count[d1] == int(d1) and count[d2] == int(d2):
                return d1 + d2
        
        # If no valid pair is found, return an empty string
        return ""
