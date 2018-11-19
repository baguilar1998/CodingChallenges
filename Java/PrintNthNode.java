import java.io.*;
import java.util.*;
import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x) { val=x; }
}

class PrintNthNode{
  
  
  // Helper method to store the in order traversal
  public static void printNthNode(TreeNode root, ArrayList<Integer> ans){
    if(root==null)return;
    printNthNode(root.left,ans);
    ans.add(root.val);
    printNthNode(root.right,ans);
  }
  
  
  /**
  * Given a binary tree, print the nth node using
  * in order traversal. 
  * @param root the root of the tree
  * @param n the nth node you want to print out
  */
  public static void printNthNode(TreeNode root, int n)throws Exception{
    if(n<=0) throw new Exception("Invalid Node Number");
    ArrayList<Integer> order = new ArrayList<>();
    printNthNode(root,order);
    if(n>order.size()) throw new Exception("Invalid Node Numbder");
    System.out.println(order.get(n-1));
  }
  
  
  public static void main(String[] args){
    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
    TreeNode n3 = new TreeNode(3);
    n1.left = n2;
    n1.right=n3;
    TreeNode n4 = new TreeNode(4);
    TreeNode n5 = new TreeNode(5);
    n2.left=n4;
    n2.right=n5;
    TreeNode n6 = new TreeNode(6);
    TreeNode n7 = new TreeNode(7);
    n3.left=n6;
    n3.right=n7;
    TreeNode n8 = new TreeNode(8);
    n4.left=n8;
    try{
      printNthNode(n1,100);
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}

