class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int result[] = new int[n];
        int p=0; int q=0; int index=0;
        int pos=0; int neg=0;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                positive[pos++] = nums[i];
            }
            else{
                negative[neg++] = nums[i];
            }
        }
        while( index<n){
            result[index++] = positive[p++];
             result[index++] = negative[q++]; 
        }
        return result;
    }
}
