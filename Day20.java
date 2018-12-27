// interface USB{//定义一个USB接口
//     void setUp();//定义一个抽象安装方法
//     void work();//定义一个抽象的工作方法
// }
// class UDisk implements USB{//UDisk实现USB接口的方法
//     public void setUp(){
//         System.out.println("安装U盘");
//     }
//     public void work(){
//         System.out.println("U盘工作");
//     }
// }
// class Computer{//电脑按照USB接口的方法工作
//     public void plugIn(USB usb){
//         usb.setUp();
//         usb.work();
//     }
// }
// public class Day20{
//     public static void main(String[] args){
//         Computer computer= new Computer();
//         computer.plugIn(new UDisk());
//     }
// }


// interface Phone{
//     void isPhone();
// }
// class Mate20 implements Phone{
//     public void isPhone(){
//         System.out.println("HUAWEI mate 20");
//     }
// }
// class IphoneXS implements Phone{
//     public void isPhone(){
//         System.out.println("Iphone XS");
//     }
// }
// class Client{
//     public void buyPhone(Phone phone){
//         phone.isPhone();
//     }
// }
// public class Day20{
//     public static void main(String[] args){
//         Client client = new Client();
//         client.buyPhone(new Mate20());
//     }
// }
// import java.util.Scanner;
//   interface Phone{
//     void isPhone();
//   }
//   class Mate20 implements Phone{
//       public void isPhone(){
//         System.out.println("HUAWEI mate 20");
//       }
//   }
//   class IphoneXS implements Phone{
//     public void isPhone(){
//         System.out.println("Iphone XS");
//     }
// }
// class phoneFactory{
//     public static Phone creatPhone(String type){
        
//         if(type.equals("Mate20")){
//             return new Mate20();
//         }else if(type.equals("Iphone XS")){
//             return new IphoneXS();
//         }
//         return null;
//     }
// }
// class Client{
//     public void buyPhone(Phone phone){
//         phone.isPhone();
//     }
// }
// public class Day20{
//     public static void main(String[] args){
//         Client client =new Client();
//         Scanner scanner= new Scanner(System.in);
//         System.out.println("请选择型号");
//         String type=scanner.nextLine();
//         client.buyPhone(phoneFactory.creatPhone(type));
//     }
// }

// interface Phone{
//     void isPhone();
//   }
//   class Mate20 implements Phone{
//       public void isPhone(){
//         System.out.println("HUAWEI mate 20");
//       }
//   }
//   class IphoneXS implements Phone{
//     public void isPhone(){
//         System.out.println("Iphone XS");
//     }
// }
// interface PhoneFactory{
//        Phone creatPhone();
// }
// class HUAWEIFactory implements PhoneFactory{
//     public Phone creatPhone(){
//         return new Mate20();
//     }
// }
// class AppleFactory implements PhoneFactory{
//     public Phone creatPhone(){
//         return new IphoneXS();
//     }
// }
// class Client{
//     public void buyPhone(Phone phone){
//         phone.isPhone();
//     }
// }
// class Day20{
//     public static void main(String[] args){
//         Client client = new Client();
//         client.buyPhone(new AppleFactory().creatPhone());
//     }
// }
 interface Phone{
        void isPhone();
      }
    class Mate20 implements Phone{
          public void isPhone(){
            System.out.println("HUAWEI mate 20");
          }
    }
      class IphoneXS implements Phone{
        public void isPhone(){
            System.out.println("Iphone XS");
        }
    }
    interface OperatingSystem{
        void isOperatingSystem();
    }
    class Android implements OperatingSystem{
        public void isOperatingSystem(){
            System.out.println("安卓操作系统");
        }
    }
    class IOS implements OperatingSystem{
        public void isOperatingSystem(){
            System.out.println("IOS操作系统");
        }
    }
    interface PhoneFactory{
           Phone creatPhone();
           OperatingSystem creatOperating();
    }
    class HUAWEIFactory implements PhoneFactory{
        public Phone creatPhone(){
            return new Mate20();
        }
        public OperatingSystem creatOperating(){
            return new Android();
        }
    }
    class AppleFactory implements PhoneFactory{
        public Phone creatPhone(){
            return new IphoneXS();
        }
        public OperatingSystem creatOperating(){
            return new IOS();
        }
    }
    class Client{
        public void buyPhone(Phone phone){
            phone.isPhone();
        }
        public void usePhone(OperatingSystem use){
            use.isOperatingSystem();
        }
    }
    public class Day20{
        public static void main(String[] args){
            Client client=new Client();
             AppleFactory iphone= new AppleFactory() ;
            client.buyPhone(iphone.creatPhone());
            client.usePhone(iphone.creatOperating());
        }
    }