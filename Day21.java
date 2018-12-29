//  代理设计模式
//  1.  两个子类共同实现一个接口
//  2.  一个真是实现，一个辅助实现


//买电脑

// interface BuyComputer{
//     void buyComputer();
// }
// class RealProduce implements BuyComputer{  //真实要实现的事情  
//     public void buyComputer(){
//         System.out.println("买一台电脑");
//     }
// }
// class ProxySubject implements BuyComputer{//  2.为了要实现这个事情的努力
//     private BuyComputer iscomputer; 
//     public ProxySubject(BuyComputer iscomputer){
//         this.iscomputer=iscomputer;
//     }
//     public void produce(){
//         System.out.println("1.  生产电脑");
//     } 
//     public void afterSafe(){
//         System.out.println("3.售后");
//     }
//     public void buyComputer(){
//         this.produce();
//         iscomputer.buyComputer();
//         this.afterSafe();
//     }
// }
// class Factory{//工厂类的主要作用就是讲类的实例化封装到类中  ，即使方便解耦
//     public static BuyComputer factory(){
//         return new ProxySubject(new RealProduce());
//     }
// }
// public class Day21{
//     public static void main(String[] args){
//         BuyComputer a = Factory.factory();
//         a.buyComputer();
//     }
// } 

//  一个节目组要找明星上一档节目   节目组不会直接找到明星  而会找到明星的经纪人

// interface Produce{
//     void TVShow();
// }
// class SuperStar implements Produce{
//     public void TVShow(){
//         System.out.println("明星上综艺");
//     }
// }
// class ProxyMan implements Produce{
//     private Produce proxy;
//     public ProxyMan(Produce proxy){
//         this.proxy=proxy;
//     }
//     public void real(){
//         System.out.println("1.节目组和经济人联系");
//     }
//     public void after(){
//         System.out.println("3.节目组给酬劳");
//     }
//     public void TVShow(){
//         this.real();
//         proxy.TVShow();
//         this.after();
//     } 
// } 

// class Factory{
//     public static Produce getIntance(){
//         return new ProxyMan(new SuperStar());
//     }
// }
// public class Day21{
//     public static void main(String[] args){
//         Produce proxy= Factory.getIntance();
//         proxy.TVShow();
//     }
// }

