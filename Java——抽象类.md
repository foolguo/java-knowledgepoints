# Java——抽象类

> 不要继承已经实现的类，而是继承抽象类和接口

### 抽象类定义

  	1.抽象类就是比普通类多一些抽象方法的类，

​	2.所谓抽象方法就是用abstract关键字修饰的方法，抽象方法没有方法体，就是没有具体实现，抽象方法必须·

​	在抽象类中定义

​	**3.抽象类不可以实例化对象，因为抽象方法没有方法体**

```java
abstarct class A{//抽象类
    public abstract void print();//抽象方法
}
```



### 抽象类使用规则

​	1.抽象类必须有子类

​	2.如果子类不是抽象类，那么子类就必须覆写父类所有的抽象方法；

​	3.子类最好利用对象多态性（向上转型  向下转型）来实例化对象

​	4.private和abstract不可以同时使用

```java
abstract class Animal{//1.抽象类
    private String special;
    private String food;
    private String action;
    public Animal(String special,String food,String action){//2.抽象类的构造方法
        this.special=special;
        this.food=food;
        this.action=action;
    }
    //3.抽象类的普通方法
    public String getSpecial(){
        return this.special;
    }
    public String getFood(){
        return this.food;
    }
    public String getAction(){
        return this.action;
    }
    //4.抽象类的构造方法
    public abstract void action();

}
class Cat extends Animal{
    
    public Cat(String special,String food,String action){
        super(special,food,action);//5.调用父类的有参构造
    }
    public void action(){//6.覆写父类的抽象方法
        System.out.println(super.getSpecial()+"吃"+super.getFood()+"喜欢"+super.getAction());
    }
}
class Dog extends Animal{
    public Dog(String special,String food,String action){
        super(special,food,action);
    }
    public void action(){
        System.out.println(super.getSpecial()+"吃"+super.getFood()+"喜欢"+super.getAction());
    }
}

public class Day18_2{
    public static void main(String[] args){
        Animal cat= new Cat("猫","小鱼干","跳");//对象多态性实例化对象
        cat.action();
    }
}
```



### 抽象类的别的使用规则

1. 抽象类也有构造方法，换句话说  抽象类只是普通类的超集  普通类有的抽象类全有

   

2. 抽象类的抽象方法可以有（0~N）个，但是即使抽象类没有抽象方法，但是不能初始化对象

3. 抽象类不能用final修饰，因为final修饰的类不能被继承

4. 抽象类可以拥有内部抽象类  内部抽象类可以被static修饰 ，但是外部抽象类(任何类不可以 )会发生编译错误

   - 如果抽象内部类是非static的   要继承内部类就必须先继承外部类  且继承后的结构也与父类相同
   - 如果抽象内部类是静态的  则可以越过外部类直接继承    class Y extends 外部类.内部类{}

   ```java
   //--------------------------------------------------------
   //内部类是非静态的
   abstract class  A{
       public abstract void printA();
       abstract  class B{
           public abstract void printB();
       }
   }
   class X extends A{
       public void printA(){}
       class Y extends B{//这里的内部类可以不继承
           public void printA(){}
       }
   }
   //-----------------------------------------------------------
   //内部类是静态的
   abstract class  A{
       public abstract void printA();
       abstract static class B{
           public abstract void printB();
       }
   }
   class X extends A.B{
       public void printB(){}
   }
   public class Day18_2{
       public static void main(String[] args){
           new X().printB();
       }
   }
   ```

   