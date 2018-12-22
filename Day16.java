// 1.定义一个Father和Child类，并进行测试。 
// 要求如下： 
// 1）Father类为外部类，类中定义一个私有的String类型的属性name，name的值为“zhangjun”。
// 2）Child类为Father类的内部类，其中定义一个introFather()方法，方法中调用Father类的name属性。 
// 3）定义一个测试类Test，在Test类的main()方法中，创建Child对象，并调用introFather ()方法。 
// class Father{
//     private String name="zhangjun";
//     class Child{
//         public void introFather(){
//             System.out.println(name);//隐藏了一个引用传递 调用外部类属性
//         }
//     }
// }
// //Test（DAY16）类
// public class Day16{
//     public static void main(String[] args){
//         Father.Child child=new Father().new Child(); //在外部类的外部声明成员内部类对象
//         child.introFather();
//     }
// }


// 2.简述下列程序运行结果: 
// class A{ 
// int y=6; 
// class Inner{ 
// static int y=3; 
// void show(){ 
// System.out.println(y); 
// } 
// } 
// } 
// class Demo{ 
// public static void main(String [] args){ 
// A.Inner inner=new A().new Inner(); 
// inner.show(); 
// } 
// } 

// 运行结果错误，因为类Inner是一个嵌套在类A中的一个成员内部类
// 成员内部类不能拥有static修饰的属性和方法，但是可以访问外部类的static修饰的属性和方法
// 因为 static修饰的所有域都与对象实例化无关，但是成员内部类必须依附于外部类产生对象互相矛盾


// 3.写出下面程序运行结果: 
// class A{ 
// public A(){ 
// System.out.println(“A”); 
// } 
// } 

// class B extends A{ 
// public B(){ 
// System.out.println(“B”); 
// } 

// public static void main(String[] args){ 
// B b=new B(); 
// } 
// } 

// A
// B
// 子类在实例化对象之前，必须先实例化父类的对象，也就是说在调用子类的构造方法之前，先调用父类的构造方法



// 4.编程题： 
// 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。 
// class Narcissistic{
//     public void number(){
//         for(int n=100;n<=999;n++){
//             if(n==(n%10)*(n%10)*(n%10)+(n/10%10)*(n/10%10)*(n/10%10)+(n/100)*(n/100)*(n/100))
//             {
//                System.out.println(n);
//             }
//         }
//     }
// }
// public class Day16{
//     public static void main(String[] args){
//         new Narcissistic().number();
//     }
// }
















// 5.编程题： 
// 定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量 
// 1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)， 
// 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法， 
// 该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。 
// 2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外）， 
// 并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。 
// 同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法， 
// 并提供一个final sing()方法。 
// 3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle" 
// 在main()方法中制造Manager和Employee对象,并测试这些对象的方法。 


class Role{
    private String name;
    private int age;
    private String sex;
    public Role(){
        System.out.println("调用Role无参构造");
    }
    public Role(String name){
        this();//调用无参的构造方法
        this.name=name;
    }
    public Role(String name,int age,String sex){
        this(name);
        this.age=age;
        this.sex=sex;
    }
    //获得类中私有属性
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSex(){
        return this.sex;
    }
    //定义play方法
    public void play(){
        System.out.println(this.name+","+this.age+","+this.sex);
    }
}
class Employee extends Role{
    public static String ID;
    private String salary;
    private String job;
    public Employee(String name,int age,String sex){
        super(name,age,sex);//调用父类有参构造
    }
    public Employee(String name,int age,String sex,String ID,String salary,String job){
        this(name,age,sex);//调用子类有参构造
        Employee.ID=ID;
        this.salary=salary;
        this.job=job;
    }
    //获得类中私有属性
    public String getSalary(){
        return this.salary;
    }
    public String getJob(){
        return this.job;
    }
    //方法覆写
    public void play(){
        super.play();
        System.out.println("工资"+salary+"职位"+job);
    }
}
class Manager extends Employee{
    private final String vehicle="奔驰";
    public Manager(String name,int age,String sex,String ID,String salary,String job){
        super(name,age,sex,ID,salary,job);
    }
    //方法覆写
    public void play(){
        super.play();
        System.out.println("每天开"+this.vehicle);

    }
}
public class Day16{
    public static void main(String[] args){
        Role role=new Role("张三",30,"人妖");
        role.play();
        Employee employee=new Employee("贝贝",25,"女","123456","6000","插画师");
        employee.play();
        Manager manager=new Manager("野原新之助",5,"男","123456","小熊饼干","双业幼稚园");
        manager.play();
    }
}