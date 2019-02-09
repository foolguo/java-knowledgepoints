//1.栈：一种数据结构，线性表，特点：先进后出，只在栈顶添加或者删除数据
//要求，当栈满了可以自动扩容
/*
import java.util.Arrays;
class MyStack{
    private int top;
    private int maxsize;
    private Object[] array;

    public MyStack(){
        this.top=-1;
        maxsize=10;
        array=new Object[maxsize];
    }
    public MyStack(int maxsize){
        this.maxsize=maxsize;
        this.top=-1;
        array=new Object[maxsize];
    }
    public void push(Object data){
        System.out.println(ifGrow(top+1));
        array[++top]=data;
    }
    public boolean ifEmpty(){
      return top==-1;
    }
    public Object peek(){
        return array[top];
    }
    public Object pop(){
        if(ifEmpty()){
            return null;
        }
        Object temp=array[top];
        array[top]=null;
        top--;
        return temp;

    }
    public boolean ifGrow(int minsize) {
        int oldsize = maxsize;
        if (minsize>= oldsize) {
            int temp = 0;
            if ((oldsize << 1) - Integer.MAX_VALUE > 0) {
                temp = Integer.MAX_VALUE;
            } else {
                temp = oldsize << 1;
            }
            System.out.println(maxsize);
            array = Arrays.copyOf(array, maxsize);
            return true;
        }
        return false;
    }
}

public class Test {
    public static void main(String[] args) {
        MyStack stack=new MyStack(3);
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());


    }
}
*/

import java.util.Stack;

/*
字符串逆序：*/
public class Test{
    public static void main(String[] args) {
        Stack stack=new Stack();
        String str="hello world";
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            stack.push(data[i]);
        }
        for (int i=0;i<data.length;i++){
            System.out.print(stack.pop());
        }


    }
}