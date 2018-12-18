class Person{
    static{
        System.out.println("Person的静态块");
    }
    private String name;
    private int age;
    public Person(){
        System.out.println("调用无参的构造方法");
    }
    public Person(String name){
        this();
        this.name=name;
    }
    public Person(String name,int age){
        this(name);
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void println(){
        System.out.println(this.getName()+"的"+this.getAge());
    }
    public void println(int n){//方法的重载
        System.out.println("调用重载的println方法");
    }
    
}
class Student extends Person{
    static{
        System.out.println("Student的静态块");
    }
    private String school;
    public Student(String name,int age,String school){//name和age隐式继承
        super(name,age);
        this.school=school;
    }
    public void println(){
        System.out.println(super.getName()+super.getAge()+"在"+this.school);
    }
    public void println(int m){
        System.out.println(this);
    }
    public static void go(){
        System.out.println("go");
    }
}
public class Day15{
    public static void main(String[] ages){
        // Person per1=new Person();
        // Person per2=new Person("赵亚娟",21);
        // per1.println();
        // per1.println(3);
        // per2.println();
        // per2.println(4);
        Student stu=new Student("贝贝",20,"西安工程大学");
        stu.println();
        Student.go();
        stu.println(3);
        
    }
}