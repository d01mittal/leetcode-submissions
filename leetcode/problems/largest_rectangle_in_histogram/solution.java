class Solution {
    public static int[] prevSmaller(int[] heights){
      int ans[]=new int[heights.length];
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<heights.length;i++){
        while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
              st.pop();
        }
        if(st.isEmpty()){
            ans[i]=0;
        }
        else{
            ans[i]=st.peek()+1;
        }
        st.push(i);
      }
      return ans;
    }
    public static int[] nextSmaller(int[] heights){
      int ans[]=new int[heights.length];
      Stack<Integer> st=new Stack<>();
      for(int i=heights.length-1;i>=0;i--){
        while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
              st.pop();
        }
        if(st.isEmpty()){
            ans[i]=heights.length-1;
        }
        else{
            ans[i]=st.peek()-1;
        }
        st.push(i);
      }
      return ans;
    }
    public int largestRectangleArea(int[] heights) {
      int prevSmall[]=prevSmaller(heights);
      int nextSmall[]=nextSmaller(heights);
      int maxArea=Integer.MIN_VALUE;
      for(int i=0;i<heights.length;i++){
        int area=(nextSmall[i]-prevSmall[i]+1)*heights[i];
        maxArea=Math.max(maxArea,area);
      }
      return maxArea;
    }
}