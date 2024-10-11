class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int n=words.length;
        String store[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb=new StringBuilder();
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                sb.append(store[ch-'a']);
            }
            h.add(sb.toString());
            sb.setLength(0);
        }
        return h.size();
    }
}
