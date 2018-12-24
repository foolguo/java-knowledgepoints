# java—内部类

### 什么是内部类

 	在一个类中嵌套其他类的结构，我们把这样的类叫做内部类

## 存在内部类的意义

​	**1.内部类可以直接访问外部类的所有元素，包括私有域**

​	**2.内部类对所定义结构外完全隐藏（是封装的一种）**

​	**3.内部类弥补了java单继承的缺点**

**eg.--------1**

```java
class Outter{
    private  String name="外部类属性";
    private class Inner{//内部类可以用private修饰
        public void print(){
            System.out.print(name);//内部类访问外部类属性，直接访问
        }
    } 
    public void display(){
        Inner in = new Inner();
        in.print();//外部类访问内部类方法  ，通过内部类引用访问
    }
}
public class Day18{
    public static void main(String[] args){
        // Outter.Inner in=new Outter().new Inner();//在外部类的外部访问
        // in.print();
        Outter out = new Outter();
        out.display();
    }
}
```

 从上诉例子可以验证观点1  ，且内部类可以被private修饰，因为它在外部的结构中，可以通过外部类访问内部类

但是外部类不能被private修饰，原因是private修饰的类对外完全隐藏，不能通过在其他类创建对象引用来访问外部类。



**eg.--------2**

```java
class A{
}
class B{
}
class X{
    class InnerA extends A{
    }
    class InnerB extends B{       
    }
}
```

上述结构可以弥补java的单继承



###内部类与外部类的关系---------相互访问私有域

1.对于非静态内部类，内部类的创建必须依附于外部类，要先实例化外部类的对象 再实例化内部对象

2.内部类与外部类和父类子类不同   不存在IS  A的关系

3.内部类访问外部类元素    ——————直接访问 （因为内部类里面隐藏了一个外部类的对象引用）

   外部类访问内部类元素     ——————间接访问（通过内部类对象引用访问）



eg------1中   display()  方法可以说明

```java
    public void display(){
        Inner in = new Inner();
        in.print();//外部类访问内部类方法  ，通过内部类引用访问
    }
```



### 内部类分类

> 成员内部类
>
> 静态内部类
>
> 方法内部类(局部内部类)
>
> 匿名内部类

####成员内部类

 概念：定义在类中不加任何关键字修饰的类

创建：

​	1.在外部类的内部创建内部类：普通类的声明一样

​	2.在外部类的外部创建内部类：

```java
外部类.内部类 对象引用=new 外部类().new 内部类();
```

注意：

​	1.成员内部类创建必须依附外部类，所以必须先创建外部类 在创建内部类   （在外部类的外部声明要new两次）

2.成员内部类不能定义任何static修饰的属性和方法(发生编译错误)，但是可以访问外部类的静态域

例子请见  **eg.1**



#### 静态内部类

概念： 定义在类中，用static关键字修饰

创建：

```java
外部类.内部类 对象引用=new 外部类. 内部类();//在外部类的外部创键
```

注意：

​	1.静态内部类的创建不需要依附于外部类，（它与普通类没有本质的区别，只是定义在另一个类结构里）

​	2.静态内部类可以拥有普通方法，但不能访问外部类的普通域（因为普通域与对象实例化强相关，而这时外部类没有创建对象）

**eg.------------3**

```java
class Outter{
    private static String name="outter";//必须要定义成类属性才可以被内部类访问
    static class Inner{
        private int age=10;
        public  void print(){
            System.out.println(name+age);
        }
    }
    // public void display(){//在外部类的内部声明内部类的对象
    //     Inner in =new Inner();
    //     in.print();
    // }
}
public class Day18{
    public static void main(String[] args){
        // Outter out = new Outter();
        // out.display();
        Outter.Inner in = new Outter.Inner();//在外部类的外部声明
        in.print(); 
    }
}
```



#### 方法内部类（局部内部类）

定义： 定义在方法中，局部内部类与成员内部类基本一致，只不过作用域不同

   1.局部内部类的作用只在被定义 方法中有效，出了该方法无效 对外完全隐藏

2. 不允许有任何访问权限操作符修饰
3. 如果局部内部类要用方法的形参的话  则形参必须用final修饰 在JDK8 以后变为隐式声明

```java
class Outter{
    private String name="1";
    public void display(final int age){//final可以省略
        class Inner{
            public void println(){
                System.out.println(name+age);
            }
        }
        new Inner().println();//在方法内创建匿名对象
    }
}
public class Day18{
    public static void main(String[] args){
        Outter out= new Outter();
        out.display(10);
    }
}
```



**总结**  ：

​	虽然内部类让类的结构变的复杂，但是在某些情况下它是非常有用的，**eg.-------1**  如果不用内部类  它的结构是这样的

```java
class Outter{
    private String name="Outter";
    public String getName(){//5.因为name是私有的  所以用getter方法获取Outter的私有属性
        return this.name;
    }
    public void display(){
        Inner in = new Inner(this);//3.创建Inner对象，调用Inner对象的构造方法，将当前对象传过去
        in.print();//4.调用print方法
    }
}
class Inner{
    private Outter out;
    public Inner(Outter out){
        this.out=out;//3.引用传递
    }
    public void print(){
        System.out.print(out.getName());//5.输出
    }
}
public class Day18{
    public static void main(String[] args){
        Outter out = new Outter();//1.创建Outter类对象
        out.display();//2.调用displa方法
    }
}
```

充分体现内部类直接调用的好处

