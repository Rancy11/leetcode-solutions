class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        int left = 0;
        for(int right = 0 ; right< nums.length ; right++){
            if(right == nums.length-1 || nums[right+1] != nums[right]+1){
                if(nums[left] == nums[right]){
                    list.add(String.valueOf(nums[left]));
                }
                else{
                    list.add(nums[left] + "->" + nums[right]);
                }
                left = right + 1;
            }
        }
        return list;
    }
}
