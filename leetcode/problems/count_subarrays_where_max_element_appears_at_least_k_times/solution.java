class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        long output=0;
        int count=0;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        while(b<nums.length){
            if(nums[b]==max)
                count++;
            if(count>=k){
                while(count>=k){
                    output+=nums.length-b;
                    if(nums[a]==max)
                        count--;
                    a++;
                }
            }
            b++;
        }
        return output;
    }
}