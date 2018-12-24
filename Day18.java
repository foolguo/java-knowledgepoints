//内部类概念
//   在一个类中嵌套其他类的操作
//内部类存在的意义
//  1.他可以直接访问外部类的元素，（访问定义在所在域的所有元素，包括私有域）
//  2.对外部类以外的类隐藏
//  3.弥补java单继承的缺点

// class Outter{
//     private  String name="外部类属性";
//     class Intter{
//         public void print(){
//             System.out.print(name);
//         }
//     } 
// }


//------------------------------------------------------------------
//  1.他可以直接访问外部类的元素，（访问定义在所在域的所有元素，包括私有域）
//如果不用内部类代码
class Outter{
    private String name="Outter";
    public String getName(){//5
        return this.name;
    }
    public void display(){
        Inner in = new Inner(this);//3.
        in.print();//4.
    }
}
class Inner{
    private Outter out;
    public Inner(Outter out){//3.
        this.out=out;
    }
    public void print(){
        System.out.print(out.getName());//6
    }
}
public class Day18{
    public static void main(String[] args){
        Outter out = new Outter();//1.
        out.display();//2.
    }
}


//外部类和内部类的关系

//  1.对于非静态内部类，内部累的创建依附与外部类，  也就是说必须先实例化外部类再实例化内部类
//  2.内部类不是  is  a关系    （人体和心脏的关系）
//  3.内部类访问外部类，直接访问    外部类访问内部类，间接访问

//----------------------------------------
//  3.内部类访问外部类，直接访问    外部类访问内部类，间接访问
//  4.外部类不可以用private修饰，但是内部类可以
//  如果外部类用private  对外完全隐藏  无法实例化对象，  内部类由于是嵌套在外部类里面，则可以在外部类实例化对象

class Outter{
    private  String name="外部类属性";
    private class Inner{
        public void print(){
            System.out.print(name);//内部类访问外部类属性，直接访问
        }
    } 
    public void display(){
        Inner in = new Inner();
        in.print();//外部类访问内部类方法  ，通过内部类引用访问
    }
}
public class Day18{
    public static void main(String[] args){
        // Outter.Inner in=new Outter().new Inner();
        // in.print();
        Outter out = new Outter();
        out.display();
    }
}
//-----------------------------------------------------


//内部类的分类
//成员内部类（类比普通方法）
// 定义在类中，没有static关键字修饰
// 要点
// 1.成员内部类的创建要依附于外部类的创建
// 2.成员内部类类比于普通方法  ，  所有成员内部类不允许有静态属性和方法(发生变异错误)，但是成员内部类可以访问外部

// 类静态属性和方法

// 内部类引用声明
// 1.在外部类的内部声明：   和普通对象引用声明没有区别
// 2.在外部类的外部声明：   外部类.内部类 对象引用 = new 外部类（）.new 内部类（）;

// class Outter{
//     private String name="outter";
//     class Inner{
//         private int age=10;
//         public  void print(){
//             System.out.println(name+age);
//         }
//     }
//     // public void display(){//在外部类的内部声明内部类的对象
//     //     Inner in =new Inner();
//     //     in.print();
//     // }
// }
// public class Day18{
//     public static void main(String[] args){
//         // Outter out = new Outter();
//         // out.display();
//         Outter.Inner in = new Outter().new Inner();//在外部类的外部声明
//         in.print(); 
//     }
// }

//静态内部类  
//定义在类中用static关键字修饰     static可以修饰 方法 属性借口 内部类  （不能修饰外部类，类是为了对象实例化，static修饰的元素与实例化无关 矛盾）
//1.静态内部类创建不依附与外部类   事实上 它和普通类没有区别，只是在另一个类结构里
//2.静态内部类可以有普通方法，但是 不可以访问外部类的普通方法（因为外部类没有实例化）
//静态内部类对象声明:
// 外部类.内部类=new 外部类.内部类();
class Outter{
    private static String name="outter";
    static class Inner{
        private int age=10;
        public  void print(){
            System.out.println(name+age);
        }
    }
    // public void display(){//在外部类的内部声明内部类的对象
    //     Inner in =new Inner();
    //     in.print();
    // }
}
public class Day18{
    public static void main(String[] args){
        // Outter out = new Outter();
        // out.display();
        Outter.Inner in = new Outter.Inner();//在外部类的外部声明
        in.print(); 
    }
}

//方法内部类   局部内部类
// 定义在方法中，没有关键字修饰

// 1.局部内部类只在  该方法中有效，出了该方法无效 对外完全隐藏
// 2. 不允许有任何访问权限操作符修饰
// 3. 如果局部内部类要用方法的形参的话  则形参必须用final修饰 在JDK8 以后变为隐式声明
class Outter{
    private String name="1";
    public void display(int age){
        class Inner{
            public void println(){
                System.out.println(name+age);
            }
        }
        new Inner().println();
    }
}
public class Day18{
    public static void main(String[] args){
        Outter out= new Outter();
        out.display(10);
    }
}







