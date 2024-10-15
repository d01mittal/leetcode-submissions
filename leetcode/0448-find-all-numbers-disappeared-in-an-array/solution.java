class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> store=new HashSet<>();
        for(int i=1;i<=n;i++){
            store.add(i);
        }
        for(int i=0;i<n;i++){
            store.remove(nums[i]);
        }
        Iterator<Integer> it=store.iterator();
        while(it.hasNext()) ans.add(it.next());
        return ans;
    }
}
