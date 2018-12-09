# Java—final关键字（终结器）

修饰类、修饰方法、修饰属性、修饰变量、

### final—修饰类

1.这个类不能被继承，是最终类

2.默认类中所有成员被final修饰（不包括成员变量）

### final—修饰方法

1.被final修饰的方法不能被覆写

###final—修饰属性

1.被final修饰的属性一定要赋初值，其值不能被修改

2.如果想定义常量

语法

public static final  CIRLE_RATIO=100；



### final其他注意事项

1.在进行（ +、-、 * 、/）运算时，

- ​    如果两个操作数有一个为double类型，另一个操作数转换成double，那么结果就是double类型
- ​    如果两个操作数有一个为float类型，另一个操作数转换成float，那么结果就是 float类型；
- ​    如果两个操作数有一个为long类型，另一个操作数转换成long，那么结果就是long类型；
- ​    如果操作数为任意两个进行操作（byte、short、int、char）类型，结果全是int类型

2.但是如果用final修饰操作数，那么则不会发生1.中转换



eg......3

```java
public class Day11{
    public static void mian(String[] args){
      byte b1=1,b2=2,b3,b6,b8;
      final byte b4=4,b5=6,b7=9;
      b3=(b1+b2); //错 (b1+b2)类型是int 不能放到类型是byte的b3中，  修改(int)(b1+b2) 
      b6=b4+b5;//正确
      b8=(b1+b4);//错误，原因 整形溢出
      b7=(b2+b5);  // b7 被final修饰  所以无法被再次赋值
    }
}
```

