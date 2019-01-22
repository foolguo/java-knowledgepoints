/**StringBuffer和StringBulider
 * 为什么会有这两个类：字符串常量不可变，每次改变都只是改变String类的对象引用指向
 * 每进行一次+操作就产生两块内存空间.
 * SB类的内容可以改变，引入了SB类：
 *
 * String和SB类的相互转换:
 * String 转换为SB：用SB类的构造方法或者是append(Object obj) 返回值为SB
 * SB转换为String:用toString()
 *
 * SB类几个操作，  1.翻转；reverse（） 2，删除 delete(int begin,int end)
 * 3.插入 insert(int offest,各种数据类型)
 *
 * String类和SB类的区别：
 * 字符串常量不可改变会产生大量的垃圾空间，SB类可以改变，但是在实际+操作中 JAVA会自动将String
 * 转换为StringBuffer在用append()方法进行连接，
 */
//public class Test {
//    public static void main(String[] args) {
//             String str="haha";
//             StringBuffer str1=new StringBuffer(str);
//        System.out.println(str1.append("hehe"));
//        fun(str1);
//        System.out.println(str1);
//    }
//    public static void  fun(StringBuffer tmp){
//        tmp.append(123.2);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        StringBuffer str1=new StringBuffer("haha");
////        StringBuffer str2="hehehhe";
//        str1.append("hehe");
//        System.out.println(str1.reverse());
//        System.out.println(str1.delete(1,4));
//        System.out.println(str1.insert(1,"gun"));
//    }
//}
