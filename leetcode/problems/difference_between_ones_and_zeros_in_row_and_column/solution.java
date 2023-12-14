class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int onesrow[]=new int[m];
        int onescol[]=new int[n];
        int diff[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                onesrow[i]+=grid[i][j];
                onescol[j]+=grid[i][j];
            }
        }
        int zerorow[]=new int[m];
        int zerocol[]=new int[n];
        for(int i=0;i<m;i++){
            zerorow[i]=m-onesrow[i];
        }
        for(int i=0;i<n;i++){
            zerocol[i]=n-onescol[i];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j]=onesrow[i]+onescol[j]-zerorow[i]-zerocol[j];
            }
        }
        return diff;
    }
}