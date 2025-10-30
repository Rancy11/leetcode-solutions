class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        rec(1, n, k, new ArrayList<>());
        return ans;
    }
    private void rec(int i, int n, int k, List<Integer> curr){
        if(curr.size()== k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if( i > n) return;
        curr.add(i);
        rec(i+1 ,n,k, curr);
        curr.remove(curr.size()-1);
        rec(i+1,n , k, curr);
    }
}
