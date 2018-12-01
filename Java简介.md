#Java简介

 

##Java是一门半编译半解释性语言

编译命令:javac

使用编译命令javac将*.java(源文件)编译为*.class

class文件为平台无关的二进制文件，提供给JVM(Java虚拟机)

解释命令:java

使用java命令实际上启动了JVM虚拟机进程(软件)来将二进制class文件翻译为平台相关的可执行文件并执行。

 

## 主方法中字符串数组传值 

使用java命令解释二进制class文件时传值，eg:

java Day1 hello world

表示运行Day1文件并将hello world传值给主方法参数,hello是args[0],world args[1]

主方法一定在主类(public class)中定义,主类名称与源文件名称保持一致，一个源文件有且只有一个主类

源文件中若有中文，编译时使用如下命令

javac -encoding UTF-8 源文件名称

 

 

