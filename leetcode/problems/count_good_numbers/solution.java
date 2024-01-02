class Solution {
    int mod=(int)1e9+7;
    public long pow(long x,long y){
        if(y==0) return 1;
        if(y==1) return x;
        long ans=pow(x,y/2)%mod;
        ans=(ans*ans)%mod;
        if(y%2==1)
        ans=(ans*x)%mod;
        return ans;
    }
    public int countGoodNumbers(long n) {
        long five=pow(5,n/2+(n%2))%mod;
        long four=pow(4,n/2)%mod;
        long ans=five*four;
        ans=ans%mod;
        return (int)ans;
    }
}