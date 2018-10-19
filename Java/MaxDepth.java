class MaxDepth{
    /**
     * @return the height of a binary tree
     */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int child1 = maxDepth(root.left)+1;
        int child2 = maxDepth(root.right)+1;
        if(child1>child2)return child1;
        return child2;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}