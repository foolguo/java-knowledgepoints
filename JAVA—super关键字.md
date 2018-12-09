# JAVA—super关键字

1.调用父类构造方法

2.调用父类普通方法

3.调用父类属性---------------一般没有用因为属性会用private封装起来

###super调用父类构造方法

> 调用父类无参构造方法  语法super();
>
> 调用无参构造父类不存在      语法 super(参数)；

##### 调用父类无参构造

在调用父类无参构造时 super()关键字可以省略，系统会默认加上super(),这是构造方法可以使用this();

eg.......1

```java
class Person{
    private String name;
    private int age;
    public Person(){
		System.out.println("1.调用父类的构造方法");
    }
}
class Student extends Person{
    private String school;
    public Student(){
        super();//super()可以省略
        System.out.println("2.子类的无参构造");
    }

    public Student(String school){
        this();
        this.school=school;
    }
}
public class Day11{
    public static void main(String[] args){
        Student stu1=new Student("仙仙大");
    }
}
```



##### 父类无参构造不存在

1.在对象实例化时，如果父类没有无参构造，则子类在构造方法第一句一定要加上 super(参数)，否则会报错

这时，由于this()  和  super()  都要放在构造方法的第一句，所以不能同时出现；

eg........2父类无参构造不存在

```java
class Person{
    private String name;
    private int age;
    public Person(String name ,int age){
        System.out.println("调用了构造方法");
        this.name=name;
        this.age=age;
    }
    public void print(){
        System.out.println("name "+this.name+" "+"age"+age);
    }
}
class Student extends Person{
    private String school;
    public Student(String name,int age,String school){
       super(name,age);
        this.school=school;
    }
    public void print(){//方法覆写
        System.out.println(" school "+school);
        super.print();//super调用父类普通方法
        
    }
}
public class Day11{
    public static void main(String[] args){
        Student stu1=new Student("战三",20,"仙学");
        stu1.print();
    }
}
```



###调用父类普通方法

1.语法： super.方法名()

2.可以放在方法内的任何位置

例子如上 eg............2

### 调用父类属性

super.属性名-----------一般没有用因为属性会用private封装起来

