#斐波那契数—java

####创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。

1.要点 

​         java Fibonacci 5(Fibonacci为类名)

​         这样从String[] args 接收的是一个String类型   不能发生运算所以要将其转换成int类型

2.解题思路：

   fabonacci  :每一个数等于前两个数之和，第一个和第二个数除外：

-  递归思想

  

```java
public class Fibonacci{
    public static void main(String[] args){
        int size=Integer.parseInt(args[0]);
        for(int i=1;i<=size;i++){
            System.out.print(fabonacci(i)+"\t");
        }  

    }
    public static int fabonacci(int n){//方法声明一定要是static 因为主类无法直接调用非static方法
        if(n==1||n==2){
            return 1;
        }
        else return  fabonacci(n-1)+fabonacci(n-2);
    }
}
```

