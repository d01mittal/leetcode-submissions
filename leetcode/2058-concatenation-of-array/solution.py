class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans=[]
        # for i in range(2):
        #     for num in nums:
        #         ans.append(num)
        # return ans
        for i in range(len(nums)):
            ans.append(nums[i])
        for i in range(len(nums)):
            ans.append(nums[i])
        return ans
