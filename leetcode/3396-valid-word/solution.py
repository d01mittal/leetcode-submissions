class Solution:
    def isValid(self, word: str) -> bool:
        n=len(word)
        vowel, consonant=0,0
        word=word.lower()
        if n<3:
            return False
        for i in range(n):
            if (ord(word[i])>=48 and ord(word[i])<=57) or (ord(word[i])>=97 and ord(word[i])<=122):
                if word[i]=='a' or word[i]=='e' or word[i]=='i' or word[i]=='o' or word[i]=='u':
                    vowel+=1
                    continue
                if word[i]!='a' and word[i]!='e' and word[i]!='i' and word[i]!='o' and word[i]!='u' and not((ord(word[i])>=48 and ord(word[i])<=57)):
                    consonant+=1
                    continue
            else:
                return False
        if vowel>=1 and consonant>=1:
            return True
        return False
