class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                List<Integer> l=new ArrayList<>();
                for(int k=0;k<i;k++){
                    l.add(nums[k]);
                }
                for(int k=j+1;k<n;k++){
                    l.add(nums[k]);
                }
                boolean increasing=true;
                for(int index=0;index<l.size()-1;index++){
                    if(l.get(index)>=l.get(index+1)){
                        increasing=false;
                        break;
                    }
                }
                if(increasing)
                    count++;
            }   
        }
        return count;
    }
}