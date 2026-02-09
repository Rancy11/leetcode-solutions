class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = Search(nums, target, true);
        ans[1] = Search(nums, target, false);
        return ans;
    }
    public int Search(int[] nums, int target, boolean findFirst){
        int left = 0, right = nums.length-1;
        int ans = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans = mid;
                if(findFirst) right = mid-1;
                else left = mid+1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}
