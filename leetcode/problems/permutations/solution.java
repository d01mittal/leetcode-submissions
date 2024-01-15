class Solution {
    public static void helper(boolean flag[], List<Integer> store, List<List<Integer>> ans, int nums[]){
        if(store.size()==nums.length){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                flag[i]=true;
                store.add(nums[i]);
                helper(flag,store,ans,nums);
                store.remove(store.size()-1);
                flag[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> store=new ArrayList<>();
        boolean flag[]=new boolean[nums.length];
        helper(flag,store,ans,nums);
        return ans;
    }
}