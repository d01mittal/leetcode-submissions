class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int ans=0;
        for(int i=len-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
                if(ans==0)
                    continue;
                else
                    break;
            }
            else
                ans++;
        }
        return ans;
    }
}
