# Java—Object类初识

### 什么是Object类

object是所有类的父类，所有类都默认继承Object类，那就是说Object可以接收任何类的参数（向上转型）

### Object有几种方法----说两种

#### toString()方法

**1.方法作用： 获取对象信息**

```java
class A{}
public class Day32{
    public static void main(String[] args) {
        A a=new A();
        print(a);
        }
    public static void print(Object obj) {
        System.out.print(obj);
    }
}
```

结果

```java
  A@1540e19d
```



2.对toString(进行覆写)

```java
class Person{
    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {//对toString进行覆写，返回name和age
        return this.name+this.age;
    }
}
public class Day32 {
    public static void main(String[] args) {
        
        Student stu1=new Student("gg",20,"仙工大");
		print(stu1);
    }
    public static void print(Object obj){
        System.out.println(obj);//直接输出Object对象实际上就是输出obj.toString()
    }
}
```

```java
gg20仙工大
```

#### equals() 方法

1.比较对象/对equals方法覆写

```java
class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){//如果传入对象为空，一定是错的
            return false
        }
        if(this==obj){//如果传入对象地址与当前对象一样，一定内容相等
            return true;
        }
        if(!(obj instanceof Person)){//如果传入对象不属于当前类 一定是不等
            return false;
        }
        //如果程序到这里 ，说明obj一定属于当前类，，所以不用再进行判断直接向下转型
        Person per=(Person) obj;//向下转型的原因是Object类不知道Person有什么属性，所以要转成Personl类的对象
        return this.name.equals(per.name)&&this.age.equals(per.age);
    }
}
public class Day32 {
    public static void main(String[] args) {
        Person stu1=new Person("gg",20);
        Person stu2=new Person("gg",20");
        System.out.println(stu1.equals(stu2));
    }
}
```

###Object可以接收任何引用类型——java强制规定

```java
class A{}
public class Day32{
    public static void main(String[] args) {
        Object obj=new int[]{1,2,3,4};
        int[] data=(int[])obj;
        for(int i:data){
            System.out.print(i);
        }
        }
    public static void print(Object obj) {
        System.out.print(obj);
    }
}
```



