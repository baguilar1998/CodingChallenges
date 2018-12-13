/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeafSimilar {
    /**
    Two binary trees are considered leaf-similar if their leaf value sequence is the same.
    Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
     */
    public void preOrder(TreeNode root, ArrayList<Integer> ans){
        if(root==null)return;
        if(root.left == null && root.right==null){
            ans.add(root.val);
            return;
        }
        preOrder(root.left,ans);
        preOrder(root.right,ans);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaves1 = new ArrayList<>();
        ArrayList<Integer> leaves2 = new ArrayList<>();
        
        preOrder(root1,leaves1);
        preOrder(root2,leaves2);
        
        if(leaves1.size()!=leaves2.size())return false;
        for(int i=0;i<leaves1.size();++i){
            if(leaves1.get(i)!=leaves2.get(i))return false;
        }
     
        return true;
        
    }
}