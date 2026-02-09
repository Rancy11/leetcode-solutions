class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int minAns = nums[0];
        int maxAns = nums[0];
        for(int i=1; i<nums.length; i++){
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            minSum = Math.min(minSum + nums[i], nums[i]);

            maxAns = Math.max(maxAns, maxSum);
            minAns = Math.min(minAns, minSum);
        }
        return Math.max(Math.abs(maxAns), Math.abs(minAns));
    }
}
