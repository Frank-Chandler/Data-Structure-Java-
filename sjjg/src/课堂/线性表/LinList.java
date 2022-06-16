package 课堂.线性表;

/**
 * @author frank-chandler
 */
public class LinList implements List{
    Node head;
    int size;
    Node current;
    public LinList() {
        //TODO 单链表初始化
        head = current = new Node(null);
        size=0;
    }
    @Override
    public int size() {
        //tODO 单链表求表长
        return size;
    }

    @Override
    public boolean isEmpty() {
        //TODO 单链表判断是否为空
        return size==0;
    }

    @Override
    public Object getData(int x)throws Exception{
        //TODO 单链表查找元素
        if (x < -1 || x> size - 1) {
        throw new Exception("参数错误！");
        }
        index(x-1);
        current=head.next;
        for (int j=0;j<x;j++){
            current=current.next;
        }
        return current.getElement();
    }

    @Override
    public Object delete(int x) throws Exception{
        //TODO 单链表删除元素
        if (size==0){
            throw new Exception("无元素可删！");
        }
        if (x<0||x>size-1){
            throw new Exception("参数错误！");
        }
        index(x-1);
        Object obj=current.next.getElement();
        current.next=current.next.next;
        size--;
        return obj;
    }

    @Override
    public void insert(int i, Object obj)throws Exception {
        //TODO 单链表插入元素
        if (i<-1||i>size){
            throw new Exception("参数错误！");
        }
        index(i-1);
        current.setNext(new Node(obj,current.next));
        size++;
    }

    public void index(int x)throws Exception{
        if (x<-1||x>size-1){
            throw new Exception("参数错误!");
        }
        if (x==-1) {
            return;
        }
        current=head.next;
        for (int j=0;j<x;j++){
            current=current.next;
        }
    }
}