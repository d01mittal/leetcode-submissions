class Solution {
    public void helper(int i, int candidates[], int target, List<Integer> store, List<List<Integer>> ans){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(store));
                return;
            }
            return;
        }
        if(candidates[i]<=target){
            store.add(candidates[i]);
            helper(i,candidates,target-candidates[i],store,ans);
            store.remove(store.size()-1);
        }
        helper(i+1,candidates,target,store,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        int n=candidates.length;
        List<Integer> store=new ArrayList<>();
        helper(0,candidates,target,store,ans);
        return ans;
    }
}