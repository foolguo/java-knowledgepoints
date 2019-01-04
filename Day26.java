// interface InterfaceA { 
//     String S = "good "; 
//     void f(); 
//     } 
    
//     abstract class ClassA { 
//         public String B="student";
//     abstract void g(); 
//     } 
    
//     class ClassB extends ClassA implements InterfaceA { 
//     void g() { 
//     System.out.print(S); //
//     System.out.print(B); //

//     } 
    
//     public void f() { 
//     System.out.print(" "+ S); 
//     System.out.print(" "+ B); 

//     } 
//     } 
//     public class Day26 { 
//     public static void main(String[] args) { 
//     ClassA a = new ClassB(); 
//     InterfaceA b = new ClassB(); 
//     a.g(); 
//     b.f(); 
//     } 
//     } 
    // 运行结果是  good good  
    //首先接口里的访问权限是public  即使没有写也是public 是共有的权限而且 接口里面只有两种类型  全局常量和抽象方法
    //所以ClassA的方法可以直接调用
    


    // 2.编程题: 
    // 利用接口做参数，写个计算器，能完成加减乘除运算。 
    // （1）定义一个接口Compute含有一个方法int computer(int n, int m)。 
    // （2）设计四个类分别实现此接口，完成加减乘除运算。 
    // （3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，此方法能够用传递过来的对象调用
    //computer方法完成运算，并输出运算的结果。 
    // （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。 
    
    // //简单工厂模式  
    // //一个抽象产品类
    // //多个具体产品类
    // //一个具体工厂类
    // interface IComputer{
    //     int computer(int n,int m);
    // }
    // //加法
    // class PlusImpl implements IComputer{
    //     public int computer(int n,int m){
    //         return n+m;
    //     }
    // }
    // class DelImpl implements IComputer{
    //     public int computer(int n,int m){
    //         return n-m;
    //     }
    // }
    // class MulImpl implements IComputer{
    //     public int computer(int n,int m){
    //         return m*n;
    //     }
    // }
    // class DiviImpl implements IComputer{
    //     public int computer(int n,int m){
    //         return m/n;
    //     }
    // }
    // // class UseCompute{
    // //     public void useCom(IComputer comp, int one, int two){
    // //         System.out.println(comp.computer(one,two));
    // //     }
    // // }
    // interface ComputerFactory{
    //     IComputer creatComputer();
    // }
    // class PlusFactory implements ComputerFactory{
    //     public IComputer creatComputer(){
    //         return new PlusImpl();
    //     }
    // }
    // class DelFactory implements ComputerFactory{
    //     public IComputer creatComputer(){
    //         return new DelImpl();
    //     }
    // }
    // class MulFactory implements ComputerFactory{
    //     public IComputer creatComputer(){
    //         return new MulImpl();
    //     }
    // }
    // class DiviFactory implements ComputerFactory{
    //     public IComputer creatComputer(){
    //         return new DiviImpl();
    //     }
    // }
    // class UseCom{
    //     public void use(IComputer com,int one, int tow){
    //         System.out.println(com.computer(3,4));
    //     }
    // }
    // public class Day26{
    //     public static void main(String[] args){
    //         UseCom user=new UseCom();
    //        ComputerFactory factory=new PlusFactory();
    //        user.use(factory.creatComputer(),3,4);
    //     }
    // }





    // 3.按如下要求编写Java程序： 
    // （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。 
    // （2）定义接口B，里面包含抽象方法void setColor(String c)。 
    // （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。 
    // （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、 
    // 圆柱体的高height、颜色color。 
    // （5）创建主类来测试类Cylinder。 
        // interface A{
        //     double PI=3.14;
        //     double area();
        // }
        // interface B{
        //     void setColor(String c);
        // }
        // interface C extends A,B{
        //     void volume();
        // }
        // class Cylinder implements C{
        //     private double radius;
        //     private double height;
        //     private String color;
        //     public Cylinder(double radius,double height){
        //         this.radius=radius;
        //         this.height=height;
        //     }
        //     public double area(){
        //         return 2*PI*this.radius*this.radius+2*PI*this.radius*this.height;
        //     }
        //     public void setColor(String c){
        //         this.color=c;
        //     } 
        //     public String getColor(){
        //         return color;
        //     }
        //     public void volume(){
        //         System.out.println("volume  "+(PI*this.radius*this.radius*this.height));
        //     }
            
        // }
        // public class Day26{
        //     public static void main(String[] args){
        //         Cylinder c=new Cylinder(2,2.5);
        //         System.out.println(c.area());
        //         c.setColor("紫色");
        //         System.out.println(c.getColor());
        //         c.volume();

        //     }
        // }


    
    // 4.完成StringUtils.java 
