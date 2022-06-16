package 课堂.线性表;

/**
 * @author frank-chandler
 */

//创建节点类
public class DoubleNode{
    //数据域--用来保存当前节点的数据
    Object element;
    // 指针域--保存上一个节点的数据
    DoubleNode previous;
    // 指针域--保存下一个节点的数据
    DoubleNode next;

    public DoubleNode(Object element) {

        this.element = element;
    }
}
//public class DoubleNode {
//    public Object data;
//    public DoubleNode prev;
//    public DoubleNode next;
//    public DoubleNode(Object data,DoubleNode prev,DoubleNode next){
//        this.data=data;
//        this.prev=prev;
//        this.next=next;
//    }
//    public DoubleNode(Object data){};
//
//    public DoubleNode() {
//
//    };
//    @Override
//    public String toString(){
//        //类型转换，data-->String
//        return data.toString();
//    }
//}


