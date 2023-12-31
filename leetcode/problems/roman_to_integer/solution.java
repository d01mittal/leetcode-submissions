class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);
        int ans=0;
        char c=s.charAt(s.length()-1);
        ans+=mpp.get(c);
        for(int i=s.length()-2;i>=0;i--){
            char ch=s.charAt(i);
            if(mpp.get(ch)<(mpp.get(s.charAt(i+1)))){
                ans=Math.abs(ans-mpp.get(ch));
            }
            else{
                ans+=mpp.get(ch);
            }
        }
        return ans;
    }
}