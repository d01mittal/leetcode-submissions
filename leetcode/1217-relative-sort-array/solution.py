class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        cnt=Counter(arr1)
        cnt = dict(sorted(cnt.items()))
        ans=[]
        for i in arr2:
            for j in range(cnt[i]):
                ans.append(i)
            cnt[i]=0
        for i in cnt:
            if cnt[i]!=0:
                for j in range(cnt[i]):
                    ans.append(i)
                cnt[i]=0
        return ans
