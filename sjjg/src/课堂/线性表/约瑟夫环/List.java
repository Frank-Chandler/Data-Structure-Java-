package 课堂.线性表.约瑟夫环;

import java.util.Comparator;

public interface List<E> extends Iterable {
    //添加元素
    public void  add(E element);
    //指定角标处添加
    public  void add( int index, E element);
    //删除元素
    public  void  remove(E element);
    //删除角标元素并返回
    public E remove(int index);
    //查找元素e的角标（从左到右默认第一个出现的元素角标）
    int find(E e);
    //获取指定角标处元素
    public E get(int index);
    //修改
    public  E set(int index,E element);
    //获取线性表元素个数
    public  int size();
    //查看元素首次出现位置
    public  int indexOf(E element);
    //判断是否包含元素
    public boolean contains(E element);
    //判断线性表是否为空
    public boolean isEmpty();
    //清空线性表
    public  void  clear();
    //按照比较器的内容排序
    public  void  sort(Comparator<E> c);
    //获取一个子线性表[fromindex,toindex]。。
    public List<E> subList(int fromIndex, int toIndex);
}
