/**
 * Object类是所有类的父类，java中所有类都与Object类有继承关系别，所以Object对象
 * 可以接收任意类的对象
 *方法
 *1.构造方法：可以接收任何类的对象（向上转型）
 *2.toString方法，获取对象信息，如果直接输出 Object类的对象实际上就是获取对象信息
 *   eg.System.out.println(obj); <->  Systrm.out.println(obj.toString());
 *3.equals方法，比较两个对象  在没有覆写的时候，比较对象引用的地址，因为不知道子类让他覆写什么
 *
 * Object类可以接收任何引用数据类型   Java规定
 */

//class Person{
//    private String name;
//    private Integer age;
//
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return this.name+this.age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//}
//class Student extends Person{
//    private String school;
//
//    public Student(String name, Integer age, String school) {
//        super(name, age);
//        this.school = school;
//    }
//
//    @Override
//    public String toString() {//覆写Object类 toString方法
//        return super.getName()+super.getAge()+this.school;
//    }
//
//    @Override
//    public boolean equals(Object obj) {//对equals方法的覆写
//        if(obj==null){
//            return false;
//        }
//        if(this==obj){
//            return true;
//        }
//        if(!(obj instanceof Student)){
//            return false;
//        }
//        Student stu=(Student) obj;
//        return super.getName().equals(stu.getName())&&super.getAge().equals(stu.getAge())&&this.school.equals(stu.school);
//
//    }
//}
//public class Day32 {
//    public static void main(String[] args) {
//        //无参构造为子类服务
//
//        Student stu1=new Student("郭佳玥",20,"仙工大");
//        Student stu2=new Student("郭佳玥",20,"仙工大");
//        System.out.println(stu1.equals(null));
//
//    }
//    public static void print(Object obj){
//        System.out.println(obj);
//    }
//}

//class A{}
//public class Day32{
//    public static void main(String[] args) {
//        A a=new A();
//        print(a);
//        }
//    public static void print(Object obj) {
//        System.out.print(obj);
//    }
//
//}

/**
 * 代理模式
 * 1.两个类同时实现一个接口，其中一个类为真实业务类，另一个为辅助真实业务的类
 *
 * 举个Example.
 * 经纪人和明星，外卖小哥和你，代购和你
 *  一个电视节目想邀请一个明星去参加，他首先先和经纪人谈，在上节目（真实业务）明星去，结束后负责后续
 * 外卖小哥接到你的订单，去店里帮你拿饭 ，但是付钱你你自己付的（真实业务），然后把饭送到你的手上
 *
 */
//interface ISubject{
//    void buyFood();
//}
//class RealSubject implements ISubject{
//    @Override
//    public void buyFood() {
//        System.out.println("用户付钱");
//    }
//}
//class ProxeySubject implements ISubject{
//    private ISubject user;
//    public ProxeySubject(ISubject user){
//        this.user=user;
//    }
//    public void beforeBuyFood(){
//        System.out.println("外卖小哥接到订单，去店里取餐");
//    }
//    public void afterBuyFood(){
//        System.out.println("外卖小哥将钱送到客户手上");
//    }
//    @Override
//    public void buyFood() {
//        beforeBuyFood();
//        user.buyFood();
//        afterBuyFood();
//    }
//
//}
//public class Day32{
//    public static void main(String[] args) {
//        ISubject subject=new ProxeySubject(new RealSubject());
//        subject.buyFood();
//    }
//}

/**
 *
 * 包装类
 * 为什么要有包装类 ，  Object类无法接收基本数据类型 ，为了可以让Object接收基本数据类型而产生的包装类
 */

//class IntDeom{
//    private int num;
//    public IntDeom(int num){
//        this.num=num;
//    }
//    public int intValue(){
//        return this.num;
//    }
//}
//public class Day32{
//    public static void main(String[] args) {
//        Object obj=new IntDeom(55);
//        IntDeom temp=(IntDeom) obj;
//        System.out.println(temp.intValue());
//    }
//}
//以上问题存在弊端  有8中基本类型  ，每次开发中都写一遍，代码重复太多
//java中专门提供了包装类以供我们使用
//   Object类的直接子类    Boolean  Character(char);
//   Number类的直接子类    Byte、Double、Short、Long、Integer（int）、Byte

//装箱与拆箱
//装箱，把基本数据类型变为包装类
//拆箱，从包装类中将基本数据类型取出

//public class Day32{
//    public static void main(String[] args) {
//        Integer num=new Integer(55);//装箱
//        System.out.println(num.intValue());//拆箱
//    }
//}

/**
 * 上面的这种手工装箱 拆箱比较麻烦
 * 所以java提供了自动拆装箱
 */
//public class Day32{
//    public static void main(String[] args) {
//       Integer num=128;//自动装箱
//       System.out.println(num);//自动拆箱
//        Integer num1=new Integer(128);
//        Integer num3=128;//自动装箱
//        System.out.println(num==num1);
//        System.out.println(num==num3);
//        System.out.println(num.equals(num3));

//        Double num2=new Double(20.02);
//        System.out.println(num2.doubleValue());
//    }
//}

/**
 * String与普通类型的相互转换
 */

public class Day32{
    public static void main(String[] args) {
//        Integer num=10;
//        System.out.println(String.valueOf(num));
//        String str="123";
//        double num1=Double.parseDouble(str);
//        System.out.println(num1);
        String str="truesds";
        boolean num=Boolean.parseBoolean(str);
        System.out.println(num);

    }
}