class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n=len(arr)
        maxr=-1
        for i in range(n-1, -1, -1):
            curr=arr[i]
            arr[i]=maxr
            maxr=max(maxr, curr)
        return arr
