class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int cost=nums[0];
        Arrays.sort(nums);
        if(cost==nums[0]){
            return cost+nums[1]+nums[2];
        }
        if(cost==nums[1])
            return cost+nums[0]+nums[2];
        return cost+nums[0]+nums[1];
    }
}