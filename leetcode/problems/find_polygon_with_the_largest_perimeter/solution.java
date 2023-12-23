class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0,j=n-1;
        while(j>i+1){
            long sum=0;
            for(int k=i;k<j;k++){
                sum+=nums[k];
            }
            if(sum<=nums[j]){
                j--;
                continue;
            }
            else
                return sum+nums[j];
        }
        return -1;
    }
}