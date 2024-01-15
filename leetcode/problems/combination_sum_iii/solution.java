class Solution {
    public void helper(int ind, int k, int n, List<Integer> store, List<List<Integer>> ans){
        if(n==0&&store.size()==k){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int i=ind;i<10;i++){
            if(n-i<0)
            break;
            store.add(i);
            helper(i+1,k,n-i,store,ans);
            store.remove(store.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> store=new ArrayList<>();
        helper(1,k,n,store,ans);
        return ans;
    }
}