package 课堂.实验.树.空子树;


/**
 * @author frank-chandler
 */
public class TreeNode {
    @Override
    public String toString() {
        return "TreeNode{" +
                "value='" + value + '\'' +
                '}';
    }
    private String value;//根结点
    private TreeNode lchild;//右孩子结点
    private TreeNode rchild;//左孩子结点

    //前序遍历
    public void preRootTraverse(){
        System.out.println(this.toString());
        if(this.lchild != null) {
            this.lchild.preRootTraverse();
        }
        if(this.rchild != null) {
            this.rchild.preRootTraverse();
        }
    }
    //中序遍历
    public void inOrderTraverse(){
        if (this.lchild != null){
            this.lchild.inOrderTraverse();
        }
        System.out.println(this.toString());
        if(this.rchild != null) {
            this.rchild.inOrderTraverse();
        }
    }
    //后序遍历
    public void postOrderTraverse(){
        if (this.lchild != null){
            this.lchild.postOrderTraverse();
        }
        if(this.rchild != null) {
            this.rchild.postOrderTraverse();
        }
        System.out.println(this.toString());
    }
    public TreeNode(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public TreeNode getLchild() {
        return lchild;
    }
    public void setLchild(TreeNode lchild) {
        this.lchild = lchild;
    }
    public TreeNode getRchild() {
        return rchild;
    }
    public void setRchild(TreeNode rchild) {
        this.rchild = rchild;
    }
}

