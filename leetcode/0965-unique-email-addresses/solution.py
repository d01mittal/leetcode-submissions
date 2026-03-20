class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        ans=set()
        for e in emails:
            i, local=0, ""
            while e[i] not in ["@", "+"]:
                if e[i]!=".":
                    local+=e[i]
                i+=1
            while e[i]!="@":
                i+=1
            domain=e[i+1:]
            ans.add((local,domain))
        return len(ans)
