class Solution {
    public int helper(int hash[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int freq:hash){
            if(freq>max)
            max=freq;
            if(freq>0&&freq<min)
            min=freq;
        }
        return max-min;
    }
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int hash[]=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                hash[ch-'a']++;
                ans+=helper(hash);
            }
        }
        return ans;
    }
}