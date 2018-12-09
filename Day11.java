
//super关键字

// class Person{
//     // static {
//     //     System.out.println("4.静态块");

//     // }
//     private String name;
//     private int age;
//     public Person(String name ,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public void print(){
//         System.out.println("name "+this.name+" "+"age"+age);
//     }

// }
// class Student extends Person{
//     private String school;
//     public Student(String name,int age){
//         super(name,age);
//         System.out.println("2.子类的无参构造");
//     }
    

//     //     System.out.println("3.构造块");
//     // }
//     public Student(String name,int age,String school){
//        super(name,age);
//         this.school=school;
//     }

//     public void print(){//方法重载
        
//         System.out.println(" school "+school);
//         super.print();
//     }

// }
// public class Day11{
//     public static void main(String[] args){
//         Student stu2=new Student("李四",20);
//         stu2.print();
//         Student stu1=new Student("战三",20,"仙学");
//         stu1.print();
        
//     }
// }

// class Person{
//     private String name;
//     private int age;
//     public Person(){
// 		System.out.println("1.调用父类的构造方法");
//     }
// }
// class Student extends Person{
//     private String school;
//     public Student(){
        
//         System.out.println("2.子类的无参构造");
//     }

//     public Student(String school){
//         this();
//         this.school=school;
//     }
// }
// public class Day11{
//     public static void main(String[] args){
//         Student stu1=new Student("仙仙大");
//     }
// // }
// class Person{

// }
// class Student extends Person{

// }
// public class Day11{
//     public static void main(String[] args){

//     }
// }
// public class Day11{
//     public static void mian(String[] args){
//       byte b1=1,b2=2,b3,b6,b8;
//       final byte b4=4,b5=6,b7=9;
//       b3=(b1+b2);
//       b6=b4+b5;
//       b8=(b1+b4);
//       b7=(b2+b5);  
//     }
// }
// class Test {
//        static {
//             System.out.println("5.定义在Test类的静态块");
//     }
//     {
//         System.out.println("6.定义在Test类的构造块");
//     }
//     public Test(){
//         System.out.println("7.调用Test构造方法");
        
//     }
//  }

// public class Day11 extends Test{
//     static {
//             System.out.println("1.定义在主类的静态块");
//     }
//     {
//         System.out.println("2.定义在主类的构造块");

//     }
//     public Day11(){
//         System.out.println("3.调用主构造方法");
        
//     }
//     public static void main(String[] args){
//         System.out.println("4.调用主方法");
//         new Day11();
//         new Day11();
//         System.out.println("8.调用结束");

//     }
// }
// class Simple{
//     private String color;
//     public Simple(String color){
//             this.color=color;
//     }
//     public String getName(){
//         return this.color;
//     }
// }
// class Cirle extends Simple{
//     public static final double RATIO=3.14;
//     private double radius;
//     public Cirle(String color,double radius){
//         super(color);
//         this.radius=radius;
//     } 
//     public void girth(){
//         System.out.println("color "+super.getName()+" girth "+(RATIO*this.radius*2));
//     }
//     public void Area(){
//         System.out.println("color "+super.getName()+" Area "+(RATIO*this.radius*this.radius));

//     }

// }

// public class Day11{
//     public static void main(String[] args){
//         Cirle cirle=new Cirle("红色",4);
//         cirle.Area();
//         System.out.println(Cirle.RATIO);
//         Simple simple=new Cirle("白色",6);
//     }
// }

//  class Animal {
//     public void eat(){
//         System.out.println("animal eatting...");
//     }
// }

//  class Cat extends Animal{

//     public void eat(){

//         System.out.println("我吃鱼");
//     }
// }

//  class Dog extends Animal{

//     public void eat(){

//         System.out.println("我吃骨头");
//     }

//     public void run(){
//         System.out.println("我会跑");
//     }
// }

// public class Day11 {

//     public static void main(String[] args) {

//         print(new Cat()); //向上转型
//         print(new Dog());  //向上转型
//     }
//     public static void print(Animal a){
//         a.eat();
//     }

// }


class Person{
    public void print(){
        System.out.println("1.I am a man!");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.I am a student!");
    }
}
class Worker extends Person{
    public void print(){
        System.out.println("3.I am a worker!");
    }
}
public class Day11{
    public static void main(String[] args){
        out(new Student());
        out(new Worker());

    }
    public static void out(Person per){
        per.print();
    }
}