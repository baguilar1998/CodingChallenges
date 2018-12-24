/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    ArrayList<TreeNode> list;
    int index;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<TreeNode>();
        inOrder(root,list);
        index = 0;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index!=list.size();
    }

    /** @return the next smallest number */
    public int next() {
        int ans = list.get(index++).val;
        return ans;
    }
    
    private void inOrder(TreeNode n, ArrayList<TreeNode> ans){
        if(n==null)return;
        inOrder(n.left,ans);
        ans.add(n);
        inOrder(n.right,ans);
    }
}