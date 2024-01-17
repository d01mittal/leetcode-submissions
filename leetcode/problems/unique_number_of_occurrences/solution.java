class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        for(int num:mpp.keySet()){
            int val=mpp.get(num);
            if(set.contains(val))
            return false;
            else
            set.add(val);
        }
        return true;
    }
}