/**
 * Created by Faker on 2018\4\25 0025.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class TreeTest {

    public static void main(String args[]) {
        TreeNode node =new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        System.out.print(maxDepth(node));
    }


    public static int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);

    }





    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if(t1==null && t2 ==null){
                return null;
            }
            if(t1!=null && t2!=null){
                t1.val = t1.val+t2.val;
            }else if(t1==null && t2!=null){
                return t2;
            }else if(t1!=null && t2 ==null){
                return t1;
            }
            t1.left = mergeTrees(t1.left,t2.left);
            t1.right = mergeTrees(t1.right,t2.right);
            return t1;

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }
}
