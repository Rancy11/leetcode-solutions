class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : nums){
            map.put(key, map.getOrDefault(key , 0)+1);
        }

        int maxLength = 0;
        for(int key: map.keySet()){
            if(map.containsKey(key + 1)){
                maxLength = Math.max(maxLength, map.get(key) + map.get(key+1));
            }
        }
        return maxLength;
    }
}
