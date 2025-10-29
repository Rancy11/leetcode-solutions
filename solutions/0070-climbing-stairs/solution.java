class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return rec(n, dp);
    }
    private int rec( int n, int dp[]){
        if(n == 0) return 1;
        if(n == -1) return 0;
        if(dp[n] != -1) return dp[n];
        int one_step = rec(n-1, dp);
        int two_step = rec(n-2, dp);
        dp[n] = one_step+ two_step;
        return dp[n];
        
    }
}
