class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        cnt=Counter(text)
        bal=Counter("balloon")
        ans=len(text)
        for i in "balloon":
            ans=min(ans, cnt[i]//bal[i])
        return ans
