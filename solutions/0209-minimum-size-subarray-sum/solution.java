class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int low = 0;
        int min = Integer.MAX_VALUE;
        for(int high = 0; high<n ; high++){
            sum+= nums[high];
            while(sum >= target){
                int len = high - low + 1;
                min = Math.min(min, len);
                sum -= nums[low];
                low++;
            }
        }
        return min == Integer.MAX_VALUE? 0 : min;
    }
}
