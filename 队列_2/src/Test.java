/*优先级队列，有序队列，入队时按照有序的顺序排列
这里依旧用数组实现，效率高的用堆实现
2.删除，优先级高的先删除
一般情况下，查找操作用来搜索优先权最大的元素，
删除操作用来删除该元素 。对于优先权相同的元素，
可按先进先出次序处理或按任意优先权进行。
*/
/*class PriorityQue{
    private int[] array;
    private int maxsize;
    private int nItems;

    public PriorityQue(int maxsize) {
        this.maxsize = maxsize;
        array=new int[maxsize];
    }
    //1.插入数据
    public void insert(int value){
        if(nItems==0){
            array[nItems++]=value;
        }else{
            int j=nItems-1;
            while(j>=0&&value>array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=value;
            nItems++;
        }
    }
    public int  remove(){
        int j=nItems-1;
        int n=array[j];
        array[j]=-1;
        nItems--;
        return n;
    }
    public int peekMin(){
        return array[nItems-1];
    }
    public boolean ifEmpty(){
        return 0==nItems;
    }
    public boolean ifFull(){
        return maxsize==nItems;
    }
    public void display(){
        if(nItems!=0){
            for(int i=0;i<nItems;i++){
                System.out.print(array[i]+"、");
            }
        }
    }
}
public class Test {
    public static void main(String[] args) {
        PriorityQue que=new PriorityQue(10);
        que.insert(3);
        que.insert(6);
        que.insert(1);
        que.insert(9);
        que.display();
    }
}*/

/*单向队列
* 队头移除数据，队尾插入数据
* */
/*
class Queue{
    private Object[] array;
    private int front;
    private int rear;
    private int nItems;
    private int maxSize;
    public Queue(int maxSize){
        this.maxSize=maxSize;
        array=new Object[maxSize];
         front=0;
         rear=-1;
    }
    //入队操作
    //先判断队列是否已满
    //rear指针是否已经走到队尾
    public void insert(Object value){
        if(!(ifFull())){
            if(rear==maxSize-1){
                rear=-1;
                array[++rear]=value;
                nItems++;
            }else{
                array[++rear]=value;
                nItems++;
            }

        }
    }
    public Object remove() {
        Object removeValue = null ;
        if (!(ifEmpty())) {
           if(front==maxSize-1){
               removeValue=array[front];
               array[front]=null;
               front=0;
               nItems--;
               return removeValue;
           }else{
               removeValue=array[front];
               array[front]=null;
               front++;
               nItems--;
               return removeValue;
           }
        }
        return removeValue ;
        */
/*Object removeValue = null ;
        if(!ifEmpty()){
            removeValue = array[front];
            array[front] = null;
            front++;
            if(front == maxSize){
                front = 0;
            }
            nItems--;
            return removeValue;
        }
        return removeValue;*//*

    }
    //判断队列是否已满
    public boolean ifFull(){
            return this.maxSize==this.nItems;
        }
    public boolean ifEmpty(){
        return nItems==0;
    }
    public Object peekFront(){
        return array[front];
    }
}
public class Test{
    public static void main(String[] args) {
       Queue queue = new Queue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);//queArray数组数据为[1,2,3]
        System.out.println(queue.peekFront()); //1
        queue.remove();//queArray数组数据为[null,2,3]
        System.out.println(queue.peekFront()); //2

        queue.insert(4);//queArray数组数据为[4,2,3]
        queue.insert(5);//队列已满,queArray数组数据为[4,2,3]
    }
}*/

/*
栈：线性表，先进后出，在栈的同一头删除或者添加元素*/
/*
import java.util.Arrays;
class MyStatck{
    private Object[] array;
    private  int top;
    private  int size;
    public MyStatck(int size) {
        this.size = size;
        array=new Object[size];
        this.top=-1;
    }
    //入栈
    public void insert(Object value){
        ifFull(top+1);
        array[++top]=value;
    }
    public boolean ifFull(int realSize){
        int oldsize=size;
        if(realSize>=oldsize){
            int n=0;
            if((oldsize<<1)-Integer.MAX_VALUE>0){
                n=Integer.MAX_VALUE;
            }else{
                n=oldsize<<1;
            }
            size=n;
            array=Arrays.copyOf(array,n);
            return true;
        }
        return false;
    }
    public Object remove(){
        return array[top--];
    }
    public Object peek(){
        return array[top];
    }
    public boolean ifEmpty(){
        return top==size-1;
    }
}
public  class Test{
    public static void main(String[] args) {
        MyStatck statck=new MyStatck(3);
        statck.insert(1);
        statck.insert(2);
        statck.insert(3);
        statck.insert("abc");
        System.out.println(statck.remove());
        System.out.println(statck.peek());

    }
}*/

/*
排序*/

/*
public class Test{
    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=9;
        array[1]=5;
        array[2]=7;
        array[3]=6;
        array[4]=1;
        bumbSort(array);
//        choiceSort(array);
//        insertSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"、");
        }
    }
    public static void bumbSort(int[] array){
        int flag=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    public static void choiceSort(int[] array){
        for(int i=0;i<array.length;i++){
            int n=i;
            for (int j=i+1;j<array.length;j++){
                if (array[n]>array[j]){
                    n=j;
                }
            }
            int tmp=array[i];
            array[i]=array[n];
            array[n]=tmp;
        }
    }
    public static void  insertSort(int[] array){

        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=i;
            while(j>0&&tmp<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=tmp;
        }
    }
}
*/
