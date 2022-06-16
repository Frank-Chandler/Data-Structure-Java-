package 课堂.实验.表;

/**
 * @author frank-chandler
 */
public class DoubleLinkedList {
    private HeroNodeT head = new HeroNodeT(0,"","");

    //返回头节点
    public HeroNodeT getHead() {
        return head;
    }


    //遍历双向链表
    public void printList(){

        HeroNodeT temp = head.next;

        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //添加节点到双链表

    public void add(HeroNodeT heroNodeT){

        //因为head节点不可以动，所以我们添加一个辅助遍历temp
        HeroNodeT temp = head;

        //遍历链表找到最后
        while (true){
            //判断是否是最后一个节点
            if (temp.next == null){
                break;//找到最后节点就退出
            }
            temp = temp.next;//不是最后一个节点就往后移
        }
        temp.next = heroNodeT;//推出循环以后就将temp指向链表最后，然后就将传入的节点加入到链表最后
        heroNodeT.pre = temp;//将插入的节点的pre指向前一个节点
    }


    //修改

    public void update(HeroNodeT newHeroNode){

        //先判断链表是否为空
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的节点，根据编号

        HeroNodeT temp = head.next;
        boolean flag = false;
        while (true){

            if (temp == null){
                break;
            }
            if (temp.no == newHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag){
            temp.name = newHeroNode.name;
            temp.nickName = newHeroNode.nickName;
        }else{
            System.out.printf("编号为 %d 的节点没有找到\n",newHeroNode.no);
        }

    }


    //删除一个节点
    //双向链表我们可以直接找到要删除的节点，然后直接删除
    public void del(int no){

        //判断链表是否为空
        if (head.next == null){
            System.out.printf("链表为空\n");
            return;
        }

        HeroNodeT temp = head.next;

        boolean flag = false;//标志是否找到要删除的节点
        while (true){

            if (temp == null){//已经到节点最后
                break;
            }
            if (temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.pre.next = temp.next;
            temp.next.pre = temp.pre;
            System.out.printf("删除 %d 节点\n",no);
        }else {
            System.out.printf("删除失败\n");
        }
    }
}
