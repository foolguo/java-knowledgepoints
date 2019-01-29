/*
public class Test {
    public static void main(String[] args) {

    }
    //冒泡排序
    public static void bumbSort(int[] data){
        int flag=0;
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-i-1;j++){
                if(data[j]>data[j+1]){
                    int tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    //选择排序
    public static void choiceSort(int[] data){
        //每一个字符和它之后的元素比较，如果小于它，就将坐标放到n
        //中，内层循环结束，找到最后小元素，与外侧元素交换
        for(int i=0;i<data.length;i++){
            int n=0;
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                   n=j;
                }
            }
            int tmp=data[i];
            data[i]=data[n];
            data[n]=tmp;
        }
    }
    public static void insertSort(int[] data){
        //将第一个元素当做一个序列
        for(int i=1;i<data.length;i++){
            int tmp=data[i];
            int j=i;
            //将比这个元素小的元素插入到之前
            //否则不进入循环，插入到后面去
            while(j>0&&tmp<data[j-1]){
                data[j]=data[j-1];
            }
            data[j]=tmp;
        }
    }
}
*/


/*
写一个栈:
1.可以接收各种类型的元素；
2.可以自动扩容；*/
/*
import java.util.Arrays;
class ArrayStack{
    private Object[] array;
    private int top;
    private int size;
    public ArrayStack(){
        this.size=10;
        this.top=-1;
        array=new  Object[size];
    }

    public ArrayStack(int size) {
        this.size = size;
        this.top=-1;
        array=new Object[size];
    }
    public void push(Object vaule){
        System.out.println(isGrow(top+1));
        array[++top]=vaule;

    }
    public boolean ifFull(int minTop){
        int oldSize=size;
        if(minTop>=oldSize){
            int newSize=0;
            if(oldSize<<1-Integer.MAX_VALUE>0){
                newSize=Integer.MAX_VALUE;
            }else {
                newSize=oldSize<<1;
            }
            this.size=newSize;
            array=Arrays.copyOf(array,newSize);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isGrow(int minCapacity){
        int oldCapacity = size;
        //如果当前元素压入栈之后总容量大于前面定义的容量，则需要扩容
        if(minCapacity >= oldCapacity){
            //定义扩大之后栈的总容量
            int newCapacity = 0;
            //栈容量扩大两倍(左移一位)看是否超过int类型所表示的最大范围
            if((oldCapacity<<1) - Integer.MAX_VALUE >0){
                newCapacity = Integer.MAX_VALUE;
            }else{
                newCapacity = (oldCapacity<<1);//左移一位，相当于*2
            }
            this.size = newCapacity;
            int[] newArray = new int[size];
            array = Arrays.copyOf(array, size);
            return true;
        }else{
            return false;
        }
    }
    public boolean ifEmpty(){
        return top==-1;
    }
    public Object pop(){
        return array[top--];
    }
    public Object peek(){
        return array[top];
    }
}
public class Test{
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push("ABC");


    }
}*/


/*
栈的字符串逆序
用自带栈 ，
*/

/*
import java.util.Stack;

class testStringReversal{
    private String str;
    public testStringReversal(String str) {
        this.str = str;
    }
    public void reverse(){
        Stack stack=new Stack();
        char[] data=str.toCharArray();
        for(char i:data){
            stack.push(i);
        }
        while(!(stack.empty())){
            System.out.print(stack.pop());
        }
    }
}
public class Test{
    public static void main(String[] args) {
        testStringReversal t=new testStringReversal("How are you");
        t.reverse();
    }
}
*/

/*
写过xml标签或者html标签的，我们都知道<必须和最近的>进行匹配，[ 也必须和最近的 ] 进行匹配。

        　　比如：<abc[123]abc>这是符号相匹配的，如果是 <abc[123>abc] 那就是不匹配的。

        　　对于 12<a[b{c}]>，我们分析在栈中的数据：遇到匹配正确的就消除
*/


import java.util.Stack;

//判断分隔符是否匹配
public class Test{
    public static void main(String[] args) {
        System.out.println(ifmatch("<abc[123]abc>"));
        System.out.println(ifmatch("<abc[123>abc])"));
        System.out.println(ifmatch("12<a[b{c}]>"));
    }
    public static boolean ifmatch(String str){
        char[] data=str.toCharArray();
        Stack stack=new Stack();
        for (int i=0;i<data.length;i++){
            switch (data[i]){
                case '<':
                case '{':
                case '[':
                    stack.push(data[i]);break;
                case '>':
                case '}':
                case ']':
                    if (!(stack.empty())) {
                    Object ch=stack.peek();
                    char c=ch.toString().charAt(0);
                    if((data[i]=='>'&&c=='<')||(data[i]=='}'&&c=='{')||(data[i]==']'&&c=='[')){
                            stack.pop();
                        }
                }
                    break;
                default:
                    break;
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}