class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        String vowels = "aeiou";
        for(int i=0; i<k; i++){
            if(vowels.indexOf(s.charAt(i))!= -1){
                count++;
            }
        }
            int j=0;
            int maxx = count;
            for(int i=k; i<s.length(); i++){
                if(vowels.indexOf(s.charAt(j))!= -1){
                    count--;
                }
                if(vowels.indexOf(s.charAt(i))!= -1){
                    count++;
                }
                j++;
                maxx= Math.max(maxx,count);

            }
        return maxx;
    }
}
