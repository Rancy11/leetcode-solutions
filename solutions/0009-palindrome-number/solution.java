class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int revN=0;
        if (x < 0) return false;
        while(x>0){
            int lastdigit= x%10;
            x=x/10;
            revN= (revN*10)+lastdigit;
        }
        return revN==dup;
    }
}
