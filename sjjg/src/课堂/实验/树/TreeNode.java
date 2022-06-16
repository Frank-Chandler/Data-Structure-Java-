package 课堂.实验.树;
/**
 * @author frank-chandler
 */
public class TreeNode {
    //TODO 二叉树初始化
    private TreeNode leftChild;
    private TreeNode rightChild;
    public Object data;

    public TreeNode() {
        leftChild = null;
        rightChild = null;
    }

    public TreeNode(TreeNode left, TreeNode right, Object item) {

        this.leftChild = left;
        this.rightChild = right;
        this.data = item;
    }

    public TreeNode getLeft() {
        //TODO 左叶子结点
        return leftChild;
    }

    public TreeNode getRight() {
        //TODO 右叶子结点
        return rightChild;
    }

    public Object getData() {

        return data;
    }
}
