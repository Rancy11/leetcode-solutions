class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int res = 0;
        for(int i=0; i< nums.length ; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
            sum+= nums[i];
            int ques = sum - k;
            int freq = map.getOrDefault( ques , 0);
            res+= freq;
            map.put( sum, map.getOrDefault(sum , 0) + 1 );
        }
        return res;
    }
}
