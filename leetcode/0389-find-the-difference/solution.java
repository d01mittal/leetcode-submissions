import java.util.Hashtable;
class Solution {
    public char findTheDifference(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        char ans=' ';
        Hashtable<Character, Integer> h1=new Hashtable<>();
        for(int i=0;i<l1;i++){
            char ch=s.charAt(i);
            if(!h1.containsKey(ch)) h1.put(ch, 1);
            else
            h1.put(ch, h1.get(ch)+1);
        }
        for(int i=0;i<l2;i++){
            char ch=t.charAt(i);
            if(!h1.containsKey(ch)||h1.get(ch)==0){
                ans=ch;
                break;
            }
            else{
                h1.put(ch, h1.get(ch)-1);
            }
        }
        return ans;
    }
}
