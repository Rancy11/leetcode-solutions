class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        StringBuilder res = new StringBuilder();
        for(int i= n-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            res.append(st.peek());
            st.pop();
        }
        return res.toString();
    }
}
