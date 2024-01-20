class Solution {
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int minimumArrayLength(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n>2&&nums[0]!=nums[1])
            return 1;
        int number=nums[0];
        for(int i=0;i<n;i++)
            number=gcd(number,nums[i]);
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==number)
                cnt=cnt+1;
        }
        int ans=Math.max(1,(cnt+1)/2);
        return ans;
    }
}