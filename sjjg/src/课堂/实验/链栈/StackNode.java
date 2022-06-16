package 课堂.实验.链栈;


/**
 * @author frank-chandler
 */
public class StackNode {
    Object element; //数据域
    StackNode next;  //指针域

    //头结点的构造方法
    public StackNode(StackNode nextval) {
        this.next = nextval;
    }

    //非头结点的构造方法
    public StackNode(Object obj, StackNode nextval) {
        this.element = obj;
        this.next = nextval;
    }

    //获得当前结点的后继结点
    public StackNode getNext() {
        return this.next;
    }

    //获得当前的数据域的值
    public Object getElement() {
        return this.element;
    }

    //设置当前结点的指针域
    public void setNext(StackNode nextval) {
        this.next = nextval;
    }

    //设置当前结点的数据域
    public void setElement(Object obj) {
        this.element = obj;
    }

    public String toString() {
        return this.element.toString();
    }


}
