class Solution {
    public int missingInteger(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        int sum=nums[0];
        int max=sum;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
                max=Math.max(max,sum);
            }
            else
                break;
        }
        while(mpp.containsKey(max)){
            max++;
        }
        return max;
    }
}