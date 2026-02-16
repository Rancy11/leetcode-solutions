class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int res = 0;
        for(int i = 0; i< nums.length ; i++){
            sum += nums[i];
            int ques = sum - goal;
            int freq = map.getOrDefault(ques, 0);
            res += freq;
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}
