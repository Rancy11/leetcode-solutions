class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int len = 0;
        boolean odd = false;
        for(int x: map.values()){
            len+= (x/2) * 2;
            if (x % 2 == 1) odd = true;
        }
        return odd ? len + 1 : len; 
    }
}
