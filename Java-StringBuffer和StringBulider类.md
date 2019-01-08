# Java-StringBuffer和StringBulider类

### 为什么存在这两个类

1.因为String类的内容不可修改，每用“+”操作实际上是改变字符串对象的引用指向，每次使用“+”都会生成两块垃圾空间；

2.SB类的内容可以修改，不会产生垃圾空间 ，修改时用

```java
StringBuffer sb= new StringBuffer();
sb.append(Object obj);//接收各种类型 返回StringBuffer类型
```



### 两个SB类与String类的相互转换

1.String转SB： 方法一：用构造方法：方法二：用append()  因为此方法可以接收各种类型，返回StringBuffer();

2.SB转StringBuffer:用toString()方法

### SB类的特殊方法

#####reverse  ：字符串翻转

```java
public class Day31{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        
        System.out.println(sb.reverse());
    }
}
```



##### delete：指定位置字符串删除

```java
public class Day31{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb.delete(0,2));
    }
}
```



##### insert:字符串插入

```java
public class Day31{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("world");
        System.out.println(sb.insert(0,"hello "));
    }
}
```



### String类与两个SB类的区别

   1.字符串常量不可变，SB类内容可变；但是在进行“+”操作时， javac会将String转成StringBulider,用append()进		          行连接；

2. StringBuffer是同步处理，属于线程安全操作，性能低；StringBulider是异步处理，属于线程不安全操，性能高