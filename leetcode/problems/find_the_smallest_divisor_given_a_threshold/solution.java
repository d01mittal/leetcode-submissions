class Solution {
    public static boolean check(int nums[],int val,int threshold){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)(nums[i])/(double)(val));
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxnum=Math.max(maxnum,nums[i]);
        }
        int high=maxnum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,mid,threshold))
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
}