# java—代理模式

### 什么是代理模式

两个子类共同实现一个接口，一个子类是真实业务，另一个子类是辅助真实业务实现的操作

在现实生活中，代购，外卖，明星与经纪人都是这种模式

我们用外卖举例子

```java
interface ISubject{//接口
    void buyFood();
}
class RealSubject implements ISubject{//真实业务类
    @Override
    public void buyFood() {//覆写接口方法
        System.out.println("买一份鱼香肉丝");
    }
}
class ProxeySubject implements ISubject{
    private ISubject user;
    public ProxeySubject(ISubject user){//这里有接口对象的原因是为了调用真实业务类 是接口的对象是为了扩展业务，可以有不同用户来买
        this.user=user;
    }
    public void beforeBuyFood(){//辅助类的业务
        System.out.println("外卖小哥接到订单，去店里取餐");
    }
    public void afterBuyFood(){//辅助类的业务
        System.out.println("外卖小哥将钱送到客户手上");
    }
    @Override
    public void buyFood() {
        beforeBuyFood();
        user.buyFood();//真实操作由用户自已完成
        afterBuyFood();
    }

}
class Factory{
    public static ISubject getInstance(){
        return new ProxeySubject();
    }
}
public class Day32{
    public static void main(String[] args) {
        //这里new的是辅助业务类是因为辅助业务是辅助类的方法
        ISubject subject=Factory.getIntance();
        subject.buyFood();
    }
}

```



对于代理模式，我们要注意的几个点事：

1.辅助类中为什么要传入真实类对象，目的时核心业务由真实业务类完成

2.为什么辅助类中用接口对象接收：为了扩展业务，传入对象有若干个，用子类对象接收只能接收1个，而用接口可以实现若干个；

3.为什么用代理对象实例化，因为调用的buyFood()是辅助业务的方法



**我们可以分析，在传入真实类的对象之前，辅助类是不知道真实类要干什么业务的，在传入对象之后，辅助类才知道要干什么业务，**

**我们以上面的例子为例：**

**1.我想吃一份鱼香肉丝，在外卖平台上下单（真实业务类）；**

**2.下单后外卖小哥知道我吃什么，去店里点餐（真实类对象传入辅助类中，用接口接收，为了可以接收不同的要求，比如另一个人想吃麻婆豆腐）；**

**3.在买单的时候 ，用的的我的钱， 不是外卖小哥的，所以相当于买这个动作（核心业务）是由我实现的，**

**4.外卖小哥将饭送给我；**



**所以在进行一个业务中  比如买饭    可以有多个真实业务类，但是只有一个辅助业务类，**