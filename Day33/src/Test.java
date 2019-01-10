//public class Test {
//    public static void main(String[] args) {
//        int num1=9;
//        int num2=0;
//        /**
//         *   自定义异常
//         *
//         * try{
//         *             System.out.println(num1/num2);
//         *         }catch(Exception e){
//         *             e.printStackTrace();
//         *         }finally{
//         *             System.out.println("结束语句");
//         *         }
//         */
//        // 关键字throws
//        //不在主方法中throws
//        try{
//              System.out.println(num1/num2);
//            System.out.println("haha");
//        }catch(Exception e){
//            e.printStackTrace(); }finally{
//            System.out.println("结束语句");
//        }
//
//
//    }
//    public static int  Divi(int num1,int num2)throws Exception{
//        return num1/num2;
//    }
//}
//public class Test{
//    public static void main(String[] args) throws Exception {//由主方法抛出异常由JVM处理
//
//        System.out.println(Divi(10,0));
//        System.out.println("haha");
//    }
//    public static int  Divi(int num1,int num2)throws Exception{
//        return num1/num2;
//    }
//}

//throw关键字   表示认为自定义异常。如果现在异常类对象实例化不希望由JVM产生而由用户自定义产生
//
class AddException extends Exception{
    public AddException(String msg){
        super(msg);
    }
}
public class Test{
    public static void main(String[] args)throws Exception {
        int num1=20;
        int num2=30;
        if(num1+num2==50){
            throw new AddException("错误的相加操作");

        }
    }
}