
//


import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        //字符与字符串的转换
//        char[] data=new char[]{'h','e','l','l','o'};
//        String str=new String(data);
//        System.out.println(str);
//        char[] data1=str.toCharArray();
//        for(char i:data1){
//            System.out.println(i);
//        }
//        char a=str.charAt(2);
//        System.out.println(a);
        // ——————————————————
        //字符串与字节的转换
//        String str="你好";
//        byte[] data=str.getBytes();
//        for (byte i:data
//             ) {
//            System.out.println(i);
//        }
//        String str1=new String(data);
//        System.out.println(str1);
        //字符串比较
            //1.区分大小写的比较
            //2.不区分大小写的比较
//        String str1="hello";
//        String str2="Hello";
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.compareTo(str2));
        //字符串查找
//        String str1="hello world";
//        System.out.println(str1.contains("l"));//查找字符串是否存在
//        System.out.println(str1.indexOf("l"));//查找指定字符串的位置，如果不存在返回-1
//        System.out.println(str1.indexOf("l",3));
//        System.out.println(str1.lastIndexOf("l"));
//        System.out.println(str1.startsWith("h"));
//        System.out.println(str1.endsWith("d"));
        //字符串替换
//        String str="hello world";
//        System.out.println(str.replaceAll("l","-"));//全替换
//        System.out.println(str.replaceFirst("l","-"));//首个替换
        //字符串拆分
//        String str="192.168.1.2";
//        String[] str1=str.split("\\.");
//        String[] str2=str.split("\\.",2);
//        for(String i:str1){
//            System.out.println(i);
//        }
//        for(String i:str2){
//            System.out.println(i);
//        }
        //字符串截取
//        String str="hello world";
//        System.out.println(str.substring(6));
//        System.out.println(str.substring(0,5));
        //字符串的其他方法
//        String str=" hello world ";
//        System.out.println(str);
//        System.out.println(str.trim());
        //首字符大写
//        System.out.println(str.substring(1,2).toUpperCase()+str.substring(2));
//        System.out.println((str==null||str.isEmpty()));
        //判断是否由全数字组成
//        String str1="1234a";
//        char[] data=str1.toCharArray();
//        for(int i=0;i<data.length;i++){
//            if(data[i]<'0'||data[i]>'9'){
//                System.out.println("不是由全数字组成");
//            }
//        }
//        System.out.println(str1+"是由全数字组成");
//        两个SB类
//          StringBuffer 和  StringBuilder类
//                为什么存在，  因为字符串常量不可修改，进行'+'操作时会产生大量的垃圾空间
//                  但是，SB类可修改，不会产生垃圾空间
        //String变为  StringBuffer  1.用构造方法，2.用append()
        //StringBuffer变为String类  用toString()方法
//        String str="hahahaha";
//        StringBuffer sb=new StringBuffer(str);
//        sb.append("world");
//        System.out.println(sb.toString());
        
    }
}
