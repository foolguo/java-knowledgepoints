# java中堆内存和栈内存的分配

```java
class Person{
    private String name;
    private int age;
    public Person()
    {
        System.out.println("*******************");
    }
    public Person(String s,int a){
        name=s;
        age=a;
    } 
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a>0&&a<200){
        age=a;
        }
        else
        System.out.println("Enter error,plase Enter anagin");
    }
    public int getAge(){
        return age;
    }
    public void print(){
        System.out.println("name :"+name+"\t"+"age :"+age);
    }
}
public class Day6{
    public static void main(String[] args){
        Person per=new Person("李四",-20);
        per.setName("张三");
        per.setAge(20);
        per.print();
        String name=per.getName();
        int age=per.getAge();
        System.out.println(name); 
        System.out.println(age);
        Person per1=new Person();
        per1=per;

    }
} 
```

![类、对象](E:\java\总结\类、对象.png)

