class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count_ones = 0
        last_count = 0
        current_count = 0
        for elem in nums:
            if elem == 1:
                current_count += 1
                if last_count < current_count:
                    last_count = current_count
            else:
                current_count = 0
        return last_count
