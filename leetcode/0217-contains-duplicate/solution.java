class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> store=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!store.contains(nums[i]))
            store.add(nums[i]);
            else return true;
        }
        return false;
    }
}
