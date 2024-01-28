class Solution {
    public int countKeyChanges(String s) {
        String str=s.toLowerCase();
        int cnt=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1))cnt++;
        }
        return cnt;
    }
}