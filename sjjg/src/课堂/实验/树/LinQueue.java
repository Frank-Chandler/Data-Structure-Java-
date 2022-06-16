package 课堂.实验.树;
/**
 * @author frank-chandler
 */
public class LinQueue implements Queue {
    Node front;
    Node rear;
    int count;

    public LinQueue() {
        initiate();
    }

    public LinQueue(int sz) {
        initiate();
    }

    private void initiate(){
        front = rear = null;
        count = 0;
    }

    @Override
    public void append(Object obj){ //插入
        Node newNode = new Node(obj, null);//创建新结点

        if (rear != null) {
            rear.next = newNode;//链式新结点
        }
        rear = newNode;//置对尾
        if (front == null){
            front = newNode;//置对头
        }
        count++;
    }

    @Override
    public Object delete() throws Exception {
        if (count == 0) {
            throw new Exception("队列已空");
        }
            Node temp = front;
            front = front.next;
            count--;
            return temp.getData();

    }

    @Override
    public Object getFront() throws Exception {
        return null;
    }

    @Override
    public boolean notEmpty() {

        return false;
    }

}
