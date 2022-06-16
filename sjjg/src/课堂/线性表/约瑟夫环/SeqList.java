package 课堂.线性表.约瑟夫环;

import java.util.Comparator;
import java.util.Iterator;


public class SeqList<T> implements List<T>{
    private Object[] element;
    private int len;
    public SeqList(int size){
        this.element=new Object[size];
        this.len=0;
    }
    public SeqList(){
        this(64);
    }
    public SeqList(SeqList<T> list){//拷贝构造方法（深度拷贝）
        this.len=list.len;
        this.element=new Object[list.element.length];
        for(int i=0;i<list.element.length;i++){
            this.element[i]=list.element[i];
        }

    }
    @Override
    public boolean isEmpty(){
        return this.len==0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void sort(Comparator<T> c) {

    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public int length(){
        return this.len;
    }
    @Override
    public T get(int i){
        if(i>=0&&i<this.len){
            return (T)this.element[i];
        }
        return null;
    }
    @Override
    public T set(int i, T x){
        if(x==null){
            return x;
        }
        if(i>=0&&i<this.len){
            this.element[i]=x;
        } else{
            throw new IndexOutOfBoundsException(i+"");
        }
        return x;
    }

    @Override
    public int size() {
        return 0;
    }

    public void insert(int i,T x){
        if(x==null){
            return;
        }
        if(this.len==this.element.length){
            Object[] temp=this.element;
            this.element=new Object[this.element.length*2];
            for(int j=0;j<temp.length;j++){
                this.element[j]=temp[j];
            }
        }
        if(i<0){
            i=0;
        }
        if(i>this.len){
            i=this.len;
        }
        for(int j=this.len-1;j>=i;j--){
            this.element[j+1]=this.element[j];
        }
        this.element[i]=x;
        this.len++;
    }
    public void append(T x){
        insert(this.len,x);
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public T remove(int i){
        if(this.len==0||i<0||i>=this.len){
            return null;
        }
        T old=(T)this.element[i];
        for(int j=i;j<this.len-1;j++){
            this.element[j]=this.element[j+1];
        }
        this.element[this.len-1]=null;
        this.len--;
        return old;
    }

    @Override
    public int find(T t) {
        return 0;
    }

    public void removeAll(){
        this.len=0;
    }
    public T search(T key){
        int index=this.indexOf(key);
        return index==-1?null:(T)this.element[index];
    }
    @Override
    public int indexOf(T key){
        if(key!=null){
            for(int i=0;i<this.len;i++){
                if(this.element[i].equals(key)){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    public boolean contain(T key){
        return this.indexOf(key)>=0;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) {
            return true;
        }
        if(o instanceof SeqList){
            SeqList<T> list=(SeqList<T>)o;
            if(list.length()==this.length()){
                for(int i=0;i<list.length();i++){
                    if(!this.get(i).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        String str="(";
        if(this.len>0){
            for(int i=0;i<this.len;i++){
                if(i<this.len-1) {
                    str+=this.element[i].toString()+",";
                } else {
                    str+=this.element[i].toString();
                }
            }
        }
        return str+")";
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
