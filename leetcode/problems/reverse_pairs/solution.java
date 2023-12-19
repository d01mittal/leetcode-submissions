class Solution {
    public static long countpairs(int arr[],int low, int mid,int high){
        int right=mid+1;
        long count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high&&arr[i]>2.0*arr[right])
            right++;
            count+=right-(mid+1);
        }
        return count;
    }
    public static long mergeSort(int[] arr, int l, int r){
        long count=0;
        if(l>=r)
        return 0;
        int mid=l+(r-l)/2;
        count+=mergeSort(arr, l, mid);
        count+=mergeSort(arr, mid+1, r);
        count+=countpairs(arr,l,mid,r);
        merge(arr,l,mid,r);
        return count;
    }
    public static void merge(int arr[],int l,int mid,int r){
        int temp[]=new int[r-l+1];
        int left=l;
        int right=mid+1;
        int x=0;
        while(left<=mid&&right<=r){
            if(arr[left]<=arr[right])
            temp[x++]=arr[left++];
            else{
            temp[x++]=arr[right++];
            }
        }
        while(left<=mid)
        temp[x++]=arr[left++];

        while(right<=r)
        temp[x++]=arr[right++];

        for(int i=0,j=l;i<temp.length;i++,j++){
            arr[j]=temp[i];
        }
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return (int)mergeSort(nums, 0, n-1);
    }
}