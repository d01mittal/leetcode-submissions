class Solution:
    def countSeniors(self, details: List[str]) -> int:
        ans=0
        for i in details:
            c=ord(i[11])-ord("0")
            d=ord(i[12])-ord("0")
            num=c*10+d
            if num>60:
                ans+=1
        return ans
