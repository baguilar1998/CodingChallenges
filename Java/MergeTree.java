/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MergreTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1!=null && t2==null)return t1;
        else if(t1==null && t2!=null)return t2;
        else if(t1==null && t2==null)return null;
        TreeNode subRoot = new TreeNode(t1.val+t2.val);
        TreeNode leftChild = mergeTrees(t1.left,t2.left);
        TreeNode rightChild = mergeTrees(t1.right,t2.right);
        subRoot.left = leftChild;
        subRoot.right = rightChild;
        return subRoot;
    }
}