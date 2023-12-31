class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int or=nums[i]|nums[j];
                if((or&1)==0)
                    return true;
            }
        }
        return false;
    }
}