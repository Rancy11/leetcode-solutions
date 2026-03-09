class Solution {

    static final int MOD = 1000000007;
    Integer[][][] dp;

    public int numberOfStableArrays(int zero, int one, int limit) {
        dp = new Integer[zero + 1][one + 1][2];

        long ans = 0;
        ans = (ans + solve(zero, one, 0, limit)) % MOD;
        ans = (ans + solve(zero, one, 1, limit)) % MOD;

        return (int) ans;
    }

    int solve(int z, int o, int last, int limit) {

        if (z == 0 && o == 0) return 1;

        if (dp[z][o][last] != null) return dp[z][o][last];

        long res = 0;

        if (last == 0) {
            for (int i = 1; i <= limit && i <= z; i++) {
                res = (res + solve(z - i, o, 1, limit)) % MOD;
            }
        } 
        else {
            for (int i = 1; i <= limit && i <= o; i++) {
                res = (res + solve(z, o - i, 0, limit)) % MOD;
            }
        }

        return dp[z][o][last] = (int) res;
    }
}
