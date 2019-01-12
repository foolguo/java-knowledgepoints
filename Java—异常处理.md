

# Java—异常处理

### 异常

#####异常的结构



异常分为：

受查异常：RuntimeException、IOException ，Java不强制进行异常处理

非受查异常：处理受查异常之外的异常

Error   ：java内部因为资源耗尽或者内部处理所出现的异常，（OOM，StackOverError）

RuntimeException:程序运行时错误，是由于程序本身的错误导致的异常

IOException:由于I/O这类的错误导致的程序的异常，比如打开一个不存在的文件



### 异常处理格式

有三种  try...catch...;  try...finally...;  try...cacth...finally;

```java
//第一种
try{
    //可能出现异常的语句
}catch(Exception e){
	//捕获到的异常，输出异常信息
}

//第二种
try{
    //可能出现的异常
}finally{
    //异常处理的结束，无论如何都执行
}

//第三种
try{
    //可能出现的异常
}catch(Exception e){
    //捕获的异常
}finally{
	//无论如何一定执行
}

```

##### 如果没有异常处理的结果

如果没有异常处理，则出现异常后的程序自动停止，不会接着往下走，但是如果有了异常处理，会输出异常信息，

在异常语句出现后的语句还会正常运行

eg...1

```java
public class Test{
    public static void main(String[] args){
        System.out.println("异常的开始");
        try{
            System.out.println((10/0));//语句1
        }catch(Exception e){
            System.out.println("输出一个异常信息");
            e.printStackTrace();//输出错误信息
        }
        System.out.println("异常的结束");
    }
}
```

程序结果

```java
java.lang.ArithmeticException: / by zero
异常的开始  
输出一个异常信息
	at Test.main(Test.java:92)
异常的结束

```

我们可以看出来异常语句后的语句可以被执行

##### finally语句块中的语句，一定会被执行

```java
public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            return ;//代表执行为这一句程序结束
        }finally{
            System.out.println("必须输出的结束语句");//重点语句  看输出
        }
    }
}
```

```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
必须输出的结束语句   //重点语句他被输出了
	at Test.main(Test.java:104)

Process finished with exit code 1

```

所以，如果try{}中有return ；语句则 finally语句中的内容在return ； 前执行  **换句话说  finally中的语句一定被执行**

### throws关键字

告诉使用者，该程序中有哪些异常，但是throws关键字本身不对异常进行处理，将异常抛回给调用方处理

##### 用法：

用在方法上

1.用在普通方法上

```java
public class Test {
    public static void main(String[] args) {
        int result=0;
        try{
            result=Divi(10,0);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(result);
    }
    public static int Divi(int num1,int num2) throws Exception{
        return num1/num2;
    }
}
```

如果在普通方法中，不处理异常，那么就由主方法对异常进行捕获和处理；

但是，如果主方法也不处理主方法可以继续向上抛出异常；

2.throws 在主方法上执行

```java
public class Test {
    public static void main(String[] args)throws Exception {
        System.out.println("haha");

        int result=Divi(10,0);
        System.out.println("haha");
        System.out.println(result);
    }
    public static int Divi(int num1,int num2) throws Exception{
        return num1/num2;
    }
}
```

```java
haha
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Test.Divi(Test.java:115)
	at Test.main(Test.java:105)

Process finished with exit code 1

```

 我们可以看到在主方法中抛出异常，异常语句后的 语句不会执行，这种方式异常交给JVM处理

这就是两种方式的区别



### throw关键字

在程序编写中，由人为进行异常的抛出。如果现在异常对象实例化不希望由JVM 产生而由用户产生，就可以使用throw方法

```java
public class Test{
    public static void main(String[] args)throws Exception {
        try{
            throw new Exception("抛一个异常");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

```java
java.lang.Exception: 抛一个异常
	at Test.main(Test.java:117)

Process finished with exit code 0
```



### 异常处理标准格式

```java
public class Test{
    public static void main(String[] args) {
        try{
            System.out.println(caculate(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int caculate(int x,int y)throws Exception{
        int result=0;
        try{
            result=x/y;
        }
        //可以省略
        //catch(Exception e){
        //    throw e;
        //}
        finally{
            System.out.println("计算结束");
        }
        return result;
    }
}
```



### 自定义异常类

//用于特定的场景,比如用户输入的字符串不可以有@ 字符

```java
import java.util.Scanner;
class CharException extends Exception{
    public AddException(String msg){
        super(msg);
    }
}
public class Test{
    public static void main(String[] args) throws Exception{
       	Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        if(str1.contains("@")){
            throw new AddException("非法字符");
        }
    }
}
```

