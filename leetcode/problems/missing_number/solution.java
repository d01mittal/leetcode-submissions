class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        int hash[]=new int[n+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]-0]++;
        }
        for(int i=0;i<n+1;i++){
            if(hash[i]==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}