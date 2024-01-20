class Solution {
    public boolean isPossible(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
    public boolean canSortArray(int[] nums) {
        int arr[]=new int[101];
        int j=0;
        int k=0;
        int n=nums.length;
        for(int i:nums)
            arr[j++]=Integer.bitCount(i);
        while(k<n){
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]&&nums[i]<nums[i-1]){
                    int temp=nums[i];
                    nums[i]=nums[i-1];
                    nums[i-1]=temp;
                }
            }
            if(isPossible(nums))return true;
            k++;
        }
        return false;
    }
}