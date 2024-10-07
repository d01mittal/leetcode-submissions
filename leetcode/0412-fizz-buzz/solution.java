class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        ans.add("1");
        for(int i=1; i<n; i++){
            if((i+1)%3==0&&(i+1)%5==0) ans.add(i, "FizzBuzz");
            else if((i+1)%3==0) ans.add(i, "Fizz");
            else if((i+1)%5==0) ans.add(i, "Buzz");
            else ans.add(i, Integer.toString(i+1));
        }
        return ans;
    }
}
