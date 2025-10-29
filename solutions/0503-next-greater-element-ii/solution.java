class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = 1; j < n; j++) {
                int ele = (i + j) % n;
                if (nums[ele] > nums[i]) {
                    ans[i] = nums[ele];
                    break;
                }
            }
        }

        return ans;
    }
}

