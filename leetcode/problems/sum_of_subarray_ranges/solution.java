class Solution {
    public static int[] nextSmaller(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
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
    public static int[] prevSmaller(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
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
    public static long sumSubarrayMins(int []arr) {
        int n=arr.length;
        int nextSmall[]=nextSmaller(arr);
        int prevSmall[]=prevSmaller(arr);
        long res=0;
        for(int i=0;i<arr.length;i++){
            int first=i-prevSmall[i];
            int second=nextSmall[i]-i;
            long pro=first*second;
            pro=pro*arr[i];
            res=res+pro;
        }
        return res;
    }
    public static int[] nextGreater(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
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
    public static int[] prevGreater(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
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
    public static long sumSubarrayMaxs(int []arr) {
        int n=arr.length;
        int nextGreat[]=nextGreater(arr);
        int prevGreat[]=prevGreater(arr);
        long res=0;
        for(int i=0;i<arr.length;i++){
            int first=i-prevGreat[i];
            int second=nextGreat[i]-i;
            long pro=first*second;
            pro=pro*arr[i];
            res=res+pro;
        }
        return res;
    }
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums)-sumSubarrayMins(nums);
    }
}