class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        smallest_integer = min(nums)
        largest_integer = max(nums)
        missing=[]
        for i in range(smallest_integer,largest_integer+1):
            if i not in nums:
                missing.append(i)
        return missing
