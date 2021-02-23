package LeetCode.easy1_30;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;


    TreeNode(){};
    TreeNode(int val){this.val = val;}
    public TreeNode(int val, TreeNode left, TreeNode right){
      this.val = val;
      this.right = right;
      this.left = left;
    }

}
