class Pair {
    char ch;
    int count;
    Pair(char ch, int count ){
        this.ch = ch;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(c, 1));
                continue;
            }
            if(st.peek().ch == c){
                Pair p = st.peek();
                p.count++;
                if(p.count == k){
                    st.pop();
                }
            }
            else{
                st.push(new Pair(c, 1));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.peek();
            st.pop();
            while(p.count-->0){
                res.append(p.ch);
            }
        }
        return res.reverse().toString();
    }
}
