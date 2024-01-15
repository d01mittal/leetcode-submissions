class Solution {
    public void helper(int ind, int target, int[] candidates, List<Integer> store, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind&&candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            store.add(candidates[i]);
            helper(i+1,target-candidates[i],candidates,store,ans);
            store.remove(store.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> store=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,target,candidates,store,ans);
        return ans;
    }
}