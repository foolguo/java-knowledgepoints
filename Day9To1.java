//this
//static
//构造快
//继承

//this 关键字的三种使用
// class Person{
//     private String name;
//     private int age;
//     public Person(){
//         System.out.println("1.调用了无参的构造方法");
//     }
//     public Person(String name){
//         this();//this调用本类方法
//         System.out.println("2.调用了一个参数的构造方法");
//         this.name=name;//this调用本类属性
//     }
//     public Person(String name,int age){
//         this(name);//this调用本类方法
//         System.out.println("3.调用了两个参数的构造方法");
//         this.age=age;//this调用本类属性
//     }
//     public void print(){
//         System.out.println("name "+name+"age"+age);
//     }
//     public void print1(){
//         System.out.println("this 表示当前对象："+this);//this表示当前方法
//     }

// }
// public class Day9To1{
//     public static void main(String[] args){
//         Person per1=new Person("长山");
//         Person per2=new Person("gun",20);
//         per1.print();
//         per2.print();
//         per1.print1();
//         per2.print1();
//     }
// }


//static 修饰属性   修饰方法

// class Person{
//     private String name;
//     private int age;
//     public static String country;
//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public String getName(){
//         return this.name;
//     }
//     public int getAge(){
//         return this.age;
//     }
//     public void print(){
//         System.out.println("NAME "+this.name+"AGE "+this.age+"COUNTRY "+this.country);
//         this.print1();
//     }
//     public static void print1(){
//          System.out.println("COUNTRY "+Person.country);
//     }
// }

// public class Day9To1{
//     public static void main(String[] args){
//         Person per1=new Person("张三",20);
//         Person.country="中华人民共和国";
//         System.out.println("NAME "+per1.getName()+"AGE "+per1.getAge());
//         per1.print();
//         Person.print1();
//     }
// }

//代码块
//1.普通块
//2.构造快
//3.静态块


//1.普通块   定义在方法中 没有任何关键字修饰
// public class Day9To1{
//     public static void main(String[] args){
//         {
//             int x=10;
//             System.out.println(x);
//         }
//         int x=20;
//             System.out.println(x);
        
//     } 
// }

//2.构造快    定义在类中，没有任何关键字修饰
//构造块优先于构造方法先执行
//有几个实例化对象产生就执行几次构造块

//3.静态块  定义在类中，用static关键字修饰
//3.1 静态块在非主类
//静态块优先于构造方法执行
//不管有几个实例化对象产生，构造块只在类加载的时候执行一次
//3.2 静态块在主类
//
// class Person{
//     private String name;
//     private int age;
//     public static String country;
//     {
//         System.out.println("1.调用了构造块");
//         name="张三";
//         age=10;
//     }
//     public Person(){
//         System.out.println("2.调用了构造方法");
//     }
//     static{
//         System.out.println("3.调用了静态块");
//         Person.country="中华人民共和国";
//     }
//     public void print(){
//         System.out.println(name+" "+age+" "+"出生在"+country);
//     }
// }
// public class Day9To1{
//     public static void main(String[] args){
//         new Person();
//         new Person().print();
//     }
//     static{
//         System.out.println("4.构造块在主类执行");

//     }
// }

//继承

// 实现代码的复用

// class Person{
//     private String name;
//     private int age;
//     public Person(){
//         System.out.println("**********************");
//         }
//     public void setName(String name){
//         this.name=name;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }
//     public void print(){
//         System.out.println("name"+name+"age"+age);
//     }
// }
// class Student extends Person{
//     private String school;
//     public Student(){
//         System.out.println("----------------------");
//     }
//     public void setSchool(String school){
//         this.school=school;
//     }
//      public void print1(){
//         System.out.println("school "+school);
//     }
// }

// public class Day9To1{
//     public static void main(String[] args){
//         Student stu=new Student();
//         stu.setName("张三");
//         stu.setAge(20);
//         stu.print();
//         Student stu1=new Student();
//         stu.setSchool("仙工大");
//         stu.print1();
//     }
// }