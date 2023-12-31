class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            open++;
            else if(ch==')'){
                depth=Math.max(depth,open);
                open--;
            }
        }
        return depth;
    }
}