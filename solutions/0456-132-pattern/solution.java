class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int second = Integer.MIN_VALUE;
        if(n<3) return false;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(nums[i]< second){
                return true;
            }
            while(!st.isEmpty() && st.peek()< nums[i]){
                second = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
