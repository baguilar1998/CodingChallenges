public class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x) { val=x; }
}

class InvertTree{
    
    /*
        Inverts a binary tree
        @param root the root of the tree
        @return a tree
    */
    public TreeNode invertTree(TreeNode root){
        if(root!=null){
            TreeNode cL = invertTree(root.left);
            TreeNode cR = invertTree(root.right);
            root.left=cR;
            root.right=cL;
        }
        return root;
    }

}