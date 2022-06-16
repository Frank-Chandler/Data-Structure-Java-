package 课堂.队列;


import java.util.Scanner;

/**
 * @author frank-chandler
 */
public class ReverseNum {
    //TODO 判断是不是回文数
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean result = obj.isPalindrome(x);
        if(result == true) {
            System.out.println("是回文数!");
        }else {
            System.out.println("不是回文数!");
        }
    }
}
