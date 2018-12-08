//继承

//对象实例化之前一定会先实例化父类对象 

//调用子类构造方法时先要调用父类的构造方法
// class Person{
//     public String name;
//     public  int age;
//     public Person(){
//         System.out.println("1.调用父类无参的构造方法");
//     } 
//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }
//     public int getAge(){
//         return this.age;
//     }
//     public void print(){
//         System.out.println("haha");
//     }
// }
// class Student extends Person{
//     private String school;
//     public Student(){
//         super();
//         System.out.println("2.调用子类无参的构造方法");
//     }
//     public Student(String school){
//         this.school=school;
//     }
//     public void print(){
//         int a=super.getAge();
//         System.out.println(a+"gungun");
//     }
// } 

// public class Day10{
//     public static void main(String[] args){
//         Student stu=new Student("仙工大");
//         stu.setAge(10);
//         stu.print();
//     }
// }
// class Person{
//     public Person(){
//         System.out.println("1.调用父类构造方法");

//     }
// }
// class Student extends Person{
//     public Student(){
//     System.out.println("2.调用子类构造方法");
//     }
// }


// public class Day10{
//     public static void main(String[] agrs){
//         Student stu=new Student();
//     }
// }


// java不允许多继承(会发生如下错误)
//    class C extends A,B{}
//                  ^

// 允许多重继承

// class A{}
// class B extends A{}
// class C extends B{}
// public class Day10{
//     public static void main(String[] args){

//     }
// }

// class Person{
//     private String name;
//     public String getName(){
//         return this.name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
// }
//     class Student extends Person{
//         public void fun(){
//             System.out.println(super.getName());
//         }
//     }

// public class Day10{
//     public static void main(String[] args){
//         Student stu =new Student();
//         stu.setName("郭佳玥");
//         stu.fun();
//     }
// }

//方法覆写
//方法的名称，参数个数、类型，返回值类型完全相同
//1.看是哪个类new的对象
//2.当调用某个方法时，如果该方法已经被覆写，那么调用的一定是被覆写后的方法
class Person{
    public void print(){
        System.out.println("1.滚你妈逼");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.都去死");
    }
}

public class Day10{
public static void main(String[] args){
        Student stu =new Student();
        Person per=new Person();
        per.print();
        stu.print();
    }
}

//super关键字
// super 调用父类构造方法
// super 调用父类普通方法
// super 调用父类属性、

//super 调用父类构造方法
//1. 父类有无参构造方法，可以不加super（）
//2. 父类的有参构造方法，必须加super（参数）

//super调用普通方法

// class Person{
//     private String name;
//     public Person(){
//         System.out.println("haha");
//     }
//     public Person(String name){
//         this();
//         System.out.println("1.调用父类的无参构造方法");
//     }
//     public void print(){
//         System.out.println("hehe");
//     }
// }
// class Student extends Person{
//     private int age;
//     public Student(String name,int age){
//         super(name);        
//         System.out.println("3.调用子类的有参构造方法");
//     }
//     public void println(){
//         super.print();
//         // System.out.println(super.name);
//     }
// }
// public class Day10{
//     public static void main(String[] args){
//         Student stu =new Student("郭佳玥",10);
//         stu.println();
//     }
// }


//final 关键字
//修饰类      
//1. 最终类  无法被继承如果有其它类继承此类  会报错  
// (错误: 无法从最终Person进行继承
//class Student extends Person{)
        //              ^
//如果用final关键字修饰类则类中所有成员默认加上final

//修饰方法
//用final修饰方法  则被修饰的方法不能被覆写

//修饰属性


// class Person{
//      public  void print(){
//          System.out.println("hahah");
//      }
// }
// class Student extends Person{
//       public  void print(){
//           System.out.println("gungun");
//       }
// }


// public class Day10{
//     public static void main(String[] args){
//         new Student().print();
//     }
// }