class Solution {
    public int reverse(int x) {
        double num=0.0;
        int sign=0;
        while(x!=0){
            int digit=x%10;
            num=num*10+digit;
            x=x/10;
        }
        if(num<=Integer.MIN_VALUE){
            return 0;
        }
        else if(num>=Integer.MAX_VALUE)
        return 0;
        else
        return (int)num;
    }
}