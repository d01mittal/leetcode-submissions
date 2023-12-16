class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)
        return false;
        int hash[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hash[ch-'a']++;
        }
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            if(hash[ch-'a']<=0)
            return false;
            else
            hash[ch-'a']--;
        }
        return true;
    }
}