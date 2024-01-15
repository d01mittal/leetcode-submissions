class Solution {
    public static String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void helper(int ind, String digits, List<String> ans, String str){
        if(ind==digits.length()){
            ans.add(str);
            return;
        }
        for(int i=0;i<keypad[digits.charAt(ind)-'0'].length();i++)
        helper(ind+1,digits,ans,str+keypad[digits.charAt(ind)-'0'].charAt(i));
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        helper(0,digits,ans,"");
        return ans;
    }
}