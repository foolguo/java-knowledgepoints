# Java—包装类

### 什么是包装类

```java
class IntDeom{
    private int num;
    public Intdeom(int num){
        this.num=num;
    }
    public int intVaule(){
        return tihs.num;
    }
}
```

**以上这种形式就是一个包装类；**



### 为什么会存在包装类

**由于Object类不能接收基本数据类形，为了实现参数统一化，让Object可以接收基本类型，将基本数据类型装箱成包装类**



但是java中一共有 byte、short、int、long四种整形；float、double两种浮点型；布尔型 boolean 字符型 char

8种数据类型；每次写代码重复写上面的代码代码重复率太高，所以java为我们提供了包装类的概念以供我们使用 

其中 Objrct类的直接子类：Boolean(boolean),Character(char);

​	Number类的直接子类：Byte(byte)、short(Short)、Integer(int)、Long(long)、Float(float)、		  double(Double)



### 装箱与拆箱

####手动装箱/拆箱

```java
public class Test{
    public static void main(String[] args){
	Integer num=new Integer(55);//手动装箱
	System.out.println(num.intValue());//手动拆箱    
	}
}
```



###自动装箱/拆箱

Java提供了自动拆箱装箱的赋值

```java
public class Test{
    public static void main(String[] args){
        Integer num=55;
        System.out.println(num);
    }
}
```



用Integer依旧有“==”和“equals”的问题：

在Integer="?",自动装箱时装箱时，如果赋值范围在“-128~127”之间时，Ineger对象会在一个 IntegerCache.cache（Integer常量池）产生，会复用已有对象，超出这个范围则重新实例化对象，所以，在判断内容之推荐用‘’equals()“;

```java
public class Test{
    public static void main(String[] args){
        Integer num1=55;
        Integer num2=55;
        Integer num3=128;
        Integer num4=128;
        System.out.println(num1==num2);//true
        System.out.println(num3==num4);//false
    }
}
```

### String与基本数据类型的相互转换

#### 1.String 转基本数据类型

用parse方法

```java
public class Test{
    public static void main(String[] args){
     	String str="123";//1...
        //String str="123a";//2...
        Integer num=Integer.parseInt(str);
        System.out.println(num);
    }
}
```



```jaav
//1...   
//输出结果
123

但是如果是  2...  那么 会报
//at java.lang.NumberFormatException.forInputString  （数字格式异常）

```

所以  ，以上代码执行时要先判断 字符串 是否由全数字组成



```java
public class Test{
    public static void main(String[] args){
 
        String str="123a";//2...
        Integer num=Integer.parseInt(str);
        if(allNumber(str)){
            System.out.println(Integer.parseInt(str));
        }else{
            System.out.println("不等转成字符串");
        }
    }
    public static boolean allNumber(String str){
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            if(data[i]<'0'||data[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
```



但是Boolean   和    Character类型不会发生这种情况  因为他们是Object类的直接子类，

### 2.基本数据类型转String

用valueOf()方法

```java
public class Test{
    public static void main(String[] args){
		
    }
}
```



