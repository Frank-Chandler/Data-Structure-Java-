package 课堂.线性表.约瑟夫环;

public class Josephus {
    private List<String> list;//创建顺序表，用来存储元素

    /*
     * 创建约瑟夫环并求解，指定其长度、起始位置、计数
     */
    public Josephus(int number,int start,int distance){
       SeqList<String> list= new SeqList<String>(number);//创建指定容量的的顺序表
        for(int i=0;i<number;i++){
            list.append(new String((char)('A'+i)+""));//添加字符串对象
        }
        System.out.print("约瑟夫环("+number+","+start+","+distance+"),");
        System.out.println(list.toString());//显示字符串

        int index = start-1;//计数起始位置
        while(list.length()>1){//只有在多余一个对象时才执行删除操作
            index = (index+distance-1) % list.length();
            System.out.print("删除"+list.remove(index).toString()+",");
            System.out.println(list.toString());
        }
        System.out.println("被赦免者是："+list.get(0).toString());
    }

    public static void main(String[] args) {
        new Josephus(6,1,4);
    }
}
