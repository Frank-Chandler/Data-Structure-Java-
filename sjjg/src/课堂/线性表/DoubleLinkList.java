package 课堂.线性表;

/**
 * @author frank-chandler
 */
public class DoubleLinkList implements List {
    //创建节点
    //创建首节点
    private DoubleNode first;
    //创建尾结点
    private DoubleNode last;
    //表示节点的个数
    private int count;
    public DoubleLinkList() {
        //TODO 双链表初始化
        first = last = new DoubleNode(null);
        count=0;
    }


    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        //TODO 双链表判断是否为空
        return count==0;
    }

    @Override
    public Object getData(int i) throws Exception {
        //TODO 双链表查找元素
            //1.判断下标的合法性
            if (i<0 || i>=count){
                throw new Exception("size()"+count+"   ,index"+i);
            }

            //2.循环向下指定的节点
            DoubleNode  node = this.first;
            for (int j = 0; j < i; j++) {
                node = node.next;
            }
            return node;
        }

    public DoubleNode getNode(Object element)throws Exception{
        DoubleNode tmp = first;
        if (isEmpty()){
            throw new Exception("链表为null");
        }
        while (tmp!=null){
            if (tmp.element.equals(element)) {
                return tmp;
            }
            tmp = tmp.next;
        }

        return null;
    }


    @Override
    public Object delete(int i) throws Exception {
        //TODO 双链表删除元素
            Object num = null;
            if (i<0 || i>=count){
                throw new Exception("size()"+count+"   ,i"+i);
            }
            if (i == 0){
                num = first.element;
                first = first.next;

            }else if (i == (count-1)){
                num = last.element;
                last = last.previous;
            }else {
                DoubleNode node = getNode(i);
                num = node.element;
                node.previous.next = node.next;
                node.next.previous = node.previous;
            }

            count--;
            return num;

    }


    public void insert(Object element){
        //TODO 双链表队尾插入元素
        //1.实例化一个节点，用来存储这个节点的元素
        DoubleNode node = new DoubleNode(element);
        //2.判断当前的链表是否是空链表
        if (count == 0){//当前的空链表是空
            this.first = node;
        }else {//链表中有元素
            //需要把当前节点挂在尾结点的最后面
            this.last.next = node;
            node.previous = this.last;
        }

        this.last = node;//让last指向当前节点
        count++;
    }

    @Override
    public void insert(int i,Object element) throws Exception {
        //TODO 双链表中间插入元素
        //1.实例化一个节点，用来存储这个节点的元素
        DoubleNode node = new DoubleNode(element);
        if (i<-1||i>count){
                throw new Exception("参数错误！");
        }

        //2.节点关联
        if (i == 0){
            //首位插入一个节点
            this.first.previous = node;
            node.next = this.first;
            this.first = node;
        }else if (i == count){
            //在最后插入一个节点
            this.last = node;
            node.previous = this.last;
            this.last = node;
        }else {
            //在中间插入一个节点
            //先获取当前下标的节点，我们实际是要将node放在target前面
            DoubleNode target = getNode(i);

            //节点关联
            node.next = target;
            node.previous = target.previous;
            target.previous.next = node;
            target.previous = node;
        }
        count++;
    }

}