class Solution {
    private boolean fun(int[] bloomDay, int m , int k, int limit, int n){
        if(n < m*k ) return false;
        int bouquet = 0, flowers = 0;
        for(int i= 0; i<n; i++){
            if(bloomDay[i] <= limit ){
                flowers++;
                if(flowers == k){
                    bouquet++;
                    flowers = 0;
                }
            }
            else{
                    flowers = 0;
            }
            if (bouquet >= m) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = bloomDay[0], high = 0;
        int res = -1;
        for(int x: bloomDay){
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        while(low<= high){
            int mid = low+ (high - low)/2;
            if(fun(bloomDay, m, k, mid, n)){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
}
