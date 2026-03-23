class Solution {
    public int maxNumberOfBalloons(String text) {
        String need = "balloon";
        int arr[] = new int[26];
        for(char ch: text.toCharArray()){
            arr[ch - 'a']++;
        }
        int b = arr['b'- 'a'];
        int a = arr['a'-'a'];
        int l = arr['l'-'a']/2;
        int o = arr['o'-'a']/2;
        int n = arr['n'- 'a'];
        return Math.min(Math.min(a,b), Math.min(Math.min(l,o), n));
    }
}
