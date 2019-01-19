/**
 * 代码块
 * 内部类
 * 继承
 * 重写
 * final
 * 对象多态
 */

/**
 * 代码块
 * 普通代码块：为了解决代码过长而命名重复的问题 定义在方法中，没有任何关键字修饰
 * 构造块：完成类中普通属性的初始化操作，在构造方法前执行，每实例化一个对象，就调用一次构造块
 * 静态块：完成类中静态属性的初始化，在类加载时执行一次，与对象实例化无关，优先于构造块执行
 * 在主类中优先于主方法执行
 */
//class Person{
//    static{
//        System.out.println("1.静态块");
//    }
//    {
//        System.out.println("2.构造块");
//    }
//    public Person(){
//        System.out.println("3.构造方法");
//    }
//
//}
//public class Test extends Person{
//    static{
//        System.out.println("4.静态块");
//    }
//    {
//        System.out.println("5.构造块");
//    }
//    public Test(){
//        System.out.println("6.构造方法");
//    }
//    public static void main(String[] args) {
//        new Person();
//        new Test();
//    }
//}

import java.util.Scanner;

/**
 * 内部类(封装性)
 * 为什么存在：1.可以互相访问私有域
 *             2.弥补了java单继承的缺点，
 *             3.对同一包中的其他类封装起来
 * 内部类和外部类的关系：1.如果非静态内部类，内部类的创建依附于外部类
 *                       2.内部类和外部类不是is-a关系
 *                       3.内部类可以直接访问外部类的元素，外部类间接访问外部类元素
 * 成员内部类（不用private修饰）：定义在类中，不加 static关键字修饰；成员内部类不能拥有静态属性，
 * 但是可以访问外部类的静态属性
 * 静态内部类（不用private修饰）：定义在类中，用static关键字修饰；静态内部类不能访问外部类的普通域，
 * 但可以拥有普通域
 * 方法内部类/局部内部类,  不加任何访问权限修饰符，  方法的参数用final修饰 (JDK8后隐式修饰)，
 * 匿名内部类
 */
//class Outter{
//    private String name="haha";
//    private class Inner{
//        private String  name1="hehe";
//        public void print(){
//            System.out.println(name);
//        }
//    }
//    public void print(){
//        Inner in=new Inner();
//        in.print();
//        System.out.println(in.name1);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Outter out=new Outter();
//        out.print();
//    }
//}
/**
 * 继承
 * 指无需重写任何代码的情况下，可以使用现有类的所有属性
 * extends
 * 限制：继承是继承父类的所有属性包括私有属性， 在初始化子类前先初始化 父类，调用子类构造方法之前，先调用父类构造方法
 * 关键字 super(); 调用父类属性 方法； 在构造方法中必须放到第一行
 */
//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        System.out.println("1.父类");
//        this.name=name;
//        this.age=age;
//    }
//    public void print(){
//        System.out.println("haha");
//    }
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//class Student extends Person{
//    private String school;
//    public Student(String name,int age,String school){
//        super(name,age);
//        System.out.println("子类");
//        this.school=school;
//    }
//    public  void print(){
//        System.out.println(this.getName()+super.getAge()+this.school);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Person per=new Student("haha",10,"hehe");
//        per.print();
//    }
//}
/**
 * 重写：
 * 在有继承关系的两个类中
 * 方法名返回值，参数表完全相同
 * 重写的方法不能有比父类方法更为严格的访问权限
 */


/**
 * final  终结器，
 * final修饰类  表示该类不能被继承
 * 修饰方法： 可以被继承，不能被覆写
 * 修饰属性：属性必须有初始值
 * 修饰临时变量：在+，-，*，/不会发生类型转换
 */

/**
 *对象多态： 向上转型(自动的)  目的是为了参数统一化
 * 向下转型：
 */