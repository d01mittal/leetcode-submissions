class Solution {
    public int minAddToMakeValid(String s) {
        int len=s.length();
        Stack<Character> store=new Stack<>();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(store.isEmpty()) store.push(ch);
            else if(store.peek()=='('&&ch==')') store.pop();
            else store.push(ch);
        }
        return store.size();
    }
}
