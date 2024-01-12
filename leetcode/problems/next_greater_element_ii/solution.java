class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n=a.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int ele=a[i%n];
            if(st.isEmpty()){
                ans[i%n]=-1;
                st.push(ele);
            }
            else if(ele<st.peek()){
                ans[i%n]=st.peek();
                st.push(ele);
            }
            else{
                while(!st.isEmpty()&&st.peek()<=ele){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i%n]=st.peek();
                }
                else{
                    ans[i%n]=-1;
                }
                st.push(ele);
            }
        }
        return ans;
    }
}