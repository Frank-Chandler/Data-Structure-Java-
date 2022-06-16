package 课堂.实验.树;


/**
 * @author frank-chandler
 */
public class Node {
    Object data;
    Node next;

    public Node(Node nextval) {

        next = nextval;
    }

    public Node(Object obj, Node nextval) {
        this.data = obj;
        this.next = nextval;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object obj) {

        this.data = obj;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(Node nextval) {

        this.next = nextval;
    }

    @Override
    public String toString() {

        return data.toString();
    }

}
