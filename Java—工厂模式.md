# Java—工厂模式



一个人，要买一个手机 他去了京东上买手机， 有两款手机  HUWEI mate20 和iPhoneXS，与是出现了一下的场景

```java
interface Phone{//定义一个手机类
    void isPhone();
}
class Mate20 implements Phone{
    public void isPhone(){//具体的手机
        System.out.println("HUAWEI mate 20");
    }
}
class IphoneXS implements Phone{
    public void isPhone(){//具体的手机
        System.out.println("Iphone XS");
    }
}
class Client{
    public void buyPhone(Phone phone){//客户类
        phone.isPhone();
    }
}
public class Day20{
    public static void main(String[] args){
        Client client = new Client();
        client.buyPhone(new Mate20());
    }
}
```

上面的方法  ，一旦你要再加上别的手机  比如新上里一款三星的手机，你想要购买，你就要在主程序里修改你要买的商品 ，这显然是不现实的  所以我们引出

###简单工厂模式

1. 一个抽象产品接口 

   2.多个具体产品类

   3.一个工厂类

```java
import java.util.Scanner;
  interface Phone{//抽象产品接口 
    void isPhone();
  }
	//具体产品接口
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
//工厂类
class phoneFactory{
    public static Phone creatPhone(String type){
        
        if(type.equals("Mate20")){
            return new Mate20();
        }else if(type.equals("Iphone XS")){
            return new IphoneXS();
        }
        return null;
    }
}
class Client{
    public void buyPhone(Phone phone){
        phone.isPhone();
    }
}
public class Day20{
    public static void main(String[] args){
        Client client =new Client();
        Scanner scanner= new Scanner(System.in);
        System.out.println("请选择型号");
        String type=scanner.nextLine();
        client.buyPhone(phoneFactory.creatPhone(type));
    }
}
```



上述代码，通过手动输入型号将类的实例化交给工厂， 每当有一个新产品时给不用修改主程序，只需要修改工厂类即可，但是  这样做依旧违反OCP（开闭原则）  

### 工厂方法模式

1.一个抽象产品接口

2.多个具体产品类

3.一个抽象工厂接口

4.多个具体工厂类

在上面简单工厂模式中，所有手机在一个工厂里生产  ，但是在现实中这是不可能出现的，所以不同品牌的手机应该在不同品牌的工厂里生产  

  在现实生活中，工厂是一个抽象的概念，所以  各自品牌的工厂实现这个抽象工厂接口

```java
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
//定义了一个工厂
interface PhoneFactory{
       Phone creatPhone();
}
//不同品牌实现这个
class HUAWEIFactory implements PhoneFactory{
    public Phone creatPhone(){
        return new Mate20();
    }
}
class AppleFactory implements PhoneFactory{
    public Phone creatPhone(){
        return new IphoneXS();
    }
}
class Client{
    public void buyPhone(Phone phone){
        phone.isPhone();
    }
}
class Day20{
    public static void main(String[] args){
        Client client = new Client();
        client.buyPhone(new AppleFactory().creatPhone());
    }
}
```

 这样做，每次有一个型产品时只需要实现工厂类即可 ，不用修改代码，只需要扩展即可  

优点：降低了代码的耦合度，对象生成交给子类去完成

​	   实现了开放封闭原则—每次添加子产品不需要修改源代码

缺点：增加了代码量，每个具体产品都要一个具体的工厂



### 抽象方法模式

 在现实生活中，一个手机当然是需要操作系统的吧  ！  一个工厂也不可能只会生产手机 

抽象方法模式就是解决一个具体工厂会生产多个产品的情况



1.多个抽象产品接口

2.多个具体产品类

3.一个抽象工厂类——定义多个抽象放啊

4.多个具体工厂类

```java
 interface Phone{//第一个抽象产品类
        void isPhone();
      }
    class Mate20 implements Phone{
          public void isPhone(){
            System.out.println("HUAWEI mate 20");
          }
    }
      class IphoneXS implements Phone{//
        public void isPhone(){
            System.out.println("Iphone XS");
        }
    }
    interface OperatingSystem{//第二个具体产品类
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
    interface PhoneFactory{//工厂接口有多个返回值为类对象的抽象方法
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
    class Client{//客户端类
        public void buyPhone(Phone phone){
            phone.isPhone();
        }
        public void usePhone(OperatingSystem use){
            use.isOperatingSystem();
        }
        public static void main(String[] args){
            Client client=new Client();
             AppleFactory iphone= new AppleFactory() ;
            client.buyPhone(iphone.creatPhone());
            client.usePhone(iphone.creatOperating());
        }
    }
```

