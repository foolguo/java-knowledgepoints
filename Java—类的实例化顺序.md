# Java—类的实例化顺序

### 无继承关系时

1.静态成员变量->静态代码块->构造块->构造方法->普通变量初始化是在构造方法的第一条语句，如果有this()那么初始化在this()后

```java
class Person{
    private int a=10;
    public Person() {
        //private int a=10; 初始化的地方
        System.out.println(a);
    }
    public Person(int a){
        this();
         //private int a=10;初始化的地方 
        this.a=a;
        System.out.println(this.a);
    }
}
public class Test {
    public static void main(String[] args) {
        new Person();
        new Person(5);
    }
}

```

```java
程序运行结果是：
10
10
5
```

### 有继承关系时

1.父类的静态成员变量，父类的静态块（只进行一次,在类加载时）

2.子类的静态成员变量，子类的静态块（只进行一次）

3.父类的构造块->构造方法->普通成员变量（几次new就初始化几次）

4.子类构造块->构造方法->普通成员变量（几次new就初始化几次）



静态成员变量初始化位置：

```java
class A{
    static{
        System.out.println("A的静态块");
    }
    {
        System.out.println("A的构造块");
    }
    public A(){
        System.out.println("A构造方法");
    }
}
class B{
    static A a1=new A();
    static{
        System.out.println("B静态块");
    }
    {
        System.out.println("B构造块");
    }
    public B(){
        System.out.println("B的构造方法");
    }
}
class Test extends B{
    static B b1=new B();
    static B b2=new B();

    static{
        System.out.println("Test静态块");
    }
    {
        System.out.println("Test构造块");
    }
    public Test(){
        System.out.println("Test的构造方法");
    }

    public static void main(String[] args) {
        new B();
        
    }
}
```



我们来分析上面程序，

1.由于Test类的成员变量用 static修饰，在类加载的时候初始化，进入父类B

2.由于B类 的成员变量用static修饰，在类加载时初始化，进入类A；

3.A 里运行顺序是 静态块->构造块->构造方法，然后回到B；

4.B里运行顺序是 静态块->构造块->构造方法，然后回到Test；

5.初始化第二个成员变量，进入B；

6.由于B的静态成员变量和静态块已经被初始化过了，所以不进入A    运行顺序为 >构造块->构造方法，返回Test;

7.执行Test的静态块，进入主方法，  new B（），运行顺序  B 的构造块->构造方法



普通成员变量初始化位置：

```java
abstract  class A{
    public A(){
        this.print();
    }
    abstract  public void print();
}

class B extends  A{
    private int n=100;
    public B(int n){
        super();
        this.n=n;
    }
    public void print(){
        System.out.println(this.n);
    }
}
public class Test {
    public static void main(String[] args) {
        new B(30);
    }
}
```



程序运行结果

```java
0
```



分析：

1.new B(30),执行B的构造方法，但由于B是A 的子类，super()运行父类构造方法；

2.在父类里调用print(),方法，但是由于是实例化的是B，所以，引用的是B的print(),

3.输出B的普通成员变量，这时还没有初始化  所以值为0；

4.会到B的构造方法，然后初始化n为100；

5.然后给你赋值为30；结束

​                                                                                                                                                                                                                                                                                              