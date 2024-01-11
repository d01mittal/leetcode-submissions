class Solution {
    public static void helper(int open,int close,String str,List<String> ans){
        if(open==0&&close==0){
            ans.add(str);
            return;
        }
        if(open>0) helper(open-1,close,str+"(",ans);
        if(close>open) helper(open,close-1,str+")",ans);
        return;
    }
    public List<String> generateParenthesis(int n) {
        String str="";
        int open=n,close=n;
        List<String> ans=new ArrayList<>();
        helper(open,close,str,ans);
        return ans;
    }
}