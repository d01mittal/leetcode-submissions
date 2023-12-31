class Solution {
    public boolean isIsomorphic(String str1, String str2) {
        HashMap<Character,Character> mpp=new HashMap<>();
        if(str1.length()!=str2.length())
        return false;
        int i=0;
        while(i<str1.length()){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(mpp.containsKey(ch1)){
                if(mpp.get(ch1)!=ch2)
                return false;
            }
            else if(mpp.containsValue(ch2))
            return false;
            else
            mpp.put(ch1,ch2);
            i++;
        }
        return true;
    }
}