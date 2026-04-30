class Solution {
    private long func(int[] piles, int speed){
        long hours = 0;
        for(int i=0; i<piles.length; i++){
            hours = hours+ piles[i]/speed;
            if(piles[i]% speed !=0) hours++;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        int res = -1;
        while(low<= high){
            int mid = low+ (high - low) /2;
            long hours = func(piles, mid);
            if(hours > h){
                low = mid+1;
            }
            else{
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
}
