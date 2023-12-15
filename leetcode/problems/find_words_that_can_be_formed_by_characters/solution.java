class Solution {
    public int countCharacters(String[] words, String chars) {
        int hash[]=new int[26];
        int ans=0;
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            hash[ch-'a']++;
        }
        for(String s:words){
            if(possible(s,hash))
            ans+=s.length();
        }
        return ans;
    }
    public boolean possible(String word,int hash[]){
        int count[]=new int[26];
        for(int i=0;i<word.length();i++){
            int ch=word.charAt(i);
            count[ch-'a']++;
            if(count[ch-'a']>hash[ch-'a'])
            return false;
        }
        return true;
    }
}