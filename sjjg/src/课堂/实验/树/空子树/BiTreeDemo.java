package 课堂.实验.树.空子树;

/**
 * @author frank-chandler
 */
public class BiTreeDemo {
    public static void main(String[] args) {
        String str = "#12##34##";
        BiTree bTree = new BiTree(str);
        bTree.preRootTraverse();
        System.out.println();
        bTree.inOrderTraverse();
        System.out.println();
        bTree.postOrderTraverse();
    }
}
