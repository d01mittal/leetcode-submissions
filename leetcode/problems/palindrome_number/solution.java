class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            ans+=ch;
        }
        if(ans.compareTo(str)!=0)
        return false;
        return true;
    }
}