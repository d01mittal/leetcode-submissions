class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        temp=set()
        for i in range(0, len(nums)):
            if nums[i] in temp:
                return True
            else:
                temp.add(nums[i])
        return False
