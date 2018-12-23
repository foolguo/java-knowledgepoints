//抽象类
//  抽象类是有（0~n）个抽象方法的类
//抽象类 不能实例化对象
//抽象类的对象可以通过对象多态性利用子类为其实例化
//抽象类的子类必须覆写抽象类的所有抽象方法
//抽象方法  ： 用abstract修饰  没有方法体的方法  ，定义在抽象类中
// abstract class Person{
//     private String name;
//     public abstract void print();
// }
// class Student extends Person{
//     // public void print(){
//     //     System.out.println("抽象方法覆写");
//     // }
// }

// public class Day17{
//     public static void main(String[] args){
//         Person stu=new Student();
//         // stu.print();
//     }     
// }

// abstract class Person{
//     private String name;
//     public String getName(){
//         return this.name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public abstract void print();
// }
// class Student extends Person{
//     public void print(){

//     }
// }
// public class Day17{
//     public static void main(String[] args){
//         new Student();
//     }
// }

// abstract class Person{
//     private String name;
//     public abstract void  print();

//     public static Person getInceof(){  //内部类继承外部类 ，取得子类对象
//         class Student extends Person{
//             public void print(){
//                 System.out.println("子类功能初始化");
//             }
//         }
//         return new Student();//返回一个子类对象
//     }
// }
// public class Day17{
//     public static void main(String[] args){
//         Person per = Person.getInceof();//1.  执行结果是Person per=new Student()  发生向上转型（对象多态）
//         per.print();//调用Student类覆写后的方法
//     }
// } 




// 抽象类的相关规定
//1.抽象类其实是一些普通类的超集（抽象类只是有一些抽象方法而已）
//，所以抽象方法也有构造方法，所以在实例化子类对象之前要实例化父类对象
// abstract class A{
//     public A(){
//         System.out.println("A的构造方法");
//     }
// }
// class B extends A{
//     public B(){
//         System.out.println("B的构造方法");
//     }
// }



// public class Day17{
//     public static void main(String[] args){
//         new B();
//     }
// }
// abstract class A{
//     public A(){//2.父类构造方法
//         this.print();//3调用子类覆写后的方法
//     }
//     public abstract void print();
// }
// class B extends A{
//     private int num=100;
//     public B(int num){//1.调用构造方法
//         //隐藏super();调用父类构造方法
//         this.num=num;
//     }
//     public void print(){
//         System.out.println(this.num);//由于这时num没有被初始化，所以默认为初始值0
//     }
// }
// public class Day17{
//    public static void mian(String[] args){
//         new B(30);//1.从主方法开始，创建对象
//     }
// }

//2.抽象类中可以 没有抽象方法，但和有抽象方法的抽象类一样，依旧无法实例化对象

//3.抽象类不允许用final 因为final 修饰的类不允许拥有子类   抽象方法也不允许用final修饰
//因为final修饰的方法只允许继承，不允许覆写

//4.抽象类分为  内部抽象类和外部抽象类   内部抽象类可以用static修饰来描述外部抽象类
//有内部类的抽象类，继承了那个类就覆写那个类的
// abstract class A{
//     public abstract void printA();
//     abstract class B{
//         public abstract void printB(); 
//     }
// }
// class X extends A{
//     public void printA(){}
//     class Y extends B{
//         public void printB(){}
//     }
// }
// public class Day17{
//     public static void main(String[] args){
//         new X().new Y();
        
//     }
// }

// abstract class A{
//     public abstract void printA();
//     abstract static class B{
//         public abstract void printB();
//     }
// }
// class X extends A.B{
//     public void printB(){
//         System.out.print("b");
//     }
// }
// public class Day17{
//     public static void main(String[] args){
//         new X().printB();
//     }
// }

//模板 设计模式
// abstract class CoffainDrink{
//     public  void boilWater(){
//         System.out.println("将水烧开");
//     }
//     public void pourIntoCup(){
//         System.out.println("将饮料倒入杯子");
//     }
//     public abstract void brewDrink();
//     public abstract void addcondiment();
//     public final void prepare(){
//         boilWater();
//         brewDrink();
//         pourIntoCup();
//         addcondiment();
//     }
// }
// class Tea extends CoffainDrink{
//     public  void brewDrink(){
//         System.out.println("用热水浸泡茶叶");
//     }
//     public  void addcondiment(){
//         System.out.println("加柠檬");
//     }
// }
// class Coffe extends CoffainDrink{
//     public  void brewDrink(){
//         System.out.println("用热水冲咖啡");
//     }
//     public  void addcondiment(){
//         System.out.println("方糖");
//     }
// }
// public class Day17{
//     public static void main(String[] args){
//         new Tea().prepare();
//         new Coffe().prepare();

//     }
// }

//内部类
//内部类是嵌套在其他类中的类
//缺点： 改变了类的结构，让类的结构变复杂
//优点：内部类可以直接访问外部类的所有域

// class A{
//     private int n=100;
//     class B{
//         public void print(){
//             System.out.println(n);
//         }
//     }
//     public void display(){
//         new B().print();
//     }
// }

// public class Day17{
//     public static void main(String[] args){
//         new A().display();
//     }
// }


//内部类为什么存在
//1.内部类可以访问定义域的所有域；
//2.内部类对外部类之外的类完全隐藏（封装）
//3.内部类可以弥补java中的单继承的缺陷

//3
// class A{
//     public void printA(){
//         System.out.println("A");
//     }
// }
// class B{
//     public void printB(){
//         System.out.println("B");
//     }
// }
// class X{
//     class InnerA extends A{

//     }
//     class InnerB extends B{

//     }

// }


// public class Day17{
//     public static void main(String[] args){
//         new X().new InnerA().printA();
//         new X().new InnerB().printB();

//     }
// }

//内部类和外部类的关系

//对于非static修饰的内部类，内部类的实现依附于外部类，————————先实例化外部类才可以实例化外部类
//内部类访问外部类的元素，直接访问      但是外部类访问内部类的元素 要依靠外部类引用间接访问


//内部类分类

//成员内部类
//定义在类中，没有static修饰
//1. 成员内部类的创建，依附与外部类，
//2.成员内部类不能拥有static方法和属性，但是可以访问外部类的static方法和属性

成员内部类声明:  在外部类的外部声明    外部类名.内部类名 对象引用=new 外部类名().new 内部类名();
         ：在内部类的内部声明  与普通声明没有区别
//静态内部类
//定义在类中，static修饰
//1.静态内部类的床架不依附与外部类，它与普通类没有区别只是定义在另类中
//2.静态内部类可以拥有普通方法，但是不能访问外部的普通方法

静态内部类声明 ：  在外部类的外部声明    外部类名.内部类名 对象引用= new 外部类名.内部类名();

//方法内部类    局部内部类


//定义在方法中

//不可以用访问权限修饰符修饰
//对外外圈隐藏
//局部方法如果想使用方法形参，则该形参必须要Final声明（JDK8变为隐式声明）
