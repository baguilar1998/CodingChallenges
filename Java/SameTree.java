class SameTree{
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * Given 2 binary trees, determine if these two trees
 * are the same
 */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null && q==null)return false;
        if(p==null & q!=null)return false;
        if(p==null && q==null)return true;
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}