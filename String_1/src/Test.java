/**
 * String类的赋值方法
 * String类的匿名对象
 * 字符串的不可变更
 * String两种赋值方法的区别
 * String类的各种方法
 *      1.字符串与字符数组的相互转换
 *      2.字符串与字节数组的相互转换
 *      3.字符串比较：
 *      4.字符串查找
 *      5.字符串分割
 *      6.字符串替换
 *      7.字符串截取
 *
 */

/**
 *字符串赋值方法以及比较
 * 1.直接赋值:推荐使用，
 * 2.构造法赋值：会产生两块堆内存，一块变为垃圾空间，
 * 比较，直接赋值 用==比较时  结果为true
 *       构造法 用==比较时结果为 false，要用equals()方法
 *       原因：Java采用的是共享机制
 *       JVM在底层会自动维护一个对象池（字符串对象池），在采用直接赋值的方法对String类对象进行初始化
 *       的时候，会自动添加到对象池，如果下次依旧采用直接赋值的方法进行String类对象初始化的话，
 *       如果对象池中已有指定对象的话，就直接引用，如果没有的话，就自动入池，以便于下次使用
 *      用构造法赋值的不会自动入池，但是可以使用intern()手动赋值
 */
//public class Test {
//    public static void main(String[] args) {
//        String str1="hahaha";
//        String str2="hahaha";
//        String str3="hahaha";
//        str3.intern();
//        System.out.println(str1==str2&&str2==str3);
//    }
//}

/**
 * equals()与==区别
 * equals:是Object类的方法，所有类都与Object类有继承关系
 * "=="用于数值的比较：用在String类对象的比较时 ，比较的存放在String对象引用的两块内存的地址
 */

/**
 * 字符串字符串常量是String类的匿名对象； 因为他可以调用String类的方法
 */

//public class Test{
//    public static void main(String[] args) {
//        String str1=new String("haha");
//        System.out.println("haha".equals(str1));
//    }
//}
/**
 * 字符串和字符数组的转换
 * 字符数组全部转字符串public String(char[] data)
 * 字符数组部分转换为字符串 public String(char[] data,3)
 * 指定索引的字符串转换成字符 public char charAt(int index)
 * 字符串转换成字符数组 public char[] toCharArray(String str)
 * */
//public class Test{
//    public static void main(String[] args) {
//        char[] data=new char[]{'h','e','l','l','o'};
//        System.out.println(new String(data));
//        System.out.println(new String(data,1,3));
//        String str="hahahaha";
//        char[] data1=str.toCharArray();
//        char c=str.charAt(3);
//        for (char i:data1){
//            System.out.print(i+" ");
//        }
//        System.out.println(c);
//    }
//}
/**
 * 字节数组转换成字符串 ，String构造方法
 *   1.全部转换：public String(byte[] Byte)
 *   2.部分转换:piblic String(byte[] Byte,int Offest,int count)
 * 字符串转换成字节数组:public byte[] getBytes(String str)
 */
//public class Test{
//    public static void main(String[] args) {
//        byte[] data=new byte[]{1,2,3,4,5};
//        System.out.println(new String(data));
//        System.out.println(new String(data,1,3));
//        String str="hello";
////        byte[] data1=str.getBytes();
////        for(byte i:data1){
////            System.out.print(i+" ");
////        }
//    }
//}
/**
 * 字符串比较，
 * 1.public boolean equals()方法区分大小写的比较
 * 2.public boolean equalsIgnoreCase()不区分大小写的比较
 * 3.public int compareTo(String str),比较大小关系
 */
//public class Test{
//    public static void main(String[] args) {
//        String str1="hello";
//        String str2="Hello";
//        String str3="hello";
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.compareTo(str2));
//    }
//}
/**
 * 字符串查找：
 * 1.查找指定子串是否存在：public boolean contains(String str);
 * 2.从头开始查找指定子串的位置：public int indexOf(String str)
 * 3.从头开支查找从指定索引开始子串的位置：public int indexOf(String str,int index)
 * 4.从尾部开始查找指定索引的位置：public int lastIndexOf(String str)
 * 5.从尾部开始，从指定索引开始查找指定索引的位置：public int lastIndexOf(String str,int index)
 * 6.判断是否以指定字符串开头 public boolean startsWith(String str)
 * 7.判断指定位置是否由指定字符串开头 public boolean startsWith(String str,int index)
 * 8.判断指定位置是否由指定字符串结尾public boolean endsWith(String str)
 */

//public class Test{
//    public static void main(String[] args) {
//        String str1="hello world";
//        String str2="world";
//        System.out.println(str1.contains(str2));
//        System.out.println(str1.indexOf(str2));
//        System.out.println(str1.indexOf("o",6));
//        System.out.println(str1.lastIndexOf(str2));
//        System.out.println(str1.lastIndexOf("o",5));
//        System.out.println(str1.startsWith("h"));
//        System.out.println(str1.startsWith("h",3));
//        System.out.println(str1.endsWith("d"));
//    }
//}

/**
 * 字符串替换
 * 1.字符串全替换：public String replaceAll(String str)
 * 2.字符串部分替换:public String replaceFirst(String str)
 */
//public class Test{
//    public static void main(String[] args) {
//        String str="hello world";
//        System.out.println(str.replaceAll("l","p"));
//        System.out.println(str.replaceFirst("l","p"));
//    }
//}

/**
 * 字符串拆分：
 * 1.字符串全拆分:public String[] split(String str)
 * 2.字符串部分拆分public String[] split(String str,int limit) 如果拆分数超过全拆分数，则按全拆分走
 */

//public class Test{
//    public static void main(String[] args) {
//        String str =" hello world hello  tenxun";
//        System.out.println(str.split(" "));
//        System.out.println(str.split(" ",3));
//    }
//}
/**
 * 字符串截取：substring(int begin);
 * substring(int begin,int end);
 */
/**
 * public String trim(String str)
 * public  String toUpperCase(Str)
 * public String toLowerCase(str)
 * public boolean isEmpty();字符串判空，但不是null
 */

