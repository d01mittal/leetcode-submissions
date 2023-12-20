class Solution {
    public static int maxele(int arr[][],int col){
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i][col]>max){
                max=Math.max(arr[i][col],max);
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxele(arr,mid);
            int left=mid-1>=0?arr[row][mid-1]:-1;
            int right=mid+1<m?arr[row][mid+1]:-1;
            if(arr[row][mid]>left&&arr[row][mid]>right){
                int ans[]={row,mid};
                return ans;
            }
            else if(mid>0&&arr[row][mid]<arr[row][mid-1])
            high=mid-1;
            else
            low=mid+1;
        }
        int ans[]={-1,-1};
        return ans;
    }
}