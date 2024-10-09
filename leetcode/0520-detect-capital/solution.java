class Solution {
    public boolean detectCapitalUse(String word) {
        int len=word.length();
        char c=word.charAt(0);
        int ca=0;
        if(c>=65&&c<=91){
            ca++;
        }
        for(int i=1;i<len;i++){
            char ch=word.charAt(i);
            if(ch>=65&&ch<=91){
                ca++;
            }
        }
        if(ca==len) return true;
        if(ca==0) return true;
        if((word.charAt(0)>=65&&word.charAt(0)<=91)&&ca==1) return true;
        return false;
    }
}
