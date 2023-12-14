class Solution {
    public static boolean possible(int bloomDay[],int mid,int m,int k){
        int n=bloomDay.length;
        int count=0;
        int nob=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid)
            count++;
            else{
                nob+=count/k;
                count=0;
            }
        }
        nob+=count/k;
        return nob>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        int n=bloomDay.length;
        if(val>n)
        return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k))
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
}