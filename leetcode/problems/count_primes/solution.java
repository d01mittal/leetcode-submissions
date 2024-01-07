class Solution {
    public int countPrimes(int n) {
        boolean sieve[]=new boolean[n];
        for(int i=2;i<n;i++){
            sieve[i]=true;
        }
        for(int i=2;i*i<n;i++){
            for(int j=2*i;j<n;j+=i){
                if(sieve[j]==true)
                sieve[j]=false;
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++){
            if(sieve[i]==true)
            cnt++;
        }
        return cnt;
    }
}