package 课堂.实验.树;
/**
 * @author frank-chandler
 */
public interface Queue {
    void append(Object obj) throws Exception;
    Object delete() throws Exception;
    Object getFront() throws Exception;
    boolean notEmpty();
}
