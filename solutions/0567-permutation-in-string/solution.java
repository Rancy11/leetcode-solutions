class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int s1count[] = new int[26];
        int s2count[] = new int[26];
        for(char ch: s1.toCharArray()){
            s1count[ch - 'a']++;
        }  
        int left = 0;
        int right = 0;
        int Neededsize = s1.length();
        while(right< s2.length()){
            s2count[s2.charAt(right)- 'a']++;
            if(right - left + 1> Neededsize){
                s2count[s2.charAt(left) - 'a']--;
                left++;
            }
            if(Arrays.equals(s1count, s2count)) return true;
            right++;
        }
        return false;
    }
}
