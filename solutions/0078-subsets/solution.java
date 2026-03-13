class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void rec(int start, int[] nums, List<Integer>curr, List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        for(int i= start; i<nums.length; i++){
            curr.add(nums[i]);
            rec(i+1, nums, curr, ans);
            curr.remove(curr.size() -1 );
        }
    }
}
