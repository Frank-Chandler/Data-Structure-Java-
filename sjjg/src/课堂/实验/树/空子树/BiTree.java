package 课堂.实验.树.空子树;

/**
 * @author frank-chandler
 */
public class BiTree {
    private TreeNode root;
    public BiTree(String str) {//标明空子树
        String s = str.replaceAll("#", "");
        char[] chars = s.toCharArray();
        root = new TreeNode(chars[0] + "");
        root.setLchild(new TreeNode(chars[1] + ""));
        root.setRchild(new TreeNode(chars[2] + ""));
        root.getLchild().setLchild(new TreeNode(chars[3] + ""));
    }
    //前序遍历
    public void preRootTraverse() {
        if (root != null) {
            root.preRootTraverse();
        } else {
            System.out.println("二叉树为空");
        }
    }
    //中序遍历
    public void inOrderTraverse(){
        if (root != null){
            root.inOrderTraverse();
        }else{
            System.out.println("二叉树为空");
        }
    }
    //后序遍历
    public void postOrderTraverse(){
        if (root != null){
            root.postOrderTraverse();
        }else{
            System.out.println("二叉树为空");
        }
    }
}

