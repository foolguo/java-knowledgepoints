// class Outter{
//    static class Inner{
//
//    }
//
//}
//public class Test {
//    private static int n=20;
//    public static void main(String[] args) {
////        Outter.Inner in=new Outter.Inner();
//        System.out.println(Test.n);
//    }
//}

class A{
    public static A a1=new A();
    public static A a2=new A();
    {
        System.out.println("A构造块");
    }
    static{
        System.out.println("A静态块");
    }
    public A(){
        System.out.println("A构造方法");
    }
}
public class Test extends A{
    public static Test t1=new Test();
    public static Test t2=new Test();
    static{
        System.out.println("静态块");
    }
    public Test(){
        System.out.println("构造方法");
    }
    {
        System.out.println("构造块");
    }
    public static void main(String[] args) {
        new Test();
        new A();
    }
}
