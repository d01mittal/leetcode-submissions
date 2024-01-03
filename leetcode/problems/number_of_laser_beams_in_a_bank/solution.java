class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int store=0;
        for(int i=0;i<bank[0].length();i++){
            char ch=bank[0].charAt(i);
            if(ch-'0'==1){
                store++;
            }
        }
        for(int i=1;i<bank.length;i++){
            int current=0;
            for(int j=0;j<bank[i].length();j++){
                char ch=bank[i].charAt(j);
                if(ch-'0'==1){
                    current++;
                }
            }
            if(current==0)
            continue;
            ans+=store*current;
            store=current;
        }
        return ans;
    }
}