package 课堂.堆栈;

/**
 * @author shkstart
 * @create 2022-04-26-15:59
 */
public interface Stack {
     void push(Object obj) throws Exception;
     Object pop() throws Exception;
     Object getTop() throws Exception;
     boolean notEmpty();
}
