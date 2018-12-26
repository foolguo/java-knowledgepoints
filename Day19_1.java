//抽象类
//抽象类就是比普通类多一些抽象方法的类
//抽象方法   用abstract类修饰，没有方法体 且只能定义在方法中的类
//  抽象类不能实例化对象  因为抽象方法没有方法体  方法不能实现   所以不可以实例化对象
abstract class Person{
    private String name;
    private int age;
    public Person(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public abstract void personAction();
    public abstract void personProfess();
    public abstract void personTrasport();
    final public void personPrepare(){
        personAction();
        personProfess();
        personTrasport();
    }
}
class Student extends Person{
    private String school;
    private String trasport;
    public Student(String name, int age ,String school,String trasport){
        super(name,age);
        this.school=school;
        this.trasport=trasport;
    }
    public void personAction(){
        System.out.println(super.getName()+super.getAge());
    }
    public void personProfess(){
        System.out.println("在"+this.school);
    }
    public void personTrasport(){
        System.out.println("GO TO"+this.school+"by"+this.trasport);
    }
    
} 
public class Day19_1{
    public static void main(String[] args){
        Person stu=new Student("张三",20,"xigongda","bus");
        stu.personPrepare();
    }
}