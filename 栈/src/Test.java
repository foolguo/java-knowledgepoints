/*
栈：又叫 堆栈 或者 堆叠 ，是一种数据结构；
  特点，先进后出，第一个入栈的元素最后一个出栈，
    入栈的过程叫做push(进栈)，删除的过程叫做pop(出栈)
*/

/*class ArrayStack{
    private int[] array;
    private Integer top;//栈顶
    private Integer size;//栈容量

    public ArrayStack(int size) {
        this.size = size;
        this.top=-1;
        array=new int[this.size];
    }
    //入栈
    public void push(int value){
        if(!(iffull())){
        array[++top]=value;
        }
    }
    public boolean iffull(){
      return (this.top==this.size-1);

    }
    //出栈，弹出栈顶元素
    public int  pop(){
       return array[top--];
    }
    //访问栈顶元素
    public int peek(){
        return array[top];
    }
    //判空
    public boolean ifEmpty(){
        return (this.top==-1);
    }
}
public class Test {
    public static void main(String[] args) {
        ArrayStack ar=new ArrayStack(5);
        System.out.println(ar.ifEmpty());
        for(int i=0;i<5;i++){
            ar.push(i);
        }
        System.out.println(ar.iffull());
        System.out.println(ar.pop());
        System.out.println(ar.peek());

    }
}*/
/*上述栈结构有三个不足的地方：
1.不能扩容， 如果存入元素超出栈原本的元素，会溢出（自动扩容）
2.不能接收不同数据，众所周知，栈可以存放不同种数据类型，用Object接收
3.用数组定义栈，所以数据都是连续的 而且要初始化大小（链表实现）；*/


/*class ArrayStack{
    private Object[] array;
    private Integer top;//栈顶元素
    private Integer size;//总容量
    public ArrayStack(int size){
        this.size=size;
        top=-1;
        array=new Object[size];
    }
    //入栈
    public void push(Object value){
        ifGlow(top+1);
        array[++top]=value;
    }
    //出栈
    public Object pop(){
        if(ifEmpty()){
            System.out.println("栈以空");
        }
        return array[top--];
    }
    //访问栈顶元素
    public Object peek(){
        return array[top];
    }
    //是否空
    public boolean ifEmpty(){
        if(-1==top){
            return true;
        }
        return false;
    }

    //是否满
    public boolean ifFull(){
        if(this.size-1==top){
            return true;
        }
        return false;
    }
    //是否需要扩容
    public boolean ifGlow(int mintop)
    {
        int oldsize=this.size;
        if(oldsize<=mintop){
            int n=0;
            if(oldsize<<1-Integer.MAX_VALUE>0){
                n=Integer.MAX_VALUE;
            }else{
                n=oldsize<<1;
            }
            this.size=n;
            array=java.util.Arrays.copyOf(array,n);

            return true;
        }else{
            return false;
        }
    }
}
public class Test{
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        //System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}*/
//public class Test{
//    public static void main(String[] args) {
//        Object[] data=new Object[5];
//        data=java.util.Arrays.copyOf(data,10);
//    }
//}

