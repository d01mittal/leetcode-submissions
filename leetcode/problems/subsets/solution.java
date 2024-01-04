class Solution {
    public static void helper(int i, int nums[], List<Integer> store, List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(store));
            return;
        }
        store.add(nums[i]);
        helper(i+1,nums,store,ans);
        store.remove(store.size()-1);
        helper(i+1,nums,store,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> store=new ArrayList<>();
        helper(0, nums, store, ans);
        return ans;
    }
}