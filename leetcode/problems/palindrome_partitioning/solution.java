class Solution {
    public void helper(int ind, List<String> store, List<List<String>> ans, String s){
        if(ind==s.length()){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(pal(s,ind,i)){
                store.add(s.substring(ind,i+1));
                helper(i+1,store,ans,s);
                store.remove(store.size()-1);
            }
        }
    }
    public boolean pal(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
            return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> store=new ArrayList<>();
        helper(0,store,ans,s);
        return ans;
    }
}