package 课堂.线性表;

/**
 * @author frank-chandler
 */
public class Node {
    Object data;
    Node next;
    Node(Node nextval){
        // TODO 头结点构造函数
        next=nextval;
    }
    Node(Object obj,Node nextval){
        //TODO 其他节点构造函数
        data=obj;
        next=nextval;
    }
    public Node getNext(){
        //取next
        return next;
    }
    public void setNext(Node nextval){
        //置next
        next=nextval;
    }
    public Object getElement(){
        //取data
        return data;
    }
    public void setElement(Object obj){
        data=obj;
    }
    @Override
    public String toString(){
        //类型转换，data-->String
        return data.toString();
    }

}
