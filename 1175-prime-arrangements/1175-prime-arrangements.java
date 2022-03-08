class Solution {
    int[] prime = new int[101];
    private static final int MOD = (int) (1e9 + 7);
    public int numPrimeArrangements(int n) {
        SieveOfEratosthenes(n);
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(prime[i] == 1) c++;
        }
        return (int) (fact(c) * fact(n - c) % MOD);
        
    }
    
    long fact(int n){
        long fact = 1L;
        for(int i = 1; i <= n; i++){
            fact = (fact * i) % MOD;
        }
        return fact;
    }
    
    void SieveOfEratosthenes(int n){
	    int p,j;	
	    // set all elements of prime[] to 1
	    for(j=0;j<=n;++j)
		    prime[j] = 1;
	
	    prime[1] = 0; // 1 is not prime
	    for(p=2;p<=Math.sqrt(n);++p){
		    for(j=p*p;j<=n;j+=p){
			    prime[j] = 0;
		    }
	    }
    }
}