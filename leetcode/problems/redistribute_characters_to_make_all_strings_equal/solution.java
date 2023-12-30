class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1)
        return true;
        int totalcharcount=0;
        for(String s:words)
        totalcharcount+=s.length();
        if(totalcharcount%words.length!=0)
        return false;
        int mymap[]=new int[26];
        for(String s:words){
            for(char c: s.toCharArray()){
                mymap[c-'a']++;
            }
        }
        for(int i:mymap){
            if(i%words.length!=0)
            return false;
        }
        return true;
    }
}