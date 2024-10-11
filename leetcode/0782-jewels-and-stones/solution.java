import java.util.HashSet;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> store=new HashSet<>();
        int ans=0;
        for(int i=0;i<jewels.length();i++) store.add(jewels.charAt(i));
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(store.contains(ch)) ans++;
        }
        return ans;
    }
}
