package 课堂.线性表;

/**
 * @author frank-chandler
 */
public interface List {
    int size();
    boolean isEmpty();
    Object getData(int i) throws Exception;
    Object delete(int i) throws Exception;
    void insert(int i,Object obj) throws Exception;
}
