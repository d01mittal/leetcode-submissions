class Solution {
    public boolean wordPattern(String pattern, String s) {
        String store[]=s.split(" ");
        HashMap<Character, String> track=new HashMap<>();
        if(pattern.length()!=store.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!track.containsKey(ch)) track.put(ch,store[i]);
            else{
                if(track.get(ch).compareTo(store[i])!=0) return false;
            }
        }
        HashSet<String> set=new HashSet<>();
        Iterator it=track.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry ele=(Map.Entry)it.next();
            if(set.contains(ele.getValue())) return false;
            else set.add(String.valueOf(ele.getValue()));
        }
        return true;
    }
}
