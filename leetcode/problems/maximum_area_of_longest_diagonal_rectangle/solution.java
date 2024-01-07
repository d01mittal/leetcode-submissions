class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        int m=dimensions[0].length;
        int max=0;
        double maxdiag=0.0;
        for(int i=0;i<n;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            double diagonal=Math.sqrt(length*length+width*width);
            if((diagonal>maxdiag)||(diagonal==maxdiag&&length*width>max)){
                maxdiag=diagonal;
                max=length*width;
            }
        }
        return max;
    }
}