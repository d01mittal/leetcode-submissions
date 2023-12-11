class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=0;
        int i=0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
            count++;
            if(count==(int)arr.length/4)
            break;
            }
            else
            count=0;
        }
        return arr[i];
    }
}