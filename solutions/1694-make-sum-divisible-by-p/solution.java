class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int minLength = nums.length;
        map.put( 0, -1);
        long total = 0;

        for(int num : nums){
            total = (total + num) % p;
        }
        int target = (int) total;
        if(target == 0) return 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = (sum + nums[i]) % p;
            int need = (sum - target + p) % p;
            if(map.containsKey(need)){
                minLength = Math.min(minLength, i - map.get(need));
            } 

            map.put(sum,i);
        }
        return minLength == nums.length ? -1 : minLength;
    }
}
