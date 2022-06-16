package 课堂.队列;

/**
 * @author frank-chandler
 */
public class ShunxuQueue implements IQueue {
    //TODO 顺序队列初始化
    int front = 0;
    int rear = 0;
    Object[] objArray;

    public ShunxuQueue(int n){
        objArray = new Object[n];
    }


    @Override
    public void clear() {
        //TODO 顺序队列清空
        objArray = null;
        front = rear = 0;
    }

    @Override
    public boolean isEmpty() {
        //TODO 顺序队列判断是否为空
        return front == rear;
    }

    @Override
    public int length() {
        //TODO 顺序队列求长度
        return rear - front;
    }

    @Override
    public Object peek() {
        if(objArray!=null){
            return objArray[front];
        }
        return null;
    }

    @Override
    public void offer(Object object) throws Exception{
        //TODO 顺序队列入队
        rear++;
        if(rear<=objArray.length)
        {objArray[rear-1] = object;}
        else{
            throw new Exception("队列已满");}

    }

    @Override
    public Object poll() {
        //TODO 顺序队列出队
        if(front!=rear){
            Object obj = objArray[front];
            front++;
            return obj;
        }
        return null;
    }
}
