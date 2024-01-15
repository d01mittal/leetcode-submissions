class Solution {
    public static void helper(int i, int input[], List<Integer> store, HashSet<List<Integer>> ans){
		if(i==input.length){
			ans.add(new ArrayList<>(store));
			return;
		}
		store.add(input[i]);
		helper(i+1, input, store, ans);
		store.remove(store.size()-1);
		helper(i+1, input, store, ans);
	}
    public List<List<Integer>> subsetsWithDup(int[] input) {
        Arrays.sort(input);
        HashSet<List<Integer>> ans=new HashSet<>();
		List<Integer> store=new ArrayList<>();
		helper(0,input,store,ans);
		List<List<Integer>> a=new ArrayList<>();
		Iterator<List<Integer>> it=ans.iterator();
		while(it.hasNext()){
			a.add(it.next());
		}
        return a;
    }
}