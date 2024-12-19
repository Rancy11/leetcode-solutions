class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int i=0;
        int j=0;
        int midz= -1;
        int ans=0;
        int n= nums.size();
        while(j<n){
            if(nums[j]==0){
                ans= max(ans, j-i-1);
                i= midz+1;
                midz=j;
            }
            j++;
        }
        ans= max(ans, j-i-1);
        return ans;
    }
};
