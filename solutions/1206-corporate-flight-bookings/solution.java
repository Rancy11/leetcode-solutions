class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int arr[] = new int [n];
        for(int[] b : bookings){
            int l = b[0] - 1;
            int r = b[1] - 1;
            int seats = b[2];
        arr[l]+= seats;
            if( r+1 < n){
                arr[r+1] -= seats;
            }
        }
        for( int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
