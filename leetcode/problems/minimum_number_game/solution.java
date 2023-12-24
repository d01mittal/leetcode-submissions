class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans[]=new int[n];
        int index=0;
        for(int i=0;i<n-1;i=i+2){
            int j=i+1;
            ans[index]=nums[j];
            index++;
            ans[index]=nums[i];
            index++;
        }
        return ans;
    }
}