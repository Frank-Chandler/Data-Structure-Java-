package 课堂.实验.表;


/**
 * @author frank-chandler
 */
public class HeroNodeT {

    public int no;
    public String name;
    public String nickName;
    public HeroNodeT next;//指向下一个节点
    public HeroNodeT pre; //指向上一个节点


    //构造器
    public HeroNodeT(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNodeT{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
