# Java—String的各种方法

### 字符与字符串的相互转换

| 方法声明                                        | 类型     | 作用                         |
| ----------------------------------------------- | -------- | ---------------------------- |
| public String(char[] data)                      | 构造方法 | 将字符串数组全部转换为字符串 |
| public String(char[] data,int offest,int count) | 构造方法 | 将指定内容转换为字符串       |
| public char charAt(int index)                   | 普通方法 | 取得指定索引位置的字符       |
| public char[] toCharArayr(String str)           | 普通方法 | 将字符串转换为字符数组       |

```java
//字符与字符串的转换
        char[] data=new char[]{'h','e','l','l','o'};
        String str=new String(data);//全部转换成字符串
        System.out.println(str);
		String str1=new String(data,1,2);
		System.out.println(str1);
        char[] data1=str.toCharArray();//将字符串转换成字符数组
        for(char i:data1){
            System.out.println(i);
        }
        char a=str.charAt(2);//截取指定位置的字符
        System.out.println(a);
```



### 字节数组与字符串的相互转换

| 方法声明                                        | 类型     | 作用                       |
| ----------------------------------------------- | -------- | -------------------------- |
| public String(byte[] data)                      | 构造方法 | 将字符数组全部转换为字符串 |
| public String(byte[] data,int offest,int count) | 构造方法 | 将字符数组部分转换成字符串 |
| public data[] getBytes(String str)              | 普通方法 | 将字符串转换成字符数组     |

```java
 //字符串与字节的转换
        String str="你好";
        byte[] data=str.getBytes();//将字符串转换成字符数组
        for (byte i:data
             ) {
            System.out.println(i);
        }
        String str1=new String(data);//字符数组转换为字符串
        System.out.println(str1);
	   String str2=new String(data,1,4);
	    System.out.println(str1);
```



### 字符串比较

| 方法声明                                    | 类型     | 作用                 |
| ------------------------------------------- | -------- | -------------------- |
| public boolean equals(String str)           | 普通方法 | 区分大小写比较字符串 |
| public boolean equalsIgnoreCase(String str) | 普通方法 | 不区分大小比较字符串 |
| public int toCompare(String str)            | 普通方法 | 比较两字符串大小     |

对于toCompare(str)方法，

如果引用对象 比传入对象大 ，返回正数

如果引用对象 比传入对象小 ，返回负数

```java
//字符串比较
        String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));//1.区分大小写的比较
        System.out.println(str1.equalsIgnoreCase(str2)); //2.不区分大小写的比较
        System.out.println(str1.compareTo(str2));
```



### 字符串查找

| 方法声明                                         | 类型     | 作用                                       |
| ------------------------------------------------ | -------- | ------------------------------------------ |
| public boolean contains(String str)              | 普通方法 | 查找指定字符串是否存在                     |
| public int indexOf(String str)                   | 普通方法 | 从头开始，查找指定字符串的位置             |
| public int indexOf(String str,int fromindex)     | 普通方法 | 从指定位置开始，查找指定字符串的位置       |
| public int lastIndexOf(String str)               | 普通方法 | 从字符串结尾开始，查找指定字符串的位置     |
| public int lastIndexOf(String str,int fromIndex) | 普通方法 | 从指定位置开始从尾部开始，查找字符串位置   |
| public boolean startsWith(String str)            | 普通方法 | 看字符串是否由指定字符串开始               |
| public booean startsWith(String str,int offest)  | 普通方法 | 看字符串是否的指定位置是否由指定字符串开始 |
| public boolean endsWith(String str)              | 普通方法 | 看字符串是否由指定字符串结尾               |

```java
//字符串查找
        String str1="hello world";
        System.out.println(str1.contains("l"));//查找字符串是否存在
        System.out.println(str1.indexOf("l"));//查找指定字符串的位置，如果不存在返回-1
        System.out.println(str1.indexOf("l",3));//从指定位置查找指定的字符串，不存在返回-1
        System.out.println(str1.lastIndexOf("l"));
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.endsWith("d"));
```



### 字符串替换

| 方法声明                                                    | 类型     | 作用           |
| ----------------------------------------------------------- | -------- | -------------- |
| public String replaceAll(String regex,String replacement)   | 普通方法 | 全部替换字符串 |
| public String replaceFirst(String regex,String replacement) | 普通方法 | 替换首个字符串 |

```java
    // 字符串替换
        String str="hello world";
        System.out.println(str.replaceAll("l","-"));//全替换
        System.out.println(str.replaceFirst("l","-"));//首个替换
```



### 字符串拆分

| 方法声明                                    | 类型     | 作用                     |
| ------------------------------------------- | -------- | ------------------------ |
| public String[] split(String str)           | 普通方法 | 按指定字符全部拆分       |
| public String[] split(String str,int limit) | 普通方法 | 按指定字符，按数量拆分， |

```java
    //字符串拆分
        String str="192.168.1.2";
        String[] str1=str.split("\\.");
        String[] str2=str.split("\\.",2);
        for(String i:str1){
            System.out.println(i);
        }
        for(String i:str2){
            System.out.println(i);
        }
```



### 字符串截取

| 方法声明                                           | 类型     | 作用                         |
| -------------------------------------------------- | -------- | ---------------------------- |
| public String tostring(int index)                  | 普通方法 | 从指定位置开始截取到结尾     |
| public StringtoString(int beginIndex,int endIndex) | 普通方法 | 从指定位置开始截取待指定结尾 |

```java
//字符串截取
        String str="hello world";
        System.out.println(str.substring(6));
        System.out.println(str.substring(0,5));
```



### 字符串其他的方法

| 方法声明                      | 类型     | 作用                                      |
| ----------------------------- | -------- | ----------------------------------------- |
| public String trim()          | 普通方法 | 去掉字符串左右两端空格 ，但保留中间的空格 |
| public String toUpperCase()   | 普通方法 | 将字符串全部转大写                        |
| public String toLowwerCase()  | 普通方法 | 将字符串全部转小写                        |
| public native String intern() | 普通方法 | 将字符串入池                              |
| public  String concat()       | 普通方法 | 将字符串连接  向当与“+”                   |
| public String isEmpty()       | 普通方法 | 判断字符串是否为空 ，不是null             |

```java
//字符串的其他方法
        String str=" hello world ";
        System.out.println(str);
        System.out.println(str.trim());
  
        System.out.println(str.substring(1,2).toUpperCase()+str.substring(2));//字符串首字符大写
        System.out.println((str==null||str.isEmpty()));//判断字符串是否为空
```

