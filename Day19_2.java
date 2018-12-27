//接口，抽象方法和全局常量的集合
//接口用interface关键字定义，   
//一个子类可以有多个接口，实现了java的多继承

// interface IMessage{//1.在所有接口名前加上I
//     String MSG="java";
//     void print();
// }
// interface INews{
//      String getNews();
// }
// class MessageImpl implements IMessage,INews{//子类命名规则，后缀加上Impl,表示存接口继承过来的
//     public void print(){
//         System.out.println(MSG);
//     }
//     public String getNews(){
//         return IMessage.MSG;//建议加上接口名称
//     }
// }
// public class Day19_2{
//     public static void main(String[] args){
//         IMessage m=new MessageImpl();
//         m.print();
//         //m.getNews();  //这时不能用  因为getNews是属于INews接口的而引用类型确是IMessage接口垫
//         INews n= (INews) m;  //父类接口的相互转化   （前提是有共同子类的时候）
//         System.out.println(n.getNews());
//     }
// }

//接口使用原则
//1.接口里的访问权限只能是public   没有写public也只能是public  所以在接口中 public abstract final static可以省略
//  原则   上面的都省略
//2.当一个类既要继承抽象类又要实现接口  那么先继承抽象类  后实现接口   因为抽象类类单继承  ，而接口多实现
// interface A{
//     String NAME="gun";
//     void play();
// }
// abstract class B{
//     public abstract void go();
// }
// class Test extends B implements A{
//     public void go()
//     {
//         System.out.println("go");
//     }
//     public void play(){
//         System.out.println(A.NAME);
//     }
// }
// public class Day19_2{
//     public static void main(String[] args){
//         //父类与父接口相互转换
//         B b = new Test();
//         b.go();
//         A a = (A) b;
//         a.play();
//     }
// }
   
// 3.抽象类可以实现多个接口，但是接口不可以继承抽象类（因为抽象类中可以有普通属性和方法与接口的定义相违背）

// interface IMessage{
//     void print();
// }
// abstract class News implements IMessage{
//     //News为抽象类，可以不实现IMessage的抽象方法          抽象类中抽象方法的abstract不可以省略
//     public abstract void getNews();
// }
// class MessageIpml extends News{
    
//     public void print(){
//         System.out.println("gungungun");
//     }
//     public void  getNews(){
//         System.out.println("news");
//     }
// }
// public class Day19_2{
//     public static void main(String[] args){
//         News n = new MessageIpml();
//         n.print();
//         n.getNews();
//      }
// }

//4.一个接口可以继承（extends）多个父接口


// interface A{
//     void play1();
// }
// interface B{
//     void play2();
// }
// interface C extends A,B{//
//     void play3();
    
// }
// class Test implements C{
//     public final void play(){
//         play1();
//         play2();
//         play3();
//     }
//     public void play1(){
//         System.out.println("1");
//     }
//     public void play2(){
//         System.out.println("2");
//     }
//     public void play3(){
//         System.out.println("3");
//     }
// }
// public class Day19_2{
//     public static void main(String[] args){
//         Test test= new Test();
//         test.play();
//     }
// }


//定义一个USB接口

//下面的代码有 缺点  没增加一个新的USB设备  就要修改一次主程序   
// interface USB{
//     void setup();
//     void work();
// }
// class Comptuer{
//     public void plugin(USB usb){
//         usb.setup();
//         usb.work();
//     }
// }
// class UDisk implements USB{
//     public void setup(){
//         System.out.println("安装U盘");
//     }
//     public void work(){
//         System.out.println("U盘工作");
//     }
// }
// class printDisk implements USB{
//     public void setup(){
//         System.out.println("安装打印机");
//     }
//     public void work(){
//         System.out.println("打印机工作");
//     }
// }
// public class Day19_2{
//     public static void main(String[] args){
//         Comptuer com = new Comptuer();
//         com.plugin(new UDisk());
//         com.plugin(new printDisk());

//     }
// }

//由上面的程序  引出工厂模式

// 用户购买电脑
//  首先 用户想买一台surface电脑  

//买了surface后又想买一台Mac    这时你要  修改主程序的代码    


// interface Computer{
//     void isComputer();
// }
// class SurfaceBookComputer implements Computer{
//     public void isComputer(){
//         System.out.println("buy SurfaceBookpro");
//     }
// }
// class MacBookComptuer implements Computer{
//     public void isComputer(){
//         System.out.println("buy MacBOOKpro");
//     }
// }
// class Client{
//     public void buyComputer(Computer computer){
//         computer.isComputer();
//     }
// }
// public class Day19_2{
//     public static void main(String[] args){
//         Client client=new Client();
//         client.buyComputer(new SurfaceBookComputer());
//     }
// }

//简单工厂模式
//  设计
//1.一个抽象产品类
//2.多个具体产品类
//3.一个工厂类  （第三方）
import java.util.Scanner;
interface Computer{
    void isComputer();
}
class SurfaceBookComputer implements Computer{
    public void isComputer(){
        System.out.println("buy SurfaceBookpro");
    }
}
class MacBookComptuer implements Computer{
    public void isComputer(){
        System.out.println("buy MacBOOKpro");
    }
}
//将类的实例化交给工厂解耦
class  factoryComputer{
    public static Computer getInstance(String type){
    Comptuer computer=null;
        if(type.equals("macbook"))
        {
            return new MacBookComptuer();
        }
        else if(type.equals("surface")){
            return new SurfaceBookComputer();
        }
        return null;
    }
}
class Client{
    public void buyComputer(Computer computer){
        computer.isComputer();
    }
}
public class Day19_2{
    public static void main(String[] args){
       Client client=new Client();
       Scanner scanner= new Scanner(System.in);
       System.out.println("请输入要购买的电脑型号");
       String type=scanner.nextLine();
       Computer computer = factoryComputer.getInstance(type);
       client.buyComputer(computer);
        
    }
}