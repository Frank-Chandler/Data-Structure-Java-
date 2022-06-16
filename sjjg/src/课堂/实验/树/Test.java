package 课堂.实验.树;


import static 课堂.实验.树.MyTree.*;

/**
 * @author frank-chandler
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root;
        TreeNode temp;

        print_visit printvisit = new print_visit();//创建visit类对象

        root = makeTree();
        System.out.println("二叉树为：");
        printBiTree(root, 0);
        System.out.println();

        System.out.print("前序遍历结点序列为：");
        Traverse.preOrder(root, printvisit);//调用preOrder()方法
        System.out.println();

        System.out.print("中序遍历结点序列为：");
        Traverse.inOrder(root, printvisit);
        System.out.println();

        System.out.print("后序遍历结点序列为：");
        Traverse.postOrder(root, printvisit);
        System.out.println();

        System.out.print("层序遍历结点序列为：");

        try {
            Traverse.levelOrder(root, printvisit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        temp = search(root, new Character('C'));
        if (temp != null){
            System.out.println("查到的结点数据值为：" + temp.data);
        }else {
            System.out.println("查找失败");
        }
    }
}
