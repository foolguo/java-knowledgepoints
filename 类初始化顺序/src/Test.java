/*
class Person{
    private int a=10;

    public Person() {
        System.out.println(a);
    }
    public Person(int a){
        this();
        this.a=a;
        System.out.println(this.a);
    }
}
public class Test {
    public static void main(String[] args) {
        new Person(5);
    }
}
*/

/*
class A{
    static{
        System.out.println("A的静态块");
    }
    {
        System.out.println("A的构造块");
    }
    public A(){
        System.out.println("A构造方法");
    }
}
class B{
    static A a1=new A();
    static{
        System.out.println("B静态块");
    }
    {
        System.out.println("B构造块");
    }
    public B(){
        System.out.println("B的构造方法");
    }
}
class Test extends B{
//    static B b1=new B();
//    static B b2=new B();

    static{
        System.out.println("Test静态块");
    }
    {
        System.out.println("Test构造块");
    }
    public Test(){
        System.out.println("Test的构造方法");
    }
    public static void main(String[] args) {
        new B();
    }
}*/
/*
abstract  class A{
    public A(){
        this.print();
    }
    abstract  public void print();
}

class B extends  A{
    private int n=100;
    public B(int n){
        super();
        this.n=n;
    }
    public void print(){
        System.out.println(this.n);
    }
}
public class Test {
    public static void main(String[] args) {
        new B(30);
    }
}*/

public class Test{
    static{
        int x=5;
    }
    static int x,y;
    public static void main(String args[]){
        x--;
        myMethod( );
        System.out.println(x+y+ ++x);
    }
    public static void myMethod( ){
        y=x++ + ++x;
    }
}