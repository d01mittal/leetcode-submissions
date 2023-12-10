class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=(m>0)?(matrix[0].length):0;
        int ans[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}