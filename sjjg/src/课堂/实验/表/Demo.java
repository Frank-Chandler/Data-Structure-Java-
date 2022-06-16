package 课堂.实验.表;


/**
 * @author frank-chandler
 */
public class Demo {
    public static void main(String[] args){

        System.out.print("双向链表的测试\n");

        HeroNodeT heroNode1 = new HeroNodeT(1,"武松","行者");
        HeroNodeT heroNode2 = new HeroNodeT(2,"关羽","武圣");
        HeroNodeT heroNode3 = new HeroNodeT(3,"花容","小李广");
        HeroNodeT heroNode4 = new HeroNodeT(4,"林冲","豹子头");
        HeroNodeT heroNode5 = new HeroNodeT(5,"卢俊义","玉麒麟");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(heroNode3);
        doubleLinkedList.add(heroNode5);
        doubleLinkedList.add(heroNode2);
        doubleLinkedList.add(heroNode1);
        doubleLinkedList.add(heroNode4);
        doubleLinkedList.printList();

        System.out.print("修改链表\n");
        HeroNodeT heroNode = new HeroNodeT(5,"卢爷","金麒麟");
        doubleLinkedList.update(heroNode);
        doubleLinkedList.printList();

        //删除
        doubleLinkedList.del(1);
        System.out.print("删除之后\n");
        doubleLinkedList.printList();
    }
}
