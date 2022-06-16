package 课堂.实验.树.层次遍历;

import java.util.List;

/**
 * @author frank-chandler
 */
public class demo {
    public static void main(String[] args) {
        //创建二叉树
        TreeNode t = new TreeNode(7);
        t.left = new TreeNode(6);
        t.right = new TreeNode(5);
        t.left.left = new TreeNode(4);
        t.left.left.right = new TreeNode(3);
        t.right.left = new TreeNode(2);
        t.right.right = new TreeNode(1);
        //执行层序遍历方法
        List<List<Integer>> lists = LevelOrder.levelOrder(t);
        System.out.println(lists);
    }
}

