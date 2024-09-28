class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans=new HashSet<Integer>();
        int l1=nums1.length;
        int l2=nums2.length;
        if(l1>=l2){
            for(int i=0; i<l2; i++){
                for(int j=0; j<l1; j++){
                    if(nums2[i]==nums1[j]){
                        ans.add(nums2[i]);
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0; i<l1; i++){
                for(int j=0; j<l2; j++){
                    if(nums1[i]==nums2[j]){
                        ans.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        int a[]=new int[ans.size()];
        int i=0;
        for(int ele:ans){
            a[i]=ele;
            i++;
        }
        return a;
    }
}
