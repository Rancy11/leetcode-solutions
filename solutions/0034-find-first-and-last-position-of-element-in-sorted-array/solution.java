class Solution {
    private void firstPos(int[]nums, int target, int[] ans){
        int low = 0, high = nums.length -1;
        int res = -1;
        while(low<=high){
            int mid = low+(high - low) /2;
            if(nums[mid] < target){
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid -1;
            }
            else{
                res = mid;
                high = mid - 1;
            }
        }
        ans[0] = res;
    }
    private void lastPos(int[]nums, int target, int[] ans){
        int low = 0, high = nums.length -1;
        int res = -1;
        while(low<=high){
            int mid = low + (high - low) /2;
            if(nums[mid] < target){
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid -1;
            }
            else{
                res = mid;
                low = mid + 1;
            }
        }
        ans[1] = res;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        firstPos(nums, target, ans);
        lastPos(nums, target, ans);
        return ans;
    }
}
