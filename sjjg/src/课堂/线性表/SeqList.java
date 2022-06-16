package 课堂.线性表;

/**
 * @author frank-chandler
 */
public class SeqList implements List {
    final int defaultSize=10;
    Object[] listArray;
    int maxSize;
    int size;
    public SeqList ()
    {
        this . maxSize=defaultSize;
        this. size=0;
        this. listArray=new Object [defaultSize] ;

    }
    public SeqList (int arrayLength)
    {
        // TODO: 顺序表初始化
        this . maxSize=arrayLength;
        this. size=0;
        this. listArray=new Object [arrayLength] ;

    }
    @Override
    public Object delete(int i) {
        // TODO: 顺序表删除元素

        Object obj=listArray[i] ;
        for (int j=i; j<size-1;j++) {
            listArray[j]=listArray[j+1] ;
        }
        size--;
        return obj;
    }
    @Override
    public Object getData(int i)
    {
        // TODO 顺序表查找元素
        if(i<0||i>=size) {
            System.out.println("参数错误") ;
        }
        return listArray[i];
    }
    @Override
    public void insert(int i, Object obj) {
        // TODO 顺序表插入元素
        if(size==maxSize) {
            Object[] temp=this. listArray;
            this. listArray=new Object [maxSize*2] ;
            for(int j=0;j<size;j++) {
                listArray[j]=temp[j] ;
            }

            System. out. println ("顺序表已满") ;
        }
        for(int j=size;j>i;j--) {
            listArray[j]=listArray[j-1] ;
        }
        listArray[i]=obj ;
        size++;
    }
    public void insert (Object obj) {
        // TODO: 顺序表队尾插入元素
        this. insert (this.size,obj) ;
    }

    @Override
    public boolean isEmpty() {
        // TODO 顺序表判断是否为空表
        return size==0;
    }
    @Override
    public int size() {
        // TODO 顺序表求表长
        return this.size;
    }

    @Override
    public String toString()
    {
        String str="(";
        str+=this.listArray[0];
        for(int i=1;i<this.size;i++)
        {
            str+=","+this.listArray[i];
        }
        return str+")";
    }

}