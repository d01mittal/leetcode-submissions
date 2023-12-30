class Solution {
    public char lowercase(char ch){
        int num=0;
        if((ch>=97&&ch<=122)||(ch>=48&&ch<=57))
        return ch;
        else
        num=(int)ch-'A'+'a';
        return (char)num;
    }
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57))
            str+=ch;
        }
        int len=str.length();
        int i=0,l=len-1;
        while(i<l){
            if(lowercase(str.charAt(i))!=lowercase(str.charAt(l)))
            return false;
            else{
                i++;
                l--;
            }
        }
        return true;
    }
}