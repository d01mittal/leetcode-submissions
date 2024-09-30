class Solution {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length();
        int l2=needle.length();
        if(l1<l2) return -1;
        int i=0, j=0, k=0;
        while(i<l1 && j<l2){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++; j++;
            }
            else{
                i=k+1;
                j=0;
                k=i;
            }
        }
        if(j==l2) return k;
        return -1;
    }
}
