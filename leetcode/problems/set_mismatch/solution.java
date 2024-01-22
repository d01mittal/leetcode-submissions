class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int rep=0,mis=0;
        for(int ele:nums){
            if(set.contains(ele)){
                rep=ele;
            }
            set.add(ele);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                mis=i;
                break;
            }
        }
        int ans[]={rep,mis};
        return ans;
    }
}