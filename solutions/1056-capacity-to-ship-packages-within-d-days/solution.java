class Solution {
    private boolean func(int[] weights, int days, int n, int limit){
        int add = 0, d = 1;
        for(int i=0; i<n; i++){
            if(add + weights[i]<= limit){
                add += weights[i];
            }
            else{
                d++;
                add = weights[i];
                if(d> days) return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0, high = 0;
        for(int i=0; i<n; i++){
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        int res = -1;
        while(low<= high){
            int mid = low + (high - low) /2;
            if(func(weights, days, n, mid)){
                res = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return res;
    }
}
