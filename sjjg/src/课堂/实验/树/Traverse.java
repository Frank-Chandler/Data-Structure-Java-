package 课堂.实验.树;
/**
 * @author frank-chandler
 */
public class Traverse {
    public static void preOrder(TreeNode t, print_visit print_visit){
        //TODO 前序遍历
        if (t !=null){
            print_visit.print(t.data);
            preOrder(t.getLeft(), print_visit);
            preOrder(t.getRight(), print_visit);
        }
    }
    public static void inOrder(TreeNode t, print_visit print_visit){
        //TODO 中序遍历
        if (t !=null){
            inOrder(t.getLeft(), print_visit);
            print_visit.print(t.data);
            inOrder(t.getRight(), print_visit);
        }
    }

    public static void postOrder(TreeNode t, print_visit print_visit){
        //TODO 后序遍历
        if (t !=null){
           postOrder(t.getLeft(), print_visit);
            postOrder(t.getRight(), print_visit);
            print_visit.print(t.data);
        }
    }

    public static void levelOrder(TreeNode t, print_visit print_visit) throws Exception{
        //层序遍历二叉树t,访问结点操作为visit.print(t.data)
        LinQueue q = new LinQueue();//创建链式队列类对象
        if (t == null){
            return;
        }
        TreeNode curr;
        q.append(t);//根节点入队列
       while (!q.notEmpty()){//当队列非空循环
            curr = (TreeNode)q.delete();//出队列
            print_visit.print(curr.data);//访问该结点
            if (curr.getLeft() != null){
                q.append(curr.getLeft());//左孩子进入队列
            }
            if (curr.getRight() != null){
                q.append(curr.getRight());//右孩子进入队列
            }
       }
    }
}
