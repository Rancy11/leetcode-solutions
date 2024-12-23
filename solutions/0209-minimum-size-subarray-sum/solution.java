class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int i=0; 
        int j=0;
        int sum= nums[0];
        int minSize= Integer.MAX_VALUE;

        while(j<n){
            if(i==j && nums[i]>=target) return 1;
            else if(i!=j && sum>= target){
                minSize= Math.min(minSize, j-i+1);
                sum-= nums[i];
                i++;
            }
            else{
                j++;
                if(j<n)sum+=nums[j];
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize; 
    }
}
