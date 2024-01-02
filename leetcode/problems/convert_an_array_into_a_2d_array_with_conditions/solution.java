class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int help[]=new int[nums.length+1];
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int c:nums){
            if(help[c]>=ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(help[c]).add(c);
            help[c]++;
        }
        return ans;
    }
}