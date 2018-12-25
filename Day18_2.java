//抽象类
//抽象类用abstract修饰，抽象类就是比普通类多了一些抽象方法的类；
// 抽象方法用abstract修饰且没有方法体；且必须定义在抽象类中
// abstarct
//  1.不能与final一起用  因为final在java中代表终结器 被final修饰的类不能被继承， 被final修饰的方法可以被继承当不能被覆写
//  2.不能喝private同时使用私有元素  
//使用abstract类的限制
//1.抽象类abstact类不能实例化对象   因为abstract类中的抽象方法没有方法体，就是没有具体实现
//2.抽象类  必须要有子类   因为抽象类的抽象方法没有具体实现，所以要靠子类覆写来实现
//3.非抽象子类继承抽象类必须要覆写抽象类的所有抽象方法；
//4.在实例化子类的时候尽量用对象多态性   ------向上转型   用父类引用实例化子类对象;
//不能与final与Private同时使用
//特殊说明
//1.抽象类就是比普通类多一些抽象方法而已  换句话说抽象类就是子类的超集
//所以抽象类也有构造方法 ，因此在实例化子类对象之前也要先实例化抽象父类对象
//2.抽象类中可以没有抽象方法（0~N）个  ，只有普通方法  但是它依旧不能实例化对象
//3.抽象类不能用final声明
//4.抽象类也有抽象内部类 可以用static定义
// abstract class Animal{
//     private String special;
//     private String food;
//     private String action;
//     public Animal(String special,String food,String action){
//         this.special=special;
//         this.food=food;
//         this.action=action;
//     }
//     public String getSpecial(){
//         return this.special;
//     }
//     public String getFood(){
//         return this.food;
//     }
//     public String getAction(){
//         return this.action;
//     }
//     public abstract void action();

// }
// class Cat extends Animal{
    
//     public Cat(String special,String food,String action){
//         super(special,food,action);
//     }
//     public void action(){
//         System.out.println(super.getSpecial()+"吃"+super.getFood()+"喜欢"+super.getAction());
//     }
// }
// class Dog extends Animal{
//     public Dog(String special,String food,String action){
//         super(special,food,action);
//     }
//     public void action(){
//         System.out.println(super.getSpecial()+"吃"+super.getFood()+"喜欢"+super.getAction());
//     }
// }

// public class Day18_2{
//     public static void main(String[] args){
//         Animal cat= new Cat("猫","小鱼干","跳");
//         cat.action();
//     }
// }


//   在抽象类中对构造方法的理解
// 构造方法由于类中除了构造块和静态块之外的元素执行
abstract class A{
    public A(){
        this.print();
    }
    public abstract void print();
}

class B extends A{
    private int num=100;
    public B(int num){
        this.num=num;
    }
    public void print(){
        System.out.println(this.num);
    }
}
public class Day18_2{
    public static void main(String[] args){
        new B(30);
        new B(30).print();
    }
}

//抽象类也可以拥有内部类  ，  且内部类可以用static修饰

// 1.如果抽象内部类是非static的   要继承内部类就必须先继承外部类  且继承后的结构也与父类相同
// 2.如果抽象内部类是静态的  则可以越过外部类直接继承    class Y extends 外部类.内部类{}
// abstract class  A{
//     public abstract void printA();
//     abstract  class B{
//         public abstract void printB();
//     }
// }
// class X extends A{
//     public void printA(){}
//     class Y extends B{
//         public void printA(){}
//     }
// }
// abstract class  A{
//     public abstract void printA();
//     abstract static class B{
//         public abstract void printB();
//     }
// }
// class X extends A.B{
//     public void printB(){}
// }

// public class Day18_2{
//     public static void main(String[] args){
        
//         new X().printB();
//     }
// }
