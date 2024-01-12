class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int ele=nums2[i];
            if(st.isEmpty()){
                mpp.put(ele,-1);
                st.push(ele);
            }
            else if(ele<st.peek()){
                mpp.put(ele,st.peek());
                st.push(ele);
            }
            else if(ele>=st.peek()){
                while(!st.isEmpty()&&st.peek()<=ele){
                    st.pop();
                }
                if(!st.isEmpty()) mpp.put(ele,st.peek());
                else mpp.put(ele,-1);
                st.push(ele);
            }
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=mpp.get(nums1[i]);
        }
        return ans;
    }
}