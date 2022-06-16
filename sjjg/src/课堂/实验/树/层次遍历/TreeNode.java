package 课堂.实验.树.层次遍历;
/**
 * @author frank-chandler
 */
public class TreeNode {
        public int val;//结点值
        public TreeNode left;//左孩子结点
        public TreeNode right;//右孩子结点
        public TreeNode(int val) {
            this.val = val;
        }
        public static int treeHeight(TreeNode root) {
            if (null == root) {
                return 0;
            }
            int l = treeHeight(root.left);
            int r = treeHeight(root.right);
            return (l > r) ? l + 1 : r + 1;
        }
}


