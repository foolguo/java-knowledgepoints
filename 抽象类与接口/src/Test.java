/**
 * 抽象类
 * 模板设计模式
 * 接口
 * 工厂模式
 * 代理模式
 * 接口与抽象类
 */

/**
 * 抽象类，就是比普通类多了一些抽象方法， 用abstract关键字定义 抽象方法也用abstract定义，并且没有方法体
 * 1.抽象类不能产生实例化对象，抽象类可以没有抽象方法，但是依旧无法产生实例化对象，
 * 2.抽象类的子类（子类非抽象类）必须覆写抽象类的所有抽象方法
 * 3.用对象多态性实例化对象
 * 4.抽象类是普通类的超集，先实例化父类抽象类，再实例化子类
 *
 * 5抽象类的关键字，  1. abstract不能用与final一起出现，因为maodun(一个要被继承，一个是类的终结)
 * 2.不能与private一起出现，abstract关键字  目的是为了具体实现该抽象类，用private封装，外部无法
 * 操作内部，矛盾
 * 6.可以有内部类，并且，如果要继承抽象内部类，必须先继承抽闲外部类（内部类非static）
 */
//abstract class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//    public abstract void print();
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//class Worker extends Person{
//    private String company;
//    public Worker(String name,int age,String company){
//        super(name,age);
//        this.company=company;
//    }
//    public void print(){
//        System.out.println(this.getName()+" "+super.getAge()+" "+this.company);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//     Person per=new Worker("果果",20,"百度");
//     per.print();
//
//    }
//}
/**
 * 模板设计模式(第三方模板类)
 *
 * 冲泡式饮料
 * 烧热水
 * 泡东西
 * 倒入杯中
 * 放方糖
 */
//import java.util.Scanner;
//abstract class Beverage{
//    final void preaper(){
//        boil();
//        brew();
//        putIntoCup();
//        if(ifAdd()){
//            addCondine();
//        }
//    }
//    public void boil(){
//        System.out.println("烧热水");
//    }
//    public void putIntoCup(){
//        System.out.println("将热水倒入杯中");
//    }
//    abstract public void brew();
//    abstract public void addCondine();
//    public boolean ifAdd(){
//        return true;
//    }
//}
//class Coffee extends Beverage{
//    public void brew(){
//        System.out.println("冲泡咖啡");
//    }
//    @Override
//    public void addCondine() {
//        System.out.println("加方糖");
//    }
//    public boolean ifAdd(){//钩子函数
//        String answer=inPut();
//        if("y".equals(answer)){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public String inPut(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("请输入是否要加方糖（y/n）");
//        String answer=scanner.nextLine();
//        return answer;
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Beverage coffee=new Coffee();
//        coffee.preaper();
//    }
//}

/**
 * 接口：
 * 由全局常量和抽象方法组成（JDK8）以前
 * 关键字 interface,   子类实现  implement
 * 继承接口的类加上Impl表示类是由接口继承过来的
 * 向上转型实例化接口子类对象
 * 父接口可以相互转型，父接口抽象类相互转型
 * 接口规则
 * 1.子类可以实现多个接口
 * 2.子类即实现接口，由继承父类的话，先继承，后实现
 * 3.抽象类可以实现接口，接口不能继承抽象类
 * 4.一个接口可以继承（extends）接口
 *5.接口所有的权限都是public ， 即使不写也是public
 *   里面的abstract  public  final 都可以不写
 *
 * 接口的应用：接口是一种规则
 *              表示某种能力
 *        USB规则的实现
 */
//interface USB{
//     void set();
//    void pulgin();
//}
//class KeyBorad implements USB{
//    public void set(){
//        System.out.println("安装");
//    }
//    public void pulgin(){
//        System.out.println("加载");
//    }
//}
//class Computer{
//    public void plugin(USB usb){
//        usb.set();
//        usb.pulgin();
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Computer com=new Computer();
//        com.plugin(new KeyBorad());
//    }
//}

/**
 * 工厂模式(第三方)
 * 核心 将对象实例化放到工厂类中， 增加产品种类时只需要扩展即可
 * 将类的实例化放到工厂类中有利于解耦
 * 简单工厂模式
 * 一个抽象产品类，多个具体产品类，一个具体工厂类
 * 工厂方法模式
 * 抽象工厂模式
 *
 *
 */
import java.util.Scanner;
//interface Cream{
//    void buyCream();
//}
//class  SHISEIDOCream implements Cream{
//    public void buyCream(){
//        System.out.println("买资生堂面霜面霜");
//    }
//}
//class SnowCream implements Cream{
//    public void buyCream(){
//        System.out.println("买雪花秀面霜");
//    }
//}
//class Factory{
//    public static Cream print(String type){
//        Cream cream=null;
//        if("资生堂".equals(type)){
//            cream= new SHISEIDOCream();
//        }
//        if("雪花秀".equals(type)){
//            cream= new SnowCream();
//        }
//        return cream;
//    }
//}
//public class Test{
//    public void buyCream(Cream cream){
//        cream.buyCream();
//    }
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String type=scanner.nextLine();
//        Cream cream=new Factory().print(type);
//        Test t=new Test();
//        t.buyCream(cream);
//    }
//}
//缺点，没加一个新产品，都要修改工厂类

import java.util.Scanner;

/**
 * 工厂方法模式
 * 一个抽象产品类 ，一个抽象工厂类
 */
//interface Computer{
//    void buyComputer();
//}
//class MacBook implements Computer{
//    public void buyComputer(){
//        System.out.println("买苹果电脑");
//    }
//}
//class Surface implements Computer{
//    public void buyComputer(){
//        System.out.println("买微软电脑");
//    }
//}
//interface  Factory{
//     Computer getInstance();
//}
//class IphoneFactory implements Factory{
//    public Computer getInstance(){
//        return new MacBook();
//    }
//}
//class SurFactory implements Factory{
//    public Computer getInstance(){
//        return new Surface();
//    }
//}
//
//public class Test{
//    public void buyComputer(Computer com){
//        com.buyComputer();
//    }
//    public static void main(String[] args) {
//        Factory f1=new IphoneFactory();
//        Factory f2=new SurFactory();
//        Test t=new Test();
//        t.buyComputer(f1.getInstance());
//        t.buyComputer(f2.getInstance());
//    }
//}


/**
 * 代理模式
 * 代购的模式
 * 一个真实业务类（买），一个辅助业务类（代购）——>共同实现一个业务（国外买东西）
 *
 */

//interface Subject{
//    void buyThing();
//}
//class RealSubject implements Subject{
//    public void buyThing(){
//        System.out.println("买一个外星人电脑");
//    }
//}
//class ProexSubject implements  Subject{
//    private Subject sub;
//    public ProexSubject(Subject sub){
//        this.sub=sub;
//    }
//    public void beforeBuy(){
//        System.out.println("排队");
//    }
//    public void afterBuy(){
//        System.out.println("发快递");
//    }
//    public void buyThing(){
//        beforeBuy();
//        sub.buyThing();
//        afterBuy();
//    }
//}
//class Factory{
//    public static Subject getInstance(){
//        return new RealSubject();
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        //Subject sub=new ProexSubject(new RealSubject());//解耦可以放到工厂类中
//        Subject sub=new ProexSubject(Factory.getInstance());
//        sub.buyThing();
//    }
//}




