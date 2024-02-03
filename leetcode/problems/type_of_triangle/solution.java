class Solution {
    public String triangleType(int[] nums) {
        int n=nums.length;
        if(nums[0]==nums[1]&&nums[1]==nums[2])
            return "equilateral";
        int index=n-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=nums[i]+nums[j];
                if(sum<=nums[index--])
                    return "none";
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                    return "isosceles";
            }
        }
        return "scalene";
    }
}