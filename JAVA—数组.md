# JAVA—数组

###数组的定义

定义数组是一组类型相同的变量的集合：

1.在java中数组属于引用类型；

2.所有引用数据类型都在堆上开普空间；

3.数组的长度可以用  数组名.length来求；

4.如果数组越界，程序在编译过程中不会有任何问题，但是在运行时会报“java.lang.ArrayIndexOutOfBoundsException”数组越界异常，所以一定要注意数组的长度

### 初始化

#### 静态初始化

语法：

```java
类型名[] 数组名=new 类型[]{
 数据1.数据2,......数据n
}
//定义一个数组
int[] data=new int[]{1,2,3,4,5};
```



#### 动态初始化

语法

```java
类型名[] 数组名=new 类型[3];
数组名[0]=数据1;
数组名[1]=数据2;
数组名[2]=数据3;
//定义一个数组
int[] data = new int[3];
data[0]=1;
data[1]=2;
data[2]=3;
```

### 引用传递

语法

```java
类型名[] 数组名1=new 类型[3];
类型名[] 数组名2=数组名;
```

引用传递在堆上并没有发生新空间的开辟，只是在栈空间开辟的两个变量都指向用一块堆空间



### 匿名数组

```java
new int[]{1,2,3,4};
```

由于没有栈指向所以只使用一次就变为垃圾空间



### 方法接收数组，和返回数组

####方法接收数组

```java
public class Day13{
    public static void main(String[] args){
        int[] data=new int[]{1,2,3,4};
        print(data);
    }
    public static void print(int[] data){
        for(int temp:data){
            System.out.print(temp+"\t");
        }
    }
}
```

#### 方法返回数组

```java
public class Day13{
    public static void print(int[] data){
        for(int temp:data){
            System.out.print(temp+"\t");
        }
    }
    public static void main(String[] arg){
        int[] data=init();
        print(data);
    } 
    public static int[] init(){
        return new int[]{1,2,3};//返回一个匿名数组
    }
}
```





###	Java对数组的支持

#### java.util.Arrays.sort

排序

```java
import java.util.Arrays;
public class Day13{
    public static void main(String[] args){
        int[] data = new int[]{33,2,6,4,77,543};
        Arrays.sort(data);
        //java.util.Arrays.sort(data);
        print(data);
    }
    public static void print(int[] data){
        for(int temp:data){
            System.out.print(temp+"\t");
        }
    }
}
```

对所有类型适合，且只进行升序排序



#### 实现数组部分拷贝  System.arraycopy(源数组，起始位置，目标数组，起始位置，拷贝个数)

```java
public class Day13{
    public static void main(String[] args){
        int[] data1=new int[]{1,2,3,4,5,6,7,8,9};
        int[] data2=new int[]{11,22,33,44,55,66,77};
        System.arraycopy(data2,2,data1,3,5);
        print(data1);
    }
        public static void print(int[] data){
        for(int temp:data){
            System.out.print(temp+"\t");
        }
    }
}
```

####实现数组全拷贝 java.util.Arrays.copyOf(源数组名称，新数组元素个数)  

```java
import java.util.Arrays;
public class Day13{
    public static void main(String[] args){
        int[] data1=new int[]{1,2,3,4,5};
        int[] data2=Arrays.copyOf(data1,10);
        int[] data3=Arrays.copyOf(data1,3);
        print(data1);
        print(data2);
        print(data3);


    }
    public static void print(int[] data){
        for(int temp:data){
            System.out.print(temp+"\t");
        }
        System.out.println();
    }

}
```

