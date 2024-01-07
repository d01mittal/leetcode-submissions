class Solution {
    public int countAsterisks(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                if(ch=='|'){
                    stack.push(ch);
                }
                else{
                    if(ch=='*')
                    cnt++;
                }
            }
            else{
                if(ch=='|'){
                    stack.pop();
                }
            }
        }
        return cnt;
    }
}