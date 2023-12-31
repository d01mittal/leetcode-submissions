class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
        return 0;
        int sign=0;
        int startpoint=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            startpoint=1;
        }
        else if(s.charAt(0)=='+'){
            sign=1;
            startpoint=1;
        }
        else{
            sign=1;
            startpoint=0;
        }
        double num=0;
        for(int i=startpoint;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '||ch<'0'||ch>'9')
            break;
            if(ch>='0'&&ch<='9')
            num=num*10+(double)(ch-'0');
        }
        if(sign==1){
            if(num>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            else
            return (int)num;
        }
        if(sign==-1){
            if(num*-1<=Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            else
            return (int)num*-1;
        }
        return 0;
    }
}