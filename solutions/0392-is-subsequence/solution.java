class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()> t.length()) return  false;
        int j = 0;
        int i=0;
        for(i=0; i<s.length() && j<t.length(); j++){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }

        }
        return i== s.length();
    }
}
