class Solution {
    public int maxScore(String s) {
        int len=s.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++){
            int z=0;
            int o=0;
            String zeroes=s.substring(0,i+1);
            String ones=s.substring(i+1);
            for(int j=0;j<zeroes.length();j++){
                char ch=zeroes.charAt(j);
                if(ch-'0'==0)
                z++;
            }
            for(int k=0;k<ones.length();k++){
                char ch=ones.charAt(k);
                if(ch-'0'==1)
                o++;
            }
            int sum=z+o;
            max=Math.max(max,sum);
        }
        return max;
    }
}