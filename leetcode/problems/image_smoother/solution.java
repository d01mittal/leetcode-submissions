class Solution {
    public int smooth(int img[][], int x, int y) {
        int m = img.length; 
        int n = img[0].length;
        int sum = 0;
        int count = 0;
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                int nx = x + i;
                int ny = y + j;
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                sum += img[nx][ny];
                count++;
            }
        }
        return sum/count;
    }
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int ans[][] = new int[m][n];
        for(int i = 0; i<m; i++) {
            for(int j = 0; j < n; j++) {
                ans[i][j] = smooth(img, i, j);
            }
        }
        return ans;
    }
}