class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
         int m=arr.length;
        int n=arr[0].length;
        int low=0;
        int high=n*m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int i=mid/n;
            int j=mid%n;
            if(arr[i][j]==target)
            return true;
            else if(arr[i][j]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
}