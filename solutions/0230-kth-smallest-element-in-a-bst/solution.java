/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        helper(ans , root);
        return ans.get(k-1);
    }
    public void helper(List<Integer> ans, TreeNode node){
        if(node == null) return;
        helper(ans, node.left);
        ans.add(node.val);
        helper(ans, node.right);
    }
}
