class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();
        if(k==n) return "0";
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty()&&st.peek()>ch&&k>0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='0')
            return sb.substring(i);
        }
        return "0";
    }
}