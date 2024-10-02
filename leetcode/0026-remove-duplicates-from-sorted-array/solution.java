class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;
        HashSet<Integer> store=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!store.contains(nums[i])){
                store.add(nums[i]);
                nums[j]=nums[i];
                j++;
            }
        }
        return store.size();
    }
}
