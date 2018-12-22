// 在一个类内部进行其他类的嵌套的操作
// class Outter{
//     private String msg="Hello world!";
//     class Inner{
//         public void print(){
//             System.out.println(msg);
//         }
//     }
//     public void fun(){
//         Inner in=new Inner();
//         in.print();
//     }
// }
// public class Day16Book{
//     public static void main(String[] args){
//         Outter out=new Outter();
//         out.fun();
//     }
// }


// 内部类存在的意义

// 1.内部类方法可以直接访问外部类的所有域（包括私有域）
// 2.内部类对于同一包中其他类隐藏起来
// 3.内部类可以弥补java中的单继承

// 3
// class A{
//     private String name="A类的私有域";
//     public String getName(){
//         return this.name;
//     }
// }
// class B{
//     private int age=20;
//     public int getAge(){
//         return this.age;
//     }
// }
// class C{
//     private class InnerA extends A{
//         public void println(){
//             System.out.println(super.getName());
//         }
//     }
//     private class InnerB extends B{
//         public void println(){
//             System.out.println(super.getAge());
//         }
//     }
//     public void fun1(){
//         InnerA a=new InnerA();
//         a.println();
//         InnerB b=new InnerB();
//         b.println();
//     }
// }
// public class Day16Book{
//     public static void main(String[] args){
//         C c=new C();
//         c.fun1();
//     }
// }


// 内部类与外部类的关系

// 对于非static的类，内部类的创建依附于外部类创建，在外部类没有实例化之前不能创建内部类
// 内部类是一个独立的个体，与外部类没有Is a关系
// 内部类访问外部类的元素是直接访问的，而外部类访问内部类元素，是通过内部类引用间接访问的

// 直接访问
// class Outter{
//     private String outName;
//     private int outAge;
//     class Inner{
//         private int InnerAge;
//         public Inner(){
//             Outter.this.outName="I";
//             Outter.this.outAge=20;
//         }
//         public void display(){
//             System.out.println(outName);
//             System.out.println(outAge);
//         }
//     }
// }
// public class Day16Book{
//     public static void main(String[] args){
//         Outter.Inner in=new Outter().new Inner();
//         in.display();
//     }
// }

// 间接访问

// class Outter{
//     class Inner{
//         public void println(){
//             System.out.println("间接引用");
//         }
//     } 
//     public void display(){
//         Inner in=new Inner();
//         in.println();
//     }
// }
// public class Day16Book{
//     public static void main(String[] args){
//         Outter out=new Outter();
//         out.display();
//     }
// }


// 内部类分类
// 1.成员内部类
// 2.静态内部类
// 3.方法内部类
// 4.匿名内部类


// 1.成员内部类

//  定义在类中，没有static关键字修饰

// 注意：
// 1.成员内部类依附于外部类存在，所以在创建内部类之前先要创建外部类（内部类实例化之前先要实例化外部类）
// 2.所以内部类不可以存在static修饰的方法和属性，但是可以引用外部的static方法和属性

// 2.静态内部类
// 定义在类中，用static关键字修饰
// 1.静态内部类不需要依附于外部类而创建
// 2.他和一般的类没有区别
// 3.static修饰的内部类可以拥有普通属性，但是不能访问外部类普通属性