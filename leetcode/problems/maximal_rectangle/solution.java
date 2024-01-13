class Solution {
    public static int[] prevSmaller(int heights[]){
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
    public static int[] nextSmaller(int heights[]){
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
    public static int largestRectangle(int heights[]) {
      int prevSmall[]=prevSmaller(heights);
      int nextSmall[]=nextSmaller(heights);
      int maxArea=Integer.MIN_VALUE;
      for(int i=0;i<heights.length;i++){
        int area=(nextSmall[i]-prevSmall[i]+1)*heights[i];
        maxArea=Math.max(maxArea,area);
      }
      return maxArea;
    }
    public int maximalRectangle(char[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int heights[]=new int[m];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat[i][j]=='1') heights[j]++;
				else{
					heights[j]=0;
				}
			}
			int area=largestRectangle(heights);
			max=Math.max(max,area);
		}
		return max;
    }
}