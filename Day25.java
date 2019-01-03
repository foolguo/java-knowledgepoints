//字符串查找
//  一个字符串中是否存在一个子串  
   //public boolean contains(String str)
// 判断一个子串的位置  从头开始
  //public int indexOf(String str)
// 判断一个子串的位置  从指定位置开开始 
// public int indexOf(String str , int index)
//从尾部开始  判断子串 
  //public   int lastIndexOf(String str)
//从指定 尾部开始 判断子串位置
    //public int lastIndexOf(String str,int lastIndex)
//判断首字符串是否由指定字符串开始
    //public boolean startsWith(String str)
//判断指定首字符串是否由指定字符开始
    //public boolean startsWith(String str , int index)
//判断未字符串是否由指定字符串开始
    //public boolean endsWith(String str)
// public class Day25{
//     public static void main(String[] args){
//         String str1="hello";
//         String str2="l";
//         System.out.println(str1.contains(str2));
//         System.out.println(str1.indexOf(str2));
//         System.out.println(str1.indexOf(str2,4));
//         System.out.println(str1.lastIndexOf(str2));
//         System.out.println(str1.lastIndexOf(str2,2));
//         System.out.println(str1.startsWith(str2));
//         System.out.println(str1.endsWith(str2));
//     }
// }

// 字符串替换
//  替换所有的指定内容
    //  public String replaceAll(String regex,String replacement)
//  替换收个内容
    //public String replaceFirst(String regex,String replacement)
// public class Day25{
//     public static void main(String[] args){
//         String str1="hello world";
//         // String str2="HELLO";
//         System.out.println(str1.replaceAll("l","-"));
//         System.out.println(str1.replaceFirst("l","-"));//替换字符串首个内容 下次再见不会替换
//     }
// }

//字符串拆分
//1 将字符串全部拆分
    //public String[] split(String regex);
//2.将字符串部分拆分
    //public String[] split(String regex);
    // public class Day25{
    //     public static void main(String[] args){
    //         String str="hello world hello 213";
    //         String[] str1=str.split(" ");
    //         String[] str2=str.split(" ",3);
    //         String[] str3=str.split(" ",5);
    //         for(String i:str1){
    //             System.out.println(i);
    //         }
    //         System.out.println("************");

    //         for(String i:str2){
    //             System.out.println(i);
    //         }
    //         System.out.println("************");

    //         for(String i:str3){
    //             System.out.println(i);
    //         }
    //     }
    // }
        //拆分IP地址
    // public class Day25{
    //     public static void main(String[] args){
    //         String IP="192.168.1.1";
    //         String str[]=IP.split("\\.",7);
    //         for(String i:str){
    //         System.out.println(i);
    //         }
    //     }
    // }

    // 字符串的截取
    // //从指定位置截取到结尾
    // public String subString(int beginIndex)
    // //从指定位置截取待指定结尾
    //public String subString(int beginIndex,int endIndex)//左闭右开
    // public class Day25{
    //     public static void main(String[] args){
    //         String str1="helloworld";
    //         System.out.println(str1.substring(5));
    //         System.out.println(str1.substring(0,5));
    //     }
    // }
    
    //字符串的其他方法 
    //去掉左右空格 public String trim()
    //字符串全转大写  public String toUPPerCase()
    //字符串全转小写  public String toLowerCase()
    //字符串入池  intern()
    //字符串连接  public String concat()
    //字符串长度 public int length()
    // 字符串判空 public boolean isEmpty() //只判断字符串是否有内容 不判断null的情况

    // public class Day25{
    //     public static void main(String[] args){
    //         // String str1="  hello world ";
    //         // System.out.println(str1);
    //         // System.out.println(str1.trim()+1);
    //         //将字符串首字符大写
    //         String str="hello world";
    //         System.out.println(firstUp(str));
    //         //字符串判空
    //         String str1="";
    //         String str2=null;
    //         System.out.println(ifEmpty(str));
    //         System.out.println(ifEmpty(str1));
    //         System.out.println(ifEmpty(str2));
           

    //     }
    //     public static String firstUp(String str){
    //         return str.substring(0,1).toUpperCase()+str.substring(1);
    //     }
    //     public static boolean ifEmpty(String str){//判断字符串是否为空
    //         return str==null||str.isEmpty();
    //     }
    // }

    //判断一个字符串是否由全数字组成
    // public class Day25{
    //     public static void main(String[] args){
    //         String str="1234";
    //         System.out.println(ifAllNumber(str));
    //     }
    //     public static boolean ifAllNumber(String str){
    //         char[] data=str.toCharArray();
    //         for(int i=0;i<data.length;i++){
    //             if(data[i]<'0'||data[i]>'9'){
    //                 return false;
    //             }
    //         }
    //         return true;
    //     }
    // }

    //String 类与StringBuffer 和StringBuilder方法

    //为什么要有SB方法呢  ，首先 字符串常量不可修改，频繁修改会产生大量垃圾空间
    // class Person{}
    // class Student{}
    // public class Day25{
    //     public static void main(String[] args){
    //         fun(new Person());
    //         fun(new Student());
    //         fun("hello");
    //     }
    //     public static void fun(Object obj){
    //         System.out.println(obj);
    //     }
    // }

    class Person{
               
    }