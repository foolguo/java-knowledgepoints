//

class Animal{
    private String animal;
    public Animal(){
        System.out.println("1.动物有许多种");
    }
    public Animal(String animal){
        this();
        this.animal=animal;
        new Test();
        this.print();
    }
    public void print(){
        System.out.println("this "+this);
    }
    public void print(String animal){
        System.out.println("动物"+this.animal);

    }
}
class Cat extends Animal{
    public static String country;
    private String special;
    private String color;
    private double height;
    public Cat(){
        System.out.println("没有毛毛");
    }
    public Cat(String animal,String special,String color,double height){
        super(animal);
        this.special=special;
        this.color=color;
        this.height=height;
        System.out.println(this.special+Cat.country+this.color+this.height);
    }
    public static void println(){
        System.out.println(country);
    }
    public void print(String name){
        System.out.println(name+"是一种生物");
    }
}
public class Day12{
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.print("猫");
    }

}

// // class Test{
// //     static{
// //         System.out.println("1.调用了Test的静态块");
// //     }
//     {
//         System.out.println("2.调用了Test的构造块");

//     }
//     public Test(){
//         System.out.println("3.调用了Test的构造方法");

//     }

// }

// public class Day12 extends Test {
//     static{
//         System.out.println("4调用了主类的静态块");

//     }
//     {
//         System.out.println("5调用了主类的构造块");

//     }
//     public Day12(){
//         System.out.println("6调用了主类的构造方法");

//     }
//     public static void main(String[] args){
//         // Animal a= new Animal("猫");
//         // Cat.country="中国";
//         // Cat cat=new Cat("猫","土菊","黄色",10);
//         // Cat.println();
//         System.out.println("7.start");
//         new Day12();
//         new Day12();

//         System.out.println("8.end");

//     }
// }
