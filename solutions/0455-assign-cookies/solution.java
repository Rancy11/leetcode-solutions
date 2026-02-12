class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greed = 0;
        int cookie = 0;
        int count = 0;
        while( greed < g.length && cookie < s.length ){
            if(g[greed] > s[cookie]){
                cookie++;
            }
            else if(s[cookie] >= g[greed]){
                cookie++;
                greed++;
                count+=1;
            }
        }
        return count;
    }
}
