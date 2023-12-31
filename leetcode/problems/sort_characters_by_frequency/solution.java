class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char c:s.toCharArray()){
            mpp.put(c,(mpp.getOrDefault(c,0)+1));
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(mpp.get(b)-mpp.get(a)));
        pq.addAll(mpp.keySet());
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            for(int i=0;i<mpp.get(ch);i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}