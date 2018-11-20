/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class RangeSumOfBST {
    
    public void inOrder(TreeNode root, ArrayList<Integer> ans){
        if(root == null)return;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        inOrder(root,answer);
        for(int i=0; i<answer.size();++i){
            if(answer.get(i)>R)break;
            if(answer.get(i)>=L)result+= answer.get(i);
        }
        return result;
    }
}