package 课堂.实验.树;

/**
 * @author frank-chandler
 */
public class MyTree {
    public static void printBiTree(TreeNode root, int level){
        //二叉树root各层结点数据元素值的横向输出
        if (root != null){
            //子二叉树的root.getRight()的第level + 1层结点数据元素值的横向输出
            printBiTree(root.getRight(),level + 1);
            if (level != 0){
                //走过6 * (level - 1)个空额
                for (int i = 0; i < 6 * (level - 1); i++) {
                    System.out.print(" ");
                }
                System.out.print("---");//输出横线
            }
            System.out.println(root.data);//输出结点的数据元素值
            //子二叉树root.getLeft()第level + 1层结点数据元素值的横向输出
            printBiTree(root.getLeft(), level + 1);
        }
    }
    public static TreeNode search(TreeNode t, Object x){
        //在二叉树t中查找数据元素x
        TreeNode temp;

        if (t == null){//查找失败出口
            return null;
        }

        if (t.data.equals(x)){//查找成功出口
            return t;
        }
        if (t.getLeft() != null){
            temp =search(t.getLeft(), x);//在左子树查找
            if (temp != null){//查找成功结束递归
                return temp;
            }
        }

        if (t.getRight() != null){
            temp =search(t.getRight(), x);//在右子树查找
            if (temp != null){//查找成功结束递归
                return temp;
            }
        }

        return null;//查找失败出口
    }


    public static TreeNode getTreeNode(TreeNode left, TreeNode right, Object item){
        //TODO 构造二叉树
        TreeNode temp = new TreeNode(left,right,item);
        return temp;
    }

    public static TreeNode makeTree(){
        //构造不带结点的二叉链存储结构的二叉树
        TreeNode b,c,d,e,f,g;

        g = getTreeNode(null, null, new Character('G'));
        d= getTreeNode(null, g, new Character('D'));
        b = getTreeNode(d, null, new Character('B'));
        e = getTreeNode(null, null, new Character('E'));
        f = getTreeNode(null, null, new Character('F'));
        c = getTreeNode(e, f, new Character('C'));
        return getTreeNode(b, c, new Character('A'));

    }


}
