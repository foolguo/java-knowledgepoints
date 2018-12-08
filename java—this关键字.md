# java—this关键字

- **this表示调用当前属性**
- **this表示调用当前方法**
- **this表示当前对象**



### this表示调用当前属性

应用场景：用于 方法形参 与类中属性重名时 区别两者

eg .....1

```java
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;//this调用本类属性
    }
}
```

上面代码如果不加this 则 Person类中name和age属性的值不会被设置  

会自动的就近原则 认为name就是形参name；

### this表示调用当前方法

> 优点：可以降低代码的重复率：

#### 调用构造方法

 **语法   ：**       

```java
//调用无参的构造方法
 this();
//调用有参的构造方法
this(参数1,参数2,参数3.....)
```

 ！！！！！！！！！！！！  ***重点：this在调用构造方法时，必须在构造方法的第一句***！！！！！！！！！！！！

eg.....2

```java

class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("1.调用了无参的构造方法");
    }
    public Person(String name){
        this();//this调用本类方法    this在调用构造方法时，必须在构造方法的第一句
        System.out.println("2.调用了一个参数的构造方法");
        this.name=name;//this调用本类属性
    }
    public Person(String name,int age){
        this(name);//this调用有参的构造方法    重点：this在调用构造方法时，必须在构造方法的第一句
        System.out.println("3.调用了两个参数的构造方法");
        this.age=age;//this调用本类属性
    }
}
```



#### 调用普通方法

**语法**

```java
this.方法名（形参表）
```

eg......3

```java
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;//this调用本类属性
        this.print();
    }
    
    public void print(){
        System.out.print("***********");
    }
}
```

虽然，在类中不用加this也可以调用普通方法，但还是推荐加上，因为这样可以强调这个方法是自己的，对继承有帮助



### this表示调用当前对象

> this表示当前调用print方法的对象

eg......4

```java
   public class Person{
    private String name;
    private int age;
    public void print(){
        System.out.println("this 表示当前对象："+this);//this表示当前对象
     }
       public static void main(String[] args){
           Person per=new Person();
           System.out.print(per.print());
       }
   }
```







