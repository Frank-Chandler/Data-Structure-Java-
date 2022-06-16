package 课堂.实验.链栈;

import java.util.Scanner;


/**
 * @author frank-chandler
 */
public class zhan {
    public static void main(String[] args) throws Exception {
        //SequenceStack stack = new SequenceStack(10);
        LinkedStack stack = new LinkedStack();
        Scanner in = new Scanner(System.in);
        int temp;
        for (int i = 0; i < 7; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数：");
            temp = in.nextInt();
            stack.push(temp);
        }
        //遍历输出
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "\t");
        }
    }

}
