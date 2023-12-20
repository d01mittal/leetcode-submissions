class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        int ans=Integer.MAX_VALUE;
        int expense=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=prices[i]+prices[j];
                ans=Math.min(ans,sum);
            }
        }
        expense=money-ans;
        if(expense>=0)
        return expense;
        return money;
    }
}