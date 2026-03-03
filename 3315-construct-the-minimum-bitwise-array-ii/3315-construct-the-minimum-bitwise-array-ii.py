class Solution:
    def minBitwiseArray(self, nums: List[int]) -> List[int]:
        res = []
        for x in nums:
            if x == 2: # Special case: 2 is even and has no solution
                res.append(-1)
            else:
                res.append(x - (((x + 1) & ~x) >> 1))
        return res