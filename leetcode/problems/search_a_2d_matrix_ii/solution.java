class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;
        if(arr==null||m<1||n<1)
        return false;
        int row=0;
        int col=n-1;
        while(row<m&&col>=0){
            if(arr[row][col]==target)
            return true;
            else if(arr[row][col]<target)
            row++;
            else
            col--;
        }
        return false;
    }
}