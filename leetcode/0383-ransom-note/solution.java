class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(!map1.containsKey(ch)||map1.get(ch)<=0) return false;
            map1.put(ch, map1.get(ch)-1);
        }
        return true;
    }
}
