class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)high=mid-1;
            else low=mid+1;
        }
        int lb=low;
        if((lb==n)||(nums[lb]!=target)){
            return ans;
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target)low=mid+1;
            else high=mid-1;
        }
        int up=low;
        ans[0]=lb;
        ans[1]=up-1;
        return ans;
    }
}