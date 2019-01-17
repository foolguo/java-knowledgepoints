/**
 * 对象
 * java三大特性
 * 封装性:将客观事物抽象成类，并将自己的属性和方法只让可信的类或者对象操作，对不可信的进行信息隐藏。内部操作对外部不可见
 * 继承性：代表类可以使用现有类的所有功能，并在无需编写原来类的情况下对这些类的功能进行扩展；
 * 多态性：
 *  类：类是产生对象的宏图； 对象：首先要产生类  在产生对象
 *
 *  构造方法: 1.类同名；
 *            2.没有返回类型声明；
 *            3.构造方法在产生对象时执行；
 *            4.如果没有自定义构造方法，执行系统默认；如果有则自定义的构造方法不执行
 *  private： 属性用private修饰，方法用public修饰
 *  getter   setter
 *  取得私有属性
 *
 *  this 关键字   1.调用本类属性
 *                 2.调用本类方法
 *                3. 表示当前对象
 *
 *  static 修饰属性：表示类属性，
 *  static 修饰方法：表示类方法，类加载时生成，无需对象实例化就可以调用，
 */
//class Person{
//    private String name;
//    private int age;
//    public static String country;
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void print(){
//        System.out.println(this.getName()+this.getAge()+Person.country+this);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Person per=new Person();
//        per.setName("郭佳玥");
//        per.setAge(12);
//        Person.country="中国";
//        per.print();
//    }
//}

//模板设计模式
import java.util.Scanner;
abstract class CoffeineBeverage{
        final void Prepar(){
            boilWater();
            brew();
            pourInCup();
            if(ifAddCondiments()){
                add();
            }
        }
        abstract void brew();
        abstract void add();
        void boilWater(){
            System.out.println("将水烧开");
        }
        void pourInCup(){
            System.out.println("倒入杯中");
        }
        boolean ifAddCondiments(){
            return true;
        }
}
class Coffee extends CoffeineBeverage{
    public void add(){
        System.out.println("加糖");
    }
    public void brew(){
        System.out.println("泡咖啡");
    }
    public boolean ifAddCondiments(){
        String answer=getUserInput();
        if("y".equals(answer)){
            return true;
        }else{
            return false;
        }
    }
    public String getUserInput(){
        String answer=null;
        System.out.println("请选择是否要在咖啡中倒入咖啡或者牛奶（y/n）?");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        return answer;
    }
}

public class Test{
    public static void main(String[] args) {
        CoffeineBeverage c=new Coffee();
        c.Prepar();
        }
    }

