class Solution {
    public String removeOuterParentheses(String s) {
        ArrayList<Character> l=new ArrayList<>();
        int open=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            open++;
            else if(s.charAt(i)==')')
            open--;
            l.add(s.charAt(i));
            if(open==0){
                for(int j=1;j<l.size()-1;j++){
                    ans+=l.get(j);
                }
                l.clear();
            }
        }
        return ans;
    }
}