//1.String类
//  java没有提供字符串类型   String事实上是一个类
//  String 的实例化方法
//    1.直接赋值
//     2.用构造法赋值
//    字符串相等比较
//     ‘==’: 对数值进行比较，对于String类对保存在对象引用中的地址进行数值比较
//     ‘equals()’方法： 对字符串内容进行比较
// public class Day24{
//     public static void main(String[] args){
//         String str1="hello";
//         String str2=new String("hello");
//          System.out.println(str1==str2);
//          System.out.println(str1.equals(str2));
//     }
// }

// 字符串常量是字符串匿名的对象  ，  直接赋值的方法只是给匿名对象给一个名字罢了
// 证明字符串常量是一个匿名对象  ，是对象就一定可以调用String的方法  

// 注意  在用一个指定的字符串与用户自定义字符串进行比较的话  ，指定字符串一定要写在前面 ，因为如果用户没有输入的话就没有对象调用equals
// 方法，（产生NullPointerException异常）
// public class Day24{
//     public static void main(String[] args){
//         // String str1="hello";
//         // String str2=new String("hello");
//         // System.out.println(str2.equals("hello"));
//         // System.out.println("hello".equals(str2));
//         String str1="hello";
//         String str2=null;
//         System.out.println(str1.equals(str2));
//         System.out.println(str2.equals(str1));//产生异常
//     }
// }

//字符串  实例化比较 直接赋值和构造法的比较    
//  下面例子   str1==str2  与  equals方法比较结果都是true
//原因是   java采用的是共享模式  JVM会自动维护一个对象池（字符串对象池），采用直接赋值对String对象进行实例化操作，该字符串的内容会自动保存到对象池中，
// 下一次采用直接赋值对String对象进行实例化操作时，java会现在对象池中查找有没有相同对象，如果有则直接引用，如果没有，则重新进行实例化操作并入池
//  用构造法则不会自动入池 ，要用interen()方法手动入池 

// public class Day24{
//     public static void main(String[] args){
//         // String str1="hello";
//         // String str2="hello";
//         // System.out.println(str1.equals(str2));
//         // System.out.println(str1==str2);
//         String str1=new String("hello").intern();
//         String str2="hello";
//         System.out.println(str1.equals(str2));
//         System.out.println(str1==str2);
//     }
// }
//字符串不可变更，因为字符串不会改变，每次进行+操作的时候都是改变对象应用  ，即+一次产生两块垃圾内存
//所以在java中尽量改变少用+

//  字符串与字符数组的相互转换

//  1.字符数组全部转换为字符串  构造方法   public String(char[] a)
//  2.字符数组部分转换成为字符串  构造方法  public  String(char[] a,int offest,int count)
//  3.字符串转换成字符   public char charAt(int  ); 
//  4.字符串转换成字符数组  public  char[] toCharArray()

// public class Day24{
//     public static void main(String[] args){
//         // char[] data= new char[]{'h','e','l','l','o'};
//         // String str1=new String(data);
//         // String str2=new String(data,0,2);
//         // System.out.println(str1);
//         // System.out.println(str2);
//         String str1="hello";
//         char a=str1.charAt(1);
//         System.out.println(a);
//         char[] data=str1.toCharArray();
//         for(char i:data){
//             System.out.println(i);
//         }
//     }
// }

//字符串与字节数组的相互转换
//字节数组全部转字符串   public String(byte[] b)
//字节数组部分转字符串   public String(byte[] b,int offest,int count)
//字符串转字节数组  public byte[] getBytes();
//字符串转字节编码   public byte[] getBytes(String "编码类型")

// public class Day24{
//     public static void main(String[] args){
//         // byte[] b= new byte[]{1,2,3,4,5,6};
//         // String str1=new String(b);
//         // String str2=new String(b,2,4);
//         // System.out.println(str1);
//         // System.out.println(str2);
//         String str1="hello";
//         byte[] b=str1.getBytes();

//         for(byte i:b){
//             System.out.println(i);
//         }
        
//     }
// }

// 字符串比较  1.equals  public boolean equals(String str)  区分大小写的比较
// 2.不区分大小写的比较  public boolean equalsIgnoreCase(String str)  不区分大小写的比较
// 3.大小比较   public int compareTo(String str)   只要遇见不同 就停止比较返回差值

// public class Day24{
//     public static void main(String[] args){
//         String str1="hello";
//         String str2="hello";
//         String str3="HELL0";
//         System.out.println(str1.equals(str2));
//         System.out.println(str1.equalsIgnoreCase(str3));
//         System.out.println(str1.compareTo(str3));
        
//     }
// }

// 字符串查找
// 1. 查找一个子串是否属于  该字符串  public boolean contains(String str)
// 2.查找一个子串是否属于  该字符串 并返回位置 从头开始到结尾  public int indexOf(String str)
// 3.从指定位置开始 找  public int indexOf(String str ,int indexOffest)
// 4.从字符串结尾开始，public intlastIndexOf(String str)
// 5.从指定位置开始  从结尾向开始找找  public int lastIndexOf(String str ,int indexOffest)
// 6.判断是否由指定字符串开头  public boolean startsWith(String str)
// 7.判断是否在特定字符串由指定位置开头  public boolean startsWith(String str,int indexOffest)
// 8.判断是否由指定字符串由结尾  public boolean endsWith(String str)
