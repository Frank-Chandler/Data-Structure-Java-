package 课堂.队列;


/**
 * @author frank-chandler
 */
public interface IQueue {
    void clear();
    boolean isEmpty();
    int length();
    Object peek();//查看队列头元素
    void offer(Object object) throws Exception;//入队
    Object poll();//出队
}

