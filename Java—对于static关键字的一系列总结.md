# Java—对于static关键字的一系列总结

### static关键字修饰类

1.static关键字只可以修饰内部类，修饰内部类以后该内部类为静态内部类，可以拥有普通域（属性、方法）但是不能问外部类的普通域（因为还没有实例化）；

2.static关键字不能修饰外部类；（编译时报错，报  “ java: 此处不允许使用修饰符static“）

### static关键字修饰属性

static修饰的属性称为类属性，共有属性，与对象实例化无关可用   类.属性名  调用；

```java
public class Test {
    private static int n=20;
    public static void main(String[] args) {
       System.out.println(Test.n);
    }
}
```

### Static关键字修饰方法

表示类方法，与对象实例化无关，通常用于工具方法

### static不能修饰临时变量

换句话说static不能再方法体内出现

### static修饰代码块

static 修饰的代码块是静态代码块，在类加载时执行一次，在构造代码块之前执行；

### 对于static关键字修饰运行顺序问题

```java
public class Test{
    public static Test t1=new Test();
    public static Test t2=new Test();
    static{
        System.out.println("静态块");//3
    }
    {
        System.out.println("构造块");//1 ,2
    }
    public static void print(){
        System.out.println("静态方法");//4
    }
    public static void main(String[] args) {
        Test.print();//4
        new Test();//5
    }
}
```

//在主类中 说明类属性在静态块之前加载完成



```java
class A{
    public static A a1=new A();
    public static A a2=new A();
    {
        System.out.println("A构造块");
    }
    static{
        System.out.println("A静态块");
    }
    public A(){
        System.out.println("A构造方法");
    }
}
public class Test extends A{
    public static Test t1=new Test();
    public static Test t2=new Test();
    static{
        System.out.println("静态块");
    }
    public Test(){
        System.out.println("构造方法");
    }
    {
        System.out.println("构造块");
    }
    public static void main(String[] args) {
        new Test();
        new A();
    }
}
```

![static运行结果](E:\java\总结\static运行结果.jpg)