//String类扩展功能实现
 class Strings{

    
    /**
    * 重复某个字符
    * 
    * 例如： 
    * 'a' 5   => "aaaaa"  
    * 'a' -1  => ""
    * 
    * @param c     被重复的字符
    * @param count 重复的数目，如果小于等于0则返回""
    * @return 重复字符字符串
    */
   public static String repeat(char c, int count) {
       if(count<=0){
           return "";
       }
       char[] data =new char[1];
       data[0]=c;
       String s=new String(data);
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<count;i++){
           sb.append(s);
       }
       return sb.toString();      
   }
   
   
    /**
    * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串
    * 字符填充于字符串前
    *
    * 例如： 
    * "abc" 'A' 5  => "AAabc"
    * "abc" 'A' 2  => "abc"
    *
    * @param str        被填充的字符串
    * @param filledChar 填充的字符
    * @param len        填充长度
    * @return 填充后的字符串
    */
   public static String fillBefore(String str, char filledChar, int len) {
       if(str==null||str.isEmpty()){
           return "";
       }
       if(len<=str.length()){
           return str;
       }else{
           StringBuffer s=new StringBuffer(str);
           for(int i=0;i<len-str.length();i++){
           s.insert(0,filledChar);
           }
           return s.toString();

       }
   }
   
   /**
    * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串<br>
    * 字符填充于字符串后
    * 例如： 
    * "abc" 'A' 5  => "abcAA"
    * "abc" 'A' 3  => "abc"
    *
    * @param str        被填充的字符串
    * @param filledChar 填充的字符
    * @param len        填充长度
    * @return 填充后的字符串
    */
   public static String fillAfter(String str, char filledChar, int len) {
       if(str==null||str.isEmpty()){
           return "";
       }
       if(len<=str.length()){
           return str;
       }else{
           StringBuffer s=new StringBuffer(str);
           for(int i=0;i<len-str.length();i++){
           s.insert(str.length(),filledChar);
           }
           return s.toString();

       }
   }

   /**
    * 移除字符串中所有给定字符串
    * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd  //不自己写的话可以用字符串删除
    *
    * @param str         字符串
    * @param strToRemove 被移除的字符串
    * @return 移除后的字符串
    */
   public static String removeAll(String str, String strToRemove) {
    //    //1.查找指定字符串 
    //    //2.append()方法连接
    //    //3.将sb转回String
    //    //  aa-bb-cc "-"
    //    //  aa*bb-cc
    //    //  aa*bb*cc
    //   if(str.equals(strToRemove)){
    //       return "";
    //   }
    // //   StringBuffer sb=new StringBuffer();
    // //   int a=0;
    // //   int b=0;
    // //   while((a=str.indexOf(strToRemove))!=-1){
    // //       sb.append(str.substring(b,a));
    // //       b=a+strToRemove.length();
    // //       str.replaceFirst(strToRemove,"*");
    // //   }
    // //   sb.append(str.substring(b));
    // //   return sb.toString();
    //   char[] data1=str.toCharArray();
    //   char[] data2=strToRemove.toCharArray();
    //   int[] data=new int[10];
    //   int z=0,j=0;
    //   for(int i=0;i<data1.length-data2.length+1;i++){
    //       for( j=0;j<data2.length;j++){
    //           if(data1[j]!=data2[j]){
    //               break;
    //           }
    //       }
    //       if(j==data2.length){
    //             data[z]=i;
    //             z++;
    //       }
    //   }
    //   StringBuffer sb=new StringBuffer();
    //   int x=0;
    //    for(int i= 0;i<data.length;i++){
    //        sb.append(str.substring(x,data[i]));
    //        x=data[i]+strToRemove.length();
    //    }
    //    return sb.toString();
    if(str==null||str.isEmpty()){
        return "";
    }
        String[] str1= str.split(strToRemove);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str1.length;i++){
            sb.append(str1[i]);
        }
        return sb.toString();
   }
   
   /**
    * 反转字符串
    * 例如：abcd => dcba
    *
    * @param str 被反转的字符串
    * @return 反转后的字符串
    */
   public static String reverse(String str) {
       char[] data =str.toCharArray();
       int i=0;
       int j=0;
       for(i=0,j=data.length-1;i<j;i++,j--){
           data[i]^=data[j];
           data[j]^=data[i];
           data[i]^=data[j];
       }
       return new String(data);
   }
}
public class Day26{
    public static void main(String[] Args){
        Strings str=new Strings();
        System.out.println(Strings.reverse("hello"));
        System.out.println(str.removeAll("aalbblccldd", "l"));
        System.out.println(str.fillAfter("abc",'A',5));
        System.out.println(str.fillBefore("abc",'A',5));

    }
}
    
    
    // 5.(附加题-算法) 
    // 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。 
    // public class Day26{
    //     public static void main(String[] args){
    //         for(int i=1;i<=1000;i++){
    //             if(ifWanShu(i)){
    //                 System.out.print(i+" ");
    //             }
    //         }
    //     }
    //     public static boolean ifWanShu(int a){
    //         int sum=0;
    //         for(int i=1;i<a;i++){
    //             if(a%i==0){
    //                 sum+=i;
    //             }
    //         }
    //         if(a==sum){
    //             return true;
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    // }
    