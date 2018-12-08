# java—代码块块

1.普通代码块

2.构造代码块

3.静态代码块



### 普通代码块

**定义：1.定义在方法中**

**2.没有任何关键字修饰**

```java
public class Day9To1{
    public static void main(String[] args){
        {
            int x=10;
            System.out.println(x);
        }
        int x=20;
            System.out.println(x);
        
    } 
}
```

主要用于代码过长导致重名的问题



### 构造代码块

**定义：1.定义在类中**

​	   **2.没有任何关键字修饰**

```java
class Person{
    private String name;
    private int age;
    public static String country;
    {
        System.out.println("1.调用了构造块");
        name="张三";
        age=10;
    }
    public Person(){
        System.out.println("2.调用了构造方法");
    }
}
public class Day9To1{
    public static void main(String[] args){
        new Person();
        new Person();
    }
}

```



上述代码的运行结果是  这里只写编号

```java
1  2  1  2
```



**我们可以得出结论**

**1.构造块优先于构造方法执行**

**2.产生多少实例化对象就调用几次**



### 静态块

定义：1.定义在类中

​           2.在  {}最前面有static关键字修饰

#### 静态块在非主类中     /     静态块在主类中

```java
class Person{
    private String name;
    private int age;
    public static String country;
    {
        System.out.println("1.调用了构造块");
        name="张三";
        age=10;
    }
    public Person(){
        System.out.println("2.调用了构造方法");
    }
    static{
        System.out.println("3.调用了静态块");
        Person.country="中华人民共和国";
    }
    public void print(){
        System.out.println(name+" "+age+" "+"出生在"+country);
    }
}
public class Day9To1{
    public static void main(String[] args){
        new Person();
        new Person().print();
    }
    static{
        System.out.println("4.静态在主类执行");

    }
}
```



执行结构

```java
4.静态在主类执行
3.调用了静态块
1.调用了构造块
2.调用了构造方法
1.调用了构造块
2.调用了构造方法
张三 10 出生在中华人民共和国
```



结论

- 静态块在非主类

  1.静态块优先于构造块执行；

  2.无论 对象实例化多少次 静态块只在类加载时执行一次 （与对象实例化无关）；

- 静态块在主类；

  1.静态块优先于主方法执行；

  