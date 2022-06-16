package 课堂.队列;


/**
 * @author frank-chandler
 */
public class Test {
    public static void main(String[] args) throws Exception {
        IQueue iQueue = new ShunxuQueue(10);
        iQueue.offer("张三");
        iQueue.offer("李四");
        iQueue.offer("王五");
        iQueue.offer("小红");
        iQueue.offer("小明");
        System.out.println(iQueue.length());
        while (!iQueue.isEmpty()){
            System.out.println(iQueue.poll());
        }
        //测试其它方法
//        iQueue.clear();
//        System.out.println(iQueue.isEmpty());
//        System.out.println(iQueue.peek());
    }
}
