class Solution {
    public static int max(int piles[],int n){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maximum=Math.max(maximum,piles[i]);
        }
        return maximum;
    }
    public static int eatall(int piles[],int hour){
        int totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+=Math.ceil((double)(piles[i])/(double)(hour));
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=max(piles,n);
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalhours=eatall(piles,mid);
            if(totalhours<=h)
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
}