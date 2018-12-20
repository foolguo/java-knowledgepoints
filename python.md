注释

用#  表示单行注释

用```表示多行注释的开头和结尾

1.数据类型 字符串： 用单引号或者双引号表示 

字符串检索和切片

切片：str='123456789'

str[:3]='123'

str[1:7]='234567'

str[1:7:2]='246'     

字符串操作

拼接

str1='123'

str2='456'

str1+str2 结果123456

长度

len(str1)    结果3

输入

input()

如果里面有提示信息  用‘’括起来

eg.input('请输入信息')

格式化输出

1.用百分号格式化字符

  常见的占位符和c语言一样

print('亲爱的%s你好，你%d月的话费是%2f，余额是%3f'%('张三',12,49.90,1,234))  2. {}.format()

print('亲爱的{1}你好，你{2}月的话费是{3}，余额是{4}'.format('张三',12,49.90,1.234))

保留浮点数的小数｛：.2f｝

.数据类型：

1.列表list 有序可变的数据结构，可以重复

名称=[]

 name=[]

name.append(内容)

name.insert(位置，内容)

list（name）

if 条件 in list： 

​    print（） else：

​    print()

2.数据类型 元组tuple：不可变有序的

gender=（'男','女'）

3.数据类型 字典dict：可更改 无顺序

 gader=｛ 'lily':88

'Harry':78

'James':60

｝

前键 后值

4.数据类型：集合ser不重复无序的数据结构

A=｛'python',123'python',123｝

set ('pypy111')

.条件判断

if<条件>:

\t<语句块1>

elif  <条件>：

\t<语句块2>

else：

<语句块2>

输入

s=input('情输入身高体重用，隔开').split(',')

- 结果是两个字符串

用map函数可以转换

map（float，要转换的数据）

所以可以用  map(float,s)

来转换

循环

for  变量 in range(次数):

  eg. 

for i in range(5):

print('hello:',i)

<1>range  的用法

range() 函数 ：

range(N)  ————  产生0~（N-1）的数

eg.  range(5) ---->0,1,2,3,4

range(M,N)——产生M—N序列

eg.range(2,5)——>2,3,4

range(M,N,K)——产生M~N，以k为步数序列

eg.range(2,10,2)——>2,4,6,8

<2>字符串/列表遍历循环

for item in is:

<语句块>

反复执行知道条件不满足为止

  python中的保留字

break   continue

random

<1>random.random()           产生0~1的小数

<2>random.randint(2,100)产生2~99的整数.

pythonz自定义函数

<1>def  函数名（参数列表）：（def自定义函数关键字）

eg.

def fact(n):

s=1

for i in range(1,n+1):

s*=i

return s

if _name_=='_main_':#主函数入口

a=fact(5)

print(a)

<2>可选参数

def fact（x，n=2）:

<3>可变参数：可以定义可变数量参数，

def 函数名（x,(*b)）:           这里的*b是元祖taple

eg.

def fact(*b):

s=0

for i in b:

s+=pow(i,2)

return s

if _name_=='_main_':

s=fact(1,2,3)

print(s)

匿名函数——生成列表时用的

  关键字 lambda

应用场景：生成列表时使用：

L=[X*X for x in range(1,6)]

li=list(map(lambda x:x*x,[1,2,3,4,5]))

局部变量&全局变量

n,s=10,100

def fact(n):

global s   #global 定义了全局变量

for i in range(1,n+1)

s*=i

return s

print(fact(n),s)

如果 return 两个数那么   返回值类型是一个元组

模块与包

自定义模块时

加入"init_.py"文件

说明是一个包

模块使用

import XXX ——>不包里所有模块导入

from XXX import YYY ——>从XXX包里导入YYY模块

import XXX as YYY   ——>包名太长  改名

 