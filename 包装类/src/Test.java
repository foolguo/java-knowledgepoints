/**包装类
 * 为什么有包装类的概念，因为Object类无法接收基本数据类型，为了让Object类可以接收基本数据类型，将基本数据类型打包为一个类
 * 让Object也可以接收基本数据类型
// */
//class IntDeom{
//    private int n;
//
//    public IntDeom(int n) {
//        this.n = n;
//    }
//    public int intValue(){
//        return n;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        IntDeom n=new IntDeom(3);
//        System.out.println(n.intValue());
//    }
//}
/**装箱与拆箱
 * 1.手动拆箱与装箱
 *
 *
 */
//public  class Test{
//    public static void main(String[] args) {
//        /**手动装箱拆箱
//        Integer n=new Integer(10);
//        System.out.println(n.intValue());
//        */
//        Integer n=20;
//        System.out.println(n);
//    }
//}

/**
 * Integer采用直接赋值的方法Integer==  如果赋值的值是-128~127 则不会产生新的对象，会在Integer.cache.cache直接复用已有对象，
 * 如果不在这个范围内，会产生新的对象；
 */
//public class Test{
//    public static void main(String[] args) {
//        Integer n1=new Integer(10);
//        Integer n2=new Integer(10);
//        System.out.println(n1==n2);
//        System.out.println(n1.equals(n2));
//        Integer n3=10;
//        Integer n4=10;
//        System.out.println(n3==n4);
//        Integer n5=128;
//        Integer n6=128;
//        System.out.println(n5==n6);
//    }
//}

public class Test{
    public static void main(String[] args) {
        String str="123";
        int n=Integer.parseInt(str);
        System.out.println(n);
        int m=134;
        String str2=String.valueOf(m);
        System.out.println(str2);
    }
}