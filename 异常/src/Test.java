/**
 *    Throwable  (父类)
 *    子类  Error   和Exception
 *                      子类 IOException  和 RuntimeException
 *     非受查异常：Error和RuntimeException,不强制进行异常处理
 *     受查异常：所有其他异常都是受查异常
*/
//public class Test {
//    public static void main(String[] args)throws Exception{
//        /**
//        //异常处理格式
//        System.out.println("1.数学计算开始之前");
//        try{
//            System.out.println("2.进行数学计算："+10/0);
//        }catch(Exception e){
//            e.printStackTrace();//输出错误堆栈信息
//        }finally{//异常的出口
//            System.out.println("3.数学计算结束后");
//        }
//        System.out.println("数学计算结束之后");
//        Throws关键字作用在方法上
//        */
////        try{
////            System.out.println(Divi(10,0));
////            return ;
////        }catch(Exception e){
////            e.printStackTrace();
////        }finally{
////            System.out.println("出口");
////        }
////        System.out.println("haha");
////        Divi(10,0);
////        System.out.println("haha");
////
////        try{
////            throw new Exception("抛异常玩");
////        }finally{
////            System.out.println("结束");
////        }
//    }
////        public static int Divi(int num1,int num2)throws Exception{
////            return num1/num2;
////        }
//
//}
    //不为50

//异常处理的标准格式
//public class Test{
//    public static void main(String[] args) {
//        try{
//            System.out.println(caculate(10,0));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    public static int caculate(int x,int y)throws Exception{
//        int result=0;
//        try{
//            result=x/y;
//        }
////        catch(Exception e){
////            throw e;
////        }
//        finally{
//            System.out.println("计算结束");
//        }
//        return result;
//    }
//}

    //异常，不能出现
class AddException extends Exception{
    public AddException(String msg){
        super(msg);
    }
}
public class Test{
    public static void main(String[] args) throws Exception{
        int num1=20;
        int num2=30;
        if(num1+num2==50){
            throw new AddException("错误的相加通知");
        }
    }
}

//public class Test{
//  public static void main(String[] args){
//        System.out.println("异常的开始");
//        try{
//            System.out.println((10/0));//语句1
//        }catch(ArithmeticException e){
//            System.out.println("输出一个异常信息");
//            e.printStackTrace();//输出错误信息
//        }
//        System.out.println("异常的结束");
//    }
//}

//public class Test {
//    public static void main(String[] args)throws Exception {
//        System.out.println("haha");
//
//        int result=Divi(10,0);
//        System.out.println("haha");
//        System.out.println(result);
//    }
//    public static int Divi(int num1,int num2) throws Exception{
//        return num1/num2;
//    }
//}

//public class Test{
//    public static void main(String[] args)throws Exception {
//        try{
//            throw new Exception("抛一个异常");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}