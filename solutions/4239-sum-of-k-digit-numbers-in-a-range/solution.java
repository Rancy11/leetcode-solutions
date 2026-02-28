class Solution {
    
    static final long MOD = 1_000_000_007;
    
    public int sumOfNumbers(int l, int r, int k) {
        
        long lorunavemi = l + r + k;
        long cnt = r - l + 1;
        long sumDigits = (long)(l + r) * cnt / 2;
        
        long powCnt = modPow(cnt, k - 1); 
        long pow10 = modPow(10, k);    
        long geo = (pow10 - 1 + MOD) % MOD;
        long inv9 = modPow(9, MOD - 2);       
        geo = (geo * inv9) % MOD;
        
        long ans = sumDigits % MOD;
        ans = (ans * powCnt) % MOD;
        ans = (ans * geo) % MOD;
        
        return (int) ans;
    }
    
    private long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            
            base = (base * base) % MOD;
            exp >>= 1;
        }
        
        return result;
    }
}
