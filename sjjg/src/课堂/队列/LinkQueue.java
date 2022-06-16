package 课堂.队列;

import java.io.Serializable;


/**
 * @author frank-chandler
 */
public class LinkQueue<T> implements Serializable {
    private static final long serialVersionUID = -6726728595616312615L;

    //定义一个内部类Node，Node实例代表链队列的节点。
    private class Node {

        private T data;//保存节点的数据

        private Node next;//指向下个节点的引用

        //无参数的构造器
        public Node() {
        }


        public Node(T data, Node next) {
            //TODO 链队列初始化
            this.data = data;
            this.next = next;
        }
    }

    private Node front;//保存该链队列的头节点

    private Node rear;//保存该链队列的尾节点

    private int size;//保存该链队列中已包含的节点数

    /**
     * <p>Title: LinkQueue </p>
     * <p>Description: 创建空链队列 </p>
     */
    public LinkQueue() {
        //空链队列，front和rear都是null
        front = null;
        rear = null;
    }

    /**
     * <p>Title: LinkQueue </p>
     * <p>Description: 以指定数据元素来创建链队列，该链队列只有一个元素</p>
     */
    public LinkQueue(T element) {
        front = new Node(element, null);
        //只有一个节点，front、rear都指向该节点
        rear = front;
        size++;
    }


    public int size() {
        //TODO 链队列求长度
        return size;
    }


    public void offer(T element) {
        //TODO 链队列入队
        if (front == null) {
            front = new Node(element, null);
            rear = front;//只有一个节点，front、rear都指向该节点
        } else {
            Node newNode = new Node(element, null);//创建新节点
            rear.next = newNode;//让尾节点的next指向新增的节点
            rear = newNode;//以新节点作为新的尾节点
        }
        size++;
    }

    public T poll() {
        //TODO 链队列出队
        Node oldFront = front;
        front = front.next;
        oldFront.next = null;
        size--;
        return oldFront.data;
    }


    public T peek() {

        return rear.data;
    }

    public boolean isEmpty() {
        //TODO 链队列判断是否为空
        return size == 0;
    }

    public void clear() {
        //TODO 链队列清空
        //将front、rear两个节点赋为null
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public String toString() {
        //链队列为空链队列时
        if (isEmpty()) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for (Node current = front; current != null; current = current.next) {
                sb.append(current.data.toString() + ", ");
            }
            int len = sb.length();
            return sb.delete(len - 2, len).append("]").toString();
        }
    }

    public static void main(String[] args) {
        LinkQueue<String> queue = new LinkQueue<String>("aaaa");
        //添加两个元素
        queue.offer("bbbb");
        queue.offer("cccc");
        System.out.println(queue);
        //删除一个元素后
        queue.poll();
        System.out.println("删除一个元素后的队列：" + queue);
        //再次添加一个元素
        queue.offer("dddd");
        System.out.println("再次添加元素后的队列：" + queue);
        //删除一个元素后，队列可以再多加一个元素
        queue.poll();
        //再次加入一个元素
        queue.offer("eeee");
        System.out.println(queue);
    }
}
