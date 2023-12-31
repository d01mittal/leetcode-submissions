class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                char ch2=s.charAt(j);
                if(ch1==ch2){
                    int len=j-i-1;
                    max=Math.max(max,len);
                }
            }
        }
        if(max==Integer.MIN_VALUE)
        return -1;
        return max;
    }
}