package 课堂.线性表;

public class Josepfu {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addCriminal(5);
        circleSingleLinkedList.show();
        circleSingleLinkedList.countCriminal(1, 2, 5);
    }
}

class CircleSingleLinkedList{
    private Criminal first = null;
    public void addCriminal(int nums) {
        if(nums < 1) {
            System.out.println("输入数值不正确，请重新输入~~");
            return;
        }

        Criminal curCriminal = null;
        for(int i = 1; i <= nums; i++) {
            Criminal criminal = new Criminal((char)('@'+i));
            if(i == 1) {
                first = criminal;
                first.next = first;
                curCriminal = first;
            }else {
                curCriminal.next = criminal;
                criminal.next = first;
                curCriminal = criminal;
            }
        }
    }


    public void show() {
        if(first == null) {
            System.out.println("环形链表为空~~~");
            return;
        }
        Criminal curCriminal = first;
        while(true) {
            System.out.printf("罪犯的编号为%s\n", (char)(curCriminal.no));
            if(curCriminal.next == first) {
                break;
            }
            curCriminal = curCriminal.next;
        }
    }

    public void countCriminal(int startNo, int countNum, int nums) {
        //对数据进行校验
        if(first == null || startNo < 1|| startNo > nums) {
            System.out.println("参数输入有误，请重新输入~~");
            return;
        }
        Criminal helper = first;
        while(true) {
            if(helper.next == first) {
                break;
            }
            helper = helper.next;
        }

        for(int j = 0; j <startNo - 1; j++) {
            first = first.next;
            helper = helper.next;
        }

        while(true) {
            if(helper == first) {
                break;
            }

            for(int j = 0; j < countNum - 1; j++) {
                first = first.next;
                helper = helper.next;
            }

            System.out.printf("罪犯%s出局\n", (char)(first.no));
            first = first.next;
            helper.next = first;
        }
        System.out.printf("最后留在圈中的罪犯的编号为%s\n", (char)(first.no));
    }
}

//定义罪犯结点
class Criminal {
    public int no;
    public Criminal next;
    public Criminal(char no) {
        this.no= no;
    }
}
