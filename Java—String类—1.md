# Java—String类—1

### 实例化方法

#### 直接赋值/构造法

```java
String str1="hello";//直接赋值
String str2=new String("hello");//构造法
```

#### 字符串相等比较

两种方法：

”==“：进行的数值比较，比较的是两个字符串对象的内存地址数值

“equals”：可以进行字符串内容比较

```java
String str1="hello";
String str2=new String("hello");
System.out.println(str1==str2);//false
System.out.println(str1.equals(str2));//true
```

#### 字符串常量是String的匿名对象

在java中本身没有提供字符串常量的概念，所有使用“”定义的内容本质上来讲都是String的匿名对象。

**验证**

```java
String str1="hello";
String str2=new String("hello");
System.out.println(str1.equals(str));
System.out.println("hello".equals(str));//"可以进行对象引用"，所以是对象
```

Tips:在用equals方法对指定字符串和用户输入字符串进行比较时，指定字符串方到前面，因为用户可能没有输入

发生NullPointerCase空指针异常

```java
String str1=null;
Scanner scanner=new Scanner(System.in);
str1=scanner.nextLine();
System.out.println("hello".equals(str1));//
```

### 实例化区别

#### 1.采用直接赋值

```java
String str1="hello";
String str2="hello";
String str3="hello";
System.out.println(str1==str2);//true
System.out.println(str2=str3);//true
System.out.println(str1==str3);//true
```

是这个样子呢？   

以上这种情况说明，三块对象引用指向一块空间；

其实，java采用的是共享机制

在JVM底层实际上回自动维护一个对象池，如果现在采用直接赋值对对象进行实例化，那么该实例化对象（字符串内容）会自动保存到该对象池中。如果下次再继续使用直接赋值的模式声明String类对象，此时对象池中如果有指定内容，将直接进行引用；如若没有，则开辟新字符串对象而后将其保存在对象池中下次使用。

#### 2.采用构造法

```java
String str1="hello";
String str2=new String("hello");
```

构造法：

1.会产生两块空间，其中一块，变成垃圾空间；

2.不会自动入池，但是可以手动入池intern()方法；

![String的两种构造方法的比较](E:\java\总结\String的两种构造方法的比较.png)

比较：

1.直接赋值，产生一块堆空间，并且字符串对象可以自动保存在对象池中以供瞎使用；

2.构造方法：会开辟两块堆空间，其中一块变成垃圾空间，不会自动保存到对象池中，可以用intern()自动赋值

### 字符串不可变更

![字符串不可修改](E:\java\总结\字符串不可修改.png)

```java
String str="hello";
str+=" world";
str+="!!!";
System.out.println(str);
```

