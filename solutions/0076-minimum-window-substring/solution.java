class Solution {
    private boolean isSahi(int[] have, int[] need){
            for(int i=0; i<256; i++){
                if(have[i]<need[i]){
                    return false;
                }
            }
            return true;
        }
    public String minWindow(String s, String t) {
        int low = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;
        int[] have = new int[256];
        int[] need = new int[256];

        for (char c : t.toCharArray()) {
            need[c]++;
        }
        for(int high=0; high<s.length(); high++){
            have[s.charAt(high)]++;
            while(isSahi(have,need)){
                int len = high-low+1;
                if(res>len){
                    res= len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start+res);
    }

}
