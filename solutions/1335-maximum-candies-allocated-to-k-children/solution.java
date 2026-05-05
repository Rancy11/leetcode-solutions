class Solution {
    private boolean func(int[] candies, long k, int limit, int n){
        long children = 0; long sum = 0;
        for(int i=0 ; i<n; i++){
            children += candies[i]/limit;
            sum+= candies[i];
        }
        if(sum< k) return false;
        return children >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int low = 1, high = 0;
        for(int i =0; i<n; i++){
            high = Math.max(high, candies[i]);
        }
        int res = 0;
        while(low<= high){
            int mid = low+ (high - low)/2;
            if(func(candies, k, mid , n)){
                res = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return res;
    }
}
