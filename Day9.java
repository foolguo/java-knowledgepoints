// 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。 

// 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。 

// 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是
// 前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所
// 有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。 

// 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";再为这个
// 类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把"Hello Constructor"和接收的
// 参数一起打印出来。 

class Test{
    public int data;
    public char str;
    public int getData(){
        return this.data;
    }
    public int getStr(){
        return this.str;
    }
}

public class Day9{
    public static void main(String[] args){
       Test test=new Test();
       System.out.println("int的初始值 "+test.getData()+"  "+"char的初始值 "+test.getStr());
    }


class Cirle{
    public static double ratio;
    private double radius;
    private String color;
    public Cirle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
       public String getColor(){
        return this.color;
    }
    public void girth(){
        System.out.println("ratio="+ratio+" "+"girth "+(2*Cirle.ratio*this.radius));
    }
    public void area(){
        System.out.println("ratio="+ratio+" "+"area "+(Cirle.ratio*this.radius*this.radius));
    }

}

public class Day9{
    public static void main(String[] args){
        Cirle.ratio=3.14;
        Cirle cirle1=new Cirle(2,"红色");
        System.out.println("cirle1 "+cirle1.getRadius()+"  "+"color "+cirle1.getColor());

        cirle1.girth();
        cirle1.area();
        System.out.println("*****************************");
        Cirle cirle2=new Cirle(4,"黄色");
        System.out.println("cirle2 "+cirle2.getRadius()+"  "+"color "+cirle2.getColor());
        cirle2.girth();
        cirle2.area();

    }

}

class Name{
    private String name;
    public Name(){
        System.out.println("Hello Constructor");
    }
    public Name(String name){
        this();     
        this.name=name;
        System.out.println(this.name);
    }
}
public class Day9{
    public static void main(String[] args){
        new Name("郭佳玥");
    }
}