# java—static关键字

- static类属性
- static类方法

### static修饰类中属性

1. 用static修饰的类中属性，又称类属性、共享属性

   2.该属性与 引用对象的实例化无关 只与类有关

   3.该属性可以被所有对象使用 

```java
class Person{
    private String name;
    private int age;
    public static String country;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void print(){
        System.out.println("NAME "+this.name+"AGE "+this.age+"COUNTRY "+this.country);
        this.print1();
    }
}
public class Day9To1{
    public static void main(String[] args){
        Person.country="中华人民共和国";//设置static类属性
        System.out.println(Person.country);//没有对象实例化
        new Person("张三",20);
        new Person("李四",30);
        per1.print();
        per2.print();
    }
}
```



类熟悉 表示一个共享的概念 无论是张三还是李四，都有却定的国籍，所以这个属性两个对象是共享的

类属性 修改

```java
类名.属性名="要修改的值";
```



结论：

static修饰的属性不用对象实例化就可以使用；

非static修饰的属性必须经过对象实例化；





### static修饰类中方法

 1.应用场景 ：用于描绘一些工具方法  （eg.  java.util.Arrays.sort）

2.通过类名直接访问，与对象实例化无关；

```java
class Person{
    private String name;
    private int age;
    public static String country;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void print1(){
         System.out.println("COUNTRY ");
    }
}
public class Day9To1{
    public static void main(String[] args){
        Person per1=new Person("张三",20);
        Person.country="中华人民共和国";
        Person.print1();//通过类名直接调用
    }
}
```



- static方法不允许调用非static方法和属性       （static方法调用时，调用非static的对象还没有实例化） 

- 非static方法允许调用static方法和属性           （ static方法不需要实例化访问）