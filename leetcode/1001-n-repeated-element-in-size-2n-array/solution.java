class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> store=new HashMap<>();
        for(int i=0;i<n;i++){
            store.put(nums[i], store.getOrDefault(nums[i],0)+1);
        }
        Iterator it=store.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry ele=(Map.Entry)it.next();
            if((int)ele.getValue()==(n/2)) return (int)ele.getKey();
        }
        return -1;
    }
}
