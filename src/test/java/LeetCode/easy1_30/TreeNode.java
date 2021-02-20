package LeetCode.easy1_30;

public class TreeNode {

    private TreeNode root;
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val = val;}
        TreeNode (int val, TreeNode left, TreeNode right){
            this.val = val;
            this.right = right;
            this.left = left;
        }


    public void insert(int value){
      root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value){

        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.val){
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }
       return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){

        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else if(p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }

        }


    public static void main (String[]args){

        TreeNode p = new TreeNode();
        p.insert(1);
        p.insert(2);
        p.insert(3);

       p.inOrder();
        System.out.println("----------->");
        TreeNode q = new TreeNode();

        q.insert(1);
        q.insert(1);
        q.insert(2);

        q.inOrder();

        System.out.println("<-------------");


      System.out.println(isSameTree(p,q));






    }
}
