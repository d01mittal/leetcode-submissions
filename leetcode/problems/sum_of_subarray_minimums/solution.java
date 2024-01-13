class Solution {
    public int[] prevSmaller(int arr[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] nextSmaller(int arr[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=arr.length;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int prevsmall[]=prevSmaller(arr);
        int nextsmall[]=nextSmaller(arr);
        long mod=1000000007;
        long res=0;
        for(int i=0;i<arr.length;i++){
            int first=i-prevsmall[i];
            int second=nextsmall[i]-i;
            long pro=(first*second)%mod;
            pro=(pro*arr[i])%mod;
            res=((res%mod)+pro)%mod;
        }
        return (int)res;
    }
}