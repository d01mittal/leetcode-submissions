class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            int digit=i+1;
            while(num<=high&&digit<=9){
                num=num*10+digit;
                if(low<=num&&num<=high)
                ans.add(num);
                digit++;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}