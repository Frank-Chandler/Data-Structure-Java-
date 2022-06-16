package 课堂.实验.链栈;


/**
 * @author frank-chandler
 */
public interface Stack {
    void push(Object obj) throws Exception;
    Object pop() throws Exception;
    //获取栈顶元素
    Object getTop() throws Exception;
    boolean isEmpty();
}
