class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
          int maxLen = 2;
        for(int i=0; i<n-2; i++){
            int len =2;
            for(int j= i+2; j< n ; j++){
               if(nums[j]== nums[j-1] + nums[j-2]){
                   len++;
                   maxLen = Math.max(maxLen, len);
               }
                else{
                    break;
                }
               
            }
        }
        return maxLen;
    }
}
