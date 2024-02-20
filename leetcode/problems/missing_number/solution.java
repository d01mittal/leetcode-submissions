class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        // int hash[]=new int[n+1];
        // int p=0;
        // for(int i=0;i<nums.length;i++){
        //     hash[nums[i]-0]++;
        // }
        // for(int i=0;i<n+1;i++){
        //     if(hash[i]==0){
        //     p=i;
        //     break;
        //     }
        // }
        for(int i=0;i<n;i++){
            xor^=i^nums[i];
        }
        return xor^n;
    }
}