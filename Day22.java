//String 类   
//java中也没有String方法  ， 但是定义了一个String类
//实例化方法

// 1.直接赋值
// 2.传统方法
// public class Day22{
//      public static void main(String[] args) {
//         String str1 = "Hello bit";//直接赋值
//         System.out.println(str1);
//         String str2 = new String("Hello word!");//通过传统方法 （构造法）
//         System.out.println(str2);
//     }
// }

//字符串比较
//  先看x和y  数值相同   比较结果也相同
//  再看str1 和  str2   比较结果不相同
// 原因 == 是对于数值的比较， 
//String 是一个类   Str1和str2相当于对象引用    比较的是堆内存的地址  ，所以不一样
//用equals方法比较字符串的内容(只能对字符串进行比较)

//equals  与 ==
//对于字符串   equals是比较字符串的内容的  == 是比较在堆内存存放的地址的 （只比较放到堆内存的数值数值  不比较内容）
//对于数值    equals不支持比较  

// public class Day22{
//     public static void main(String[] args){
//             int x=10;
//             int y=10;
//             if(x==y){
//                 System.out.println("true");
//             }else{
//                 System.out.println("flase");
//             }
            
//             String str1="haha";
//             String str2=new String("haha");
//             if(str1==str2){
//             System.out.println("TRUE");
//             }else{
//             System.out.println("FLASE");

//             if(str1.equals(str2)){
//                 System.out.println("TRUE");
//                 }else{
//                 System.out.println("FLASE");
//             }
//         }   
//     }
// }
    



//String类匿名对象
//tip  用输入字符串和已有特定字符串比 ，特定字符串放到前面
// import java.util.Scanner;
// public class Day22{
//     public static void main(String[] args){
//         String str1="hello";//给匿名对象一个名字  ，匿名对象报存到堆内存中
//         // Scanner scanner=new Scanner(System.in);
//         // String str2=scanner.nextLine();
//         String str2=null;
//         if(str2.equals(str1)){
//             System.out.println("true");
//         }else{
//             System.out.println("flase");
//         }
//     }
// }

//实例化区别  

// 1.采用直接赋值
//  根据上面的实例， 我们可以知道  == 不比较内容  ，str1  str2  str3 很明显是三个不同的对象  但为什么结果都是true

//  JVM  会自动维持一个对象池  ，如果采用了直接赋值的模式进行String类对象实例化操作，那么该对象实例化会自动保存到这个对象池中。如果下次
//如果下次继续用直接赋值的模式声明String类对象，此时如果有指定内容那么直接引用，，若没有，则开辟新的字符串对象，而后将其保存到对象池中
// public class Day22{
//     public static void main(String[] args){
//         String str1="hello";
//         String str2="hello";
//         String str3="hello";
//         System.out.println(str1==str2);
//         System.out.println(str1==str3);
//         System.out.println(str2==str3);
//     }
// }

//2.如果采用传统方式进行赋值（构造方法）

//String用构造方法会开辟两块空间 ，并且其中一块堆内存将成为垃圾空间
//对象实例化不会保存到对象池中 需要手动入池

// public class Day22{
//     public static void main(String[] args){
//         // String str1= new String("hello");// 该对象的字符串常量没有保存在对象池中
//         // String  str2="hello";//没有入池，对象自动入池
//         // System.out.println(str1==str2);
//         String str1=new String("hello").intern();  //用intern()方法  手动将“hello”保存到对象池中
//         String str2="hello";//在对象池中  已经有该字符串常量  所以不再入池 直接引用
//         System.out.println(str1==str2);
//     }
// }

//   解释字符串两种赋值方法  
//  1.直接赋值  ：  只会开辟一块空间  ， 并且该字符串对象自动保存到对象池中 以便下一次使用；
//  2.构造方法  ：  开辟两块空间 ， 其中一块变为垃圾空间 ，不会自动保存到对象池中，可以使用intern()方法手动入池
//  所谓对象池就是一个对象数组 （目的就是减少开销）


//  字符串和字符数组相互转化
//字符串转字符数组

//将字符数组全部转为字符串
// public class Day22{
//     public static void main(String[] args){
//         char[] str=new char[]{'g','o','o','d'};
//         System.out.println(new String(str));
//     }
// }

// //将字符数组部分变为字符串
// public class Day22{
//     public static void main(String[] args){
//         char[] str = new char[]{'g','o','o','d','!','!'};
//         System.out.println(new String(str,1,str.length-1));//如果超出长度  报异常  数组越界异常
//     }
// }

//将字符取得指定位置的索引字符,索引从0开始（0~n)

// public class Day22{
//     public static void main(String[] args){
//         String str="hello world";
//         System.out.println(str.charAt(8));
//     }
// }

//将字符串转为字符数组f返回  toCharArrays
// public class Day22{
//     public static void main(String[] args){
//         String str1="good good study";
//         char[] a=str1.toCharArray();//将字符串转为字符数组
//         for(char i:a){
//             System.out.println(i+" ");
//         }
//     }
// }
