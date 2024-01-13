class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        st.push(asteroids[0]);
        for(int i=1;i<n;i++){
            if(!st.isEmpty()&&(st.peek()>0&&asteroids[i]<0)){
                boolean flag=true;
                while(!st.isEmpty()&&(st.peek()>0&&asteroids[i]<0)){
                    if(st.peek()+asteroids[i]>0){
                        flag=false;
                        break;
                    }
                    else if(st.peek()+asteroids[i]==0){
                        st.pop();
                        flag=false;
                        break;
                    }
                    else{
                        st.pop();
                    }
                }
                if(flag)
                st.push(asteroids[i]);
            }
            else if(asteroids[i]==0)
            continue;
            else{
                st.push(asteroids[i]);
            }
        }
        int ans[]=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            ans[i--]=st.pop();
        }
        return ans;
    }
}