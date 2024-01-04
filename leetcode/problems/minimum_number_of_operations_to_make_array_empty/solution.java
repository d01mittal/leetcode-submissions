class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int ans=0;
        for(int n:nums){
            mpp.put(n,mpp.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            int t=entry.getValue();
            if(t==1)
            return -1;
            ans+=t/3;
            if(t%3!=0)
            ans++;
        }
        return ans;
    }
}