/**
 * Created by Faker on 2018\4\25 0025.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class DepthOfTreeTest {

    public static void main(String args[]) {
        TreeNode node =new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        System.out.print(maxDepth(node));
    }


    public static int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
//        if(root.left == null && root.right==null){
//            return 1;
//        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);

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
    }
}
