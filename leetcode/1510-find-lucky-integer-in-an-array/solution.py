class Solution:
    def findLucky(self, arr: List[int]) -> int:
        count=Counter(arr)
        ans=-1
        for num in count:
            if num==count[num]:
                ans=max(num, ans)
        return ans
