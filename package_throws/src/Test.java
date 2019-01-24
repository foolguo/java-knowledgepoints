/**在编译器里不用自己定义
 *
 *  不在编译器里 用package 定义包
 *  编译时 package  包名
 *  引用某个包时，import 包名.类名；
 *  编译 javac -d . 主类名.java
 *  运行    java 包名.主类名
 *  编辑列表中的全部    java -d . .//*.java
 */
//public class Test {
//    public static void main(String[] args) {
//        Meaasge m=new Meaasge("樊思洁",20);
//        System.out.println(m.getAge());
//    }
//}
/**非受查异常:Error类与RuntimeException的直接子类从，不许要强制进行异常捕获
 * 受查异常：除了非受查异常之外的所有异常，强制进行异常处理
 */
//public class Test{
//    public static void main(String[] args) {
//        print();
//    }
//    public static int print(){
//        try{
//            return 1;
//        }catch (Exception e){
//            return 2;
////            throw new Exception("hsh");
//        }finally {
//            return 3;
//        }
//    }
//}

/**异常处理格式：
 * try{
 * }catch{
 *
 * }finally{
 *
 * }
 * 其中try必须有   剩下两个可自己排列组合
 *
 *
 * 抛出异常
 * 1.系统自动抛出异常：
 *     1.1.不在主方法上： 在方法后加throws Exception(将该异常抛给主方法)异常语句后面的语句可以正常执行
 *     1.2. 在主方法中：  在主方法上 加throws Exception(将异常抛给JVM)异常后的语句不能执行
 *
 */
//public class Test{
//    public static void main(String[] args) {
//        try {
//            print();
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("结束");
//        }
//    }
//    public static void print()throws Exception{
//        System.out.println((10+1));
//        System.out.println((10-1));
//        System.out.println(10/0);
//        System.out.println((10*1));
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(print());
//    }
//    public static int print(){
//        try{
//            return 1;
//        }
//        catch (Exception e){
//            return 2;
//        }finally {
//            return 3;
//        }
//
//    }
//}
/**throw 用在方法里面
 * 用户不想java抛出异常，想自己抛出异常
 */

/**异常处理的标准格式
 *
 */
//public class Test{
//    public static void main(String[] args) {
////        try {
////            throw new Exception("hahhaha");
////        }catch (Exception e){
////            System.out.println("haha");
////        }finally {
////            System.out.println("bye bye");
////        }
//        try {
//            divi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    public static void divi() throws Exception {
//
//            try {
//                System.out.println(10 / 0);
//            }finally {
//                System.out.println("结束");
//            }
//        }
//}

/**在某个特定的场合下两数相加不能超过100；
 *
 */
//class AddException extends Exception{
//    public AddException(String msg) {
//        super(msg);
//    }
//}
//public class Test{
//    public static void main(String[] args) throws Exception{
//             int num1=20;
//             int num2=90;
//             if(num1+num2>100){
//                 throw new Exception("超出最大金额");
//             }
//    }
//}