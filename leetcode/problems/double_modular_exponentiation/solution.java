class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        int k=0;
        for(int x[]:variables){
            int ai=x[0],bi=x[1],ci=x[2],mi=x[3];
            int n1=1;
            for(int i=0;i<bi;i++){
                n1=(n1*ai)%10;
            }
            int n2=1;
            for(int i=0;i<ci;i++){
                n2=(n2*n1)%mi;
            }
            if(n2==target)
                ans.add(k);
            k++;
        }
        return ans;
    }
}