class FlattenTree {
    
    public void preOrder(TreeNode root, ArrayList<TreeNode> list){
        if(root==null)return;
        list.add(root);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
    
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> tree = new ArrayList<TreeNode>();
        preOrder(root,tree);
        
        for(int i=0;i<tree.size()-1;++i){
            tree.get(i).right=tree.get(i+1);
            tree.get(i).left=null;
        }
    }
    
}