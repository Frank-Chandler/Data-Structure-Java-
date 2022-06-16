package 课堂.实验.链栈;


/**
 * @author frank-chandler
 */
public class LinkedStack implements Stack {
    StackNode head;  //栈顶指针
    int size;  //结点的个数

    public LinkedStack() {
        head = null;
        size = 0;
    }

    @Override
    public Object getTop() throws Exception {
        return head.getElement();
    }

    @Override
    public boolean isEmpty() {
        //TODO 链栈判断是否为空
        return head == null;
    }

    @Override
    public Object pop() throws Exception {
        //TODO 链栈出栈
        if (isEmpty()) {
            throw new Exception("栈为空！");
        }
        Object obj = head.getElement();
        head = head.getNext();
        size--;
        return obj;
    }

    @Override
    public void push(Object obj) throws Exception {
        //TODO 链栈入栈
        head = new StackNode(obj, head);
        size++;
    }
}

