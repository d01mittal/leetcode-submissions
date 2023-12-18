class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[n-1];
        int b=nums[n-2];
        int c=nums[0];
        int d=nums[1];
        int max=a*b;
        int min=c*d;
        return max-min;
    }
}