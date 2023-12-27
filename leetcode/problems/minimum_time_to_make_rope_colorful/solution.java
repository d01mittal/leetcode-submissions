class Solution {
    public int minCost(String colors, int[] neededTime) {
        int len=colors.length();
        int minTime=0;
        for(int i=1;i<len;i++){
            char ch=colors.charAt(i-1);
            char c=colors.charAt(i);
            if(ch==c){
                minTime+=Math.min(neededTime[i-1],neededTime[i]);
                neededTime[i]=Math.max(neededTime[i-1],neededTime[i]);
            }
        }
        return minTime;
    }
}