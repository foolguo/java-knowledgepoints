# Java—单例模式

### 什么是单例模式

一个类有且只能实例化一次；

在现实生活中，一个国家只有一个最高领导人，一个公司只有一个法人，这种情况生活中很多



### 如何保证只实例化一次

类的实例化过程；

```java
A a=new A();
```

首先，我们肯定不能对类的访问权限进行private,因为，类存在就是被实例化的，如果不被实例化  它将毫无意义

1.   如果要操作的话我们要将构造方法私有化；
2. 如果构造方法私有化的话，我们就无法在类的外部对类实例化，所以，类的实例化一定是在类的内部，
3. 通过static 权限的 getInstance()获得对象实例化

```java
class SimpleLeton{
    private static SimpleLeton simp=new SimpleLeton();//懒汉式单例模式  上来就new
    private SimpleLeton(){
        System.out.println("实例化对象")；
    }
    public static SimpleLeton getSimp(){
        return simp;
    }
    
}

public class Test{
    public static void main(String[] args){
        SimpleLeton le=SimpleLeton.getSimp();
        
    }
}
```



上述代码是懒汉式单例模式

### 单例模式的核心

1.有一个private的构造方法

2.有一个static修饰的静态属性， static 属性修饰的方法返回实例化对象（目的是类外不需要实例化直接调用）



除了上述的懒汉式单例模式、还有饿汉式单例模式

```java
class SimpleLeton{
    private static SimpleLeton simp;//饿汉式单例模式  需要才new
    private SimpleLeton(){
        System.out.println("实例化对象")；
    }
    public static SimpleLeton getSimp(){
        if(simp==null){
            simp=new SimpleLeton();
        }
        return simp;
    }
    
}

public class Test{
    public static void main(String[] args){
        SimpleLeton le=SimpleLeton.getSimp();
        
    }
}
```

