# Java—构造方法 -2

在抽象类的总结中，抛出了抽象类也是有构造方法的  我们通过下面的例子来进一步理解构造方法

```java
abstract class A{
    public A(){
        this.print();//1
    }
    public abstract void print();//2
}
class B extends A{
    private int num=100;//3
    public B(int num){
        //super();//4
        this.num=num;//5
    }
    public void print(){
        System.out.println(this.num);//6
    }
}
public class Day18_2{
    public static void main(String[] args){
        new B(30);//7
        new B(30).print();//8
    }
}
```

  上述程序运行结果是  0

​				       0

​				      30

####new B(30)

1.首先，程序执行从主方法开始   **执行7** 实例化对象调用子类的构造方法

2.有因为在调用子类构造方法之前要先调用父类构造方法   也就是**执行4**  （super可省略）

3.到父类构造方法后 **执行1**   现在是B实例化对象，所以调用覆写后的方法 **执行6 ** 由于类B的属性未初始化

  所以，为默认值0；

4.在执行上述三步后，**执行5**  这时num为30 完成赋值后构造方法调用完成

####new B(30).print()

这个匿名对象的执行流程前在前4步完全一样，    **先输出0**

只不过是在   .print()后变的不一样

在执行上述四步后，**执行6**  这时num为30     则输出结果为**30**

