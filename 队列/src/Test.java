class MyQueue{
    private Object[] array;
    private Integer front;//队头
    private Integer rear;//队尾
    private Integer size;//总长
    private Integer realSize;//队列实际长度
    public MyQueue(){
        this.front=0;
        this.rear=-1;
        this.size=10;
        this.realSize=0;
        array=new Object[size];
    }
    public MyQueue(int size){
        this.front=0;
        this.rear=-1;
        this.size=size;
        this.realSize=0;
        array=new Object[size];
    }
    //入队
    public void insert(int value){
        //先判断队列是否已满
        if(ifFull()){
            System.out.println("队列已满");
        }else{
            if(rear==size-1){
                rear=0;
                array[rear]=value;
                realSize++;
            }
            else{
                array[++rear]=value;
                realSize++;
            }
        }
    }
    public boolean ifFull(){
        return realSize==size;
    }
    //判空
    public boolean ifEmpty(){
        return realSize==0;
    }
    //出队
    public void remove(){
        if(ifEmpty()){
            System.out.println("队列已空");
        }else {
            if (front == size - 1) {
                front = 0;
                realSize--;
            } else {
                front++;
                realSize--;
            }
        }
    }
    public Object peekFront(){
        return array[front];
    }
    public int getSize(){
        return realSize;
    }
}

public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);//queArray数组数据为[1,2,3]

        System.out.println(queue.peekFront()); //1
        queue.remove();//queArray数组数据为[null,2,3]
        System.out.println(queue.peekFront()); //2

        queue.insert(4);//queArray数组数据为[4,2,3]
        queue.insert(5);//队列已满,queArray数组数据为[4,2,3]
    }
}
