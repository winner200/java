### 2一、什么是软件呢？

- 计算机包括两部分：硬件、软件

#### 1、硬件：

> - 鼠标、键盘、显示器、主机内的CPU、内存条，硬盘等。

> 注意：计算机只有硬件是无法工作的，需要软件驱动硬件才能工作。

#### 2、软件：

> - 软件包括系统软件和应用软件；

系统软件：

> - 直接和硬件交互的软件，例如：win10，win7，Linux等操作系统。

应用软件：

> - 应用软件通常运行在系统软件中。例如：QQ运行在Windows操作系统上。
> - QQ就是应用软件，win10就是操作系统软件。

#### 总结：

> - 我们通常所说的软件开发一般都是指使用计算机编程语言完成“应用软件”开发。

---

### 二、开发软件如下：

阐述：开发软件需要计算机编程语言，计算机编程语言有很多，例如：C语言、c++、Java、.NET、c#、php....

---

### 三 、java

##### 3.1 什么是JDK

> - Java开发工具包，做Java开发必须安装一个工具包，该工具包需从官网下载。目前sum被Oracle收购了，所以下载需要去Oracle下载。https://www.oracle.com

### 3.2 Java包含三大块

##### 3.2.1 JavaSE（Java标准版）

> - Javase 是基础。

##### 3.2.2 JavaEE（Java企业版）

##### 3.2.3 JavaME（Java微型版）

> - 主要是开发电饭煲内核开发，吸尘器内核开发。

---

### 四、Java语言特性

- 开源、免费、跨平台、纯面向对象

##### 4.1 简单性

> - 相对而言的例如Java中不在支持多继承，c++是支持多进程的，多继承比较复杂。
> - c++中有指针，Java中屏蔽了指针的概念，所以相对来说Java是简单的。
> - Java语言底层是c++实现的，不是c语言。

##### 4.2 面向对象

> - java 是纯面向对象的，更符合人的思维，更容易理解。

##### 4.3 可移植性

什么是可移植性？

> - java程序可以做到一次编译，到处运行。
> - 也就是说Java程序可以在Windows操作系统运行，不做任何修改，同样的Java程序可以直接放到Linux操作系统上运行，这个被称为Java程序的可移植性，或者叫跨平台。
> - Windows操作系统内核跟Linux操作系统内核肯定不同，他们这两个操作系统执行指令的方式也是不一样的。

结论：

> - 显然Java程序不能直接和操作系统打交道，因为Java程序只有一份。操作系统执行原理都不同。
> - SUN的团队很聪明，他们想了一个办法，让Java程序运行在一台虚拟的计算机当中，这个虚拟计算机叫Java虚拟机，简称JVM。JVM在和底层的系统打交道。

##### 4.4 多线程

##### 4.5 健壮性

> - 和自动垃圾回收机制有关，自动垃圾回收机制简称GC机制。
> - Java语言运行过程中产生的垃圾是自动回收的，不需要程序员关心。

##### 4.6 安全性

---

### 五、Java的加载与执行

#### 5.1 java程序的运行包括两个非常重要的阶段

##### 5.1.1编译阶段：

> - 编译阶段主要任务是检查Java源程序是否符合Java语法。
> - 符合Java语法则能够生成正常的字节码文件（.class）。
> - 不符合Java语法规则则无法正常生成字节码文件。
> - 字节码文件中不是纯粹的二进制，这种文件无法直接在操作系统上运行。

##### 5.1.2编译阶段的过程：

> - 程序员需要在硬盘的某个位置<位置随意>新建一个.java扩展名的文件，该文件被称为Java源文件，源文件当中编写的是Java源代码/源程序。而这个程序不能随便编写，必须负责Java语法规则。
> - Java程序员需要使用JDK当中自带的Javac.exe命令进行Java程序的编译。Javac是一个Java编译器的工具/命令。

Javac怎么用呢？在哪用呢？

> - 在DOS命令窗口使用。

Javac 的使用规则：

```
javac Java源文件路径
```

一个Java源文件可以编译生成多个.class文件。【以后再说】

> - 字节码文件/class 文件最终要执行的文件，所以说class文件生成之后，Java文件删除并不会影响Java程序的运行。但是一般Java源程序不要删除，因为class文件最终执行效果可能不是我们想要的，那么这个时候需要回头再重新修改Java源程序，然后将Java源程序重新编译生成新的class文件，然后在运行这个class程序，生成新的结果。
> - 编译结束后，可以将class文件拷贝到其他操作系统当中运行。【跨平台】

##### 5.1.3运行阶段：【可以在其他操作系统中，跨平台】

> - JDK安装之后，除了自带一个Javac.exe之外，还有另一个工具/命令，叫做Java.exe，Java.exe主要负责运行阶段。

Java.exe在哪用？怎么用？

> 在DOS窗口中使用。

例如：Java 类名

```
硬盘上有一个A.class，那么就这样用 java a
硬盘上有一个B.class，那么就这样用 java b
硬盘上有一个C.class，那么就这样用 java c

注意：不要写成这样：java a.class 【这种写法是错误的】
```

##### 5.1.4运行阶段的过程：

> - 打开DOS命令窗口
> - 输入：java A
> - Java.exe命令会启动Java虚拟机（JVM），JVM会启动类加载器classLoader
> - classLoader会去硬盘上搜索A.class文件，找到该文件则将该字节码文件装载到JVM当中
> - JVM将A.class字节码文件解释成二进制10001001这样的数据。
> - 然后操作系统执行二进制和底层硬件平台进行交互。

### 六、开始第一个Java程序

- 安装JDK，JDK一般是从Oracle官网下载。
- JDK、JRE、JVM、的关系搞清楚。

#### 6.1 JDK目录的介绍

##### 6.1.1 JDK/bin：该目录存放了很多命令，例如javac.exe 和 java.exe

> - Javac.exe负责编译。
> - java.exe负责运行。

#### 6.2 javac命令怎么用？

> - Javac java源文件路径

注意：路径包括相对路径跟绝对路径都可以。

```
javac HelloWord.java
```

#### 6.3 运行java程序：

##### 6.3.1 需要使用java命令

##### 6.3.2 首先测试java命令是否可用

```
zhbruce@zhang java-1 % java -version 
java version "1.8.0_281"
Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)
zhbruce@zhang java-1 % 
```

##### 6.3.3 使用方式

- Java 类名（硬盘上有HelloWorld.class，那么类名就是HelloWorld）

```java
java HelloWorld
```

> - 注意：java命令后面跟的不是文件路径，是一个类的名字。



- 一定要把DOS窗口终端的目录切换到HelloWorld.class文件所在的目录。
- 然后直接执行：java HelloWorld

##### 6.3.4 打开DOS命令窗口，执行 java HelloWorld 执行原理？

> - Java.exe 命令启动JVM。
> - JVM启动之后会启动类加载器classLoader。
> - classLoader会在硬盘上某个位置搜索HelloWorld.class字节码文件。
> - 找到文件则执行，找不到则报错。

##### 6.3.5 疑问：classLoader在哪个位置上搜索HelloWorld.class字节码文件的？

> - 默认情况下classLoader从当前路径下加载xxx.class字节码文件的。
> - 当然也可以让classLoader去某个指定的路径下加载字节码文件，这时需要配置环境变量classpath。
> - classpath环境变量属于java语言中的环境变量，不属于Windows操作系统，【PATH环境变量属于操作系统】
> - classpath是给classLOader类加载器指路的。

> - 设置以下的环境变量：

```
classpath = D:\JavaProjects\02-JavaSE\day02
打开DOS窗口命令在任意位置都可以执行：java HelloWorld
```

> - classpath环境变量没有配置的话，类加载器默认从当前路径下查找字节码文件，当classpath环境变量配置为某个指定路径之后，类加载器只去指定的路径当中加载字节码文件。
> - 综上所述，环境变量classpath不在配置，这样类加载器会自动从当前路径下加载class字节码文件，所以，每一次执行.class程序的时候，需要在DOS窗口中先切换到.class字节码文件所在的路径下。

可以这样配置classpath：

> - Classpath = .
>
> 注意：路径中 ".." 代表上级目录；路径中 “.” 代表当前目录。当你 ”cd .“ 的时候是不会切换的 

---

### 七：关于java语言中的注释

#### 7.1 什么是注释：

- 出现java源程序当中，对java源代码解释说明。
- 注释不会编译到.class字节码文件当中。

##### 7.1.1 java 的注释怎么写呢？

单行注释

```
// 单行注释
```

多行注释

```
/*
	多行注释
	.....
*/
```

javadoc注释

> - 这种注释是比较专业的注释，该注释信息会被javadoc.exe工具解析提取并生成帮助文档。

```
/**
* javadoc注释
* javadoc注释
* javadoc注释
*/
```

### 八、public class 和 class的区别：

- 一个java源文件当中可以定义多个class。
- 一个java源文件当中public的class不是必须的。
- 一个class会定义生成一个xxx.class字节码文件。

```
class B {}
class X {}
class Y {}
```

- 一个java源文件当中定义公开的类的话，public的class只能有一个，并且该类名称必须和java源文件名称一致。

##### 8.1 每一个class当中都可以编写main方法，都可以设定程序的入口，想执行B.class中的main方法：java B，想执行X.class当中的main方法就是 java x

> - java x

注意：当在命令窗口中执行java B 的时候，那么要求B.class当中必须有主方法，没有主方法会出现运行错误：

```
G:\Java\java\javase>java B
错误: 在类 B 中找不到 main 方法, 请将 main 方法定义为:
   public static void main(String[] args)
否则 JavaFX 应用程序类必须扩展javafx.application.Application
```

上述完整代码如下：

```
class B {
	// 如果里面不写入口方法，那么运行时会报错。
	/*
	public static void main(String[] args){
		System.out.println("B s main method invoke！");
	}
	*/
}

class X {
	public static void main(String[] args) {
		System.out.println("X s main method invoke！");
	}
}

class Y {
	public static void main(String[] args) {
		System.out.println("Y s main method invoke！");
	}
}

/*
public class Y {
	
}
*/

// 只能有一个public类。因为类名是跟源文件名称对应的。
public class K {
	public static void main(String[] args) {
		System.out.println("k s main method invoke！");
	}
}
```

# 第二章

### 2.1 java语言基础 -- 标识符

##### 2.1.1 关于java语言当中的标识符

什么是标识符？

> - 在java源程序当中凡是程序员有权利自己命名的单词都是标识符。

标识符可以标识什么元素呢？

> - 类名、方法名、变量名、常量名、接口名

##### 2.1.2 标识符的命名规则

> - 一个合法的标识符只能由 “数字、字母、下划线_、美元符号$”组成，不能含有其他符号。
> - 不能数字开头。
> - 严格区分大小写。
> - 关键字不能做标识符。
> - 理论上无长度限制，但是最好不要太长。

##### 2.1.2 标识符的命名规范【只是一种规范，不属于语法，不遵守规范编辑器不会报错】

> - 最好见名知意。
> - 遵守驼峰式命名方式。【SystemService，UserName】
> - 类名、接口名：首字母大写，后面每个单词首字母大写。
> - 变量名、方法名：首字母小写，后面每个单词首字母大写。
> - 常量名：全部大写。

##### 2.1.3 常见的关键字有哪些？

> - public、class、static、void、if、for、while、do、default、byte、short、int、long、float、double、boolean、char、private、protected、switch、true、flase、throw、throws、try、catch、const、new

### 2.2 java语言基础 -- 字面值

##### 2.2.1 字面值：字面值就是数据

字面值是java源程序的组成部分之一，包括标识符和关键字他们都是java源程序的组成部分。

> - 10、100；
> - 3.14
> - “abc”
> - 'a'
> - true、false

数据在显示世界当中是分门别类的，所以数据在计算机编程语言当中也是有类型的：【数据类型】

> - java语言当中的所有的字符串型字面值必须使用 **双引号** 括起来，双引号是半角。
> - java语言当中的所有的字符型字面值必须使用 **单引号** 括起来，单引号是半角。

| 字面值          | 类型               |
| --------------- | ------------------ |
| 10、100         | 属于整数型字面值   |
|                 |                    |
| 3.14            | 属于浮点型字面值   |
| “abc”、“中国人” | 属于字符串型字面值 |
| ‘A’、‘人’       | 属于字符型字面值   |
| true、false     | 属于布尔型字面值   |

### 2.3 关于java语言中的变量

##### 2.3.1 什么是变量

> - 变量本质上来说是内存中的一块空间，这块空间有 “数据类型”、“有名字”、“有字面值”；
> - 变量包含三部分：数据类型、名称、字面值【数据】；
> - 变量是内存中存储数据最基本的单元；

##### 2.3.2 数据类型的作用

> - 不同的数据有不同的类型，不同的数据类型底层会分配不同大小的空间。
> - 数据类型是指导程序在运行阶段应该分配多大的内存空间，

##### 2.3.3 变量的要求

> - 变量中存存储的具体的“数据” 必须和变量的“数据类型”一致，当不一致的时候回编译报错。

##### 2.3.4 声明/定义变量的语法格式：

> - 数据类型 变量名；

数据类型：

> - 目前我们还没有学习数据类型，但是提前告诉大家，有一种数据类型叫 int。

变量名：

> - 只要是合法的标识符就行，规范要求：首字母小写，后面每个单词首字母大写。

例如：

```
int i;
int age;
int size;

其中int是数据类型，i、age、size都是变量名；
```

##### 2.3.5 变量声明之后怎么赋值？

语法格式：

> - 变量名 = 字面值

> - 要求：字面值的数据类型必须和变量的数据类型一致。“=” 等号是一个运算符，叫做赋值运算符，赋值运算符先运算等号右边的表达式，表达式执行结果之后的结果赋值给左边的变量。

声明和赋值可以一起完成：

```
int i = 10
```

变量赋值之后，可以重新赋值，变量的值可变化：

```
int i = 10;
System.out.println(i); // 10
i = 20;
System.out.println(i); // 20
i = 100;
System.out.println(i); // 100
```

有了变量的概念之后，内存空间得到了重复使用：

```
int i = 10
System.out.println(i)
..... 执行了很多其他代码
.....
System.out.println(i) // 内存空间不会销毁i
```

通常访问一个变量包括两种访问形式：

> - 读取变量中保存的具体数据 get/获取；
> - 修改变量中保存的具体数据 set/ 修改；

```
i = 20; // 修改
System.out.println(i) // 读取
```

变量在一行上可以声明多个

```
int a,b,c;
```

java中的变量必须先声明，在赋值，才能访问。

> - int i ; 程序执行到这里，内存空间并没有开辟出来，变量 i 并没有初始化。所以没有赋值之前是无法访问的。

综上述完整代码如下：

```
public class VarText01 {
	public static void main(String[] args) {
		// 声明一个int类型的变量，起名i
		int i;
		// 编译报错：变量i并没有初始化。
		// System.out.println(i)
		
		// 给i变量赋值，i变量在这里完成初始化，内存开辟。
		i = 100;
		System.out.println(i);
		
		// i再次重新赋值
		i = 200;
		System.out.println(i);
		
		// 一行上可以同时声明多个变量
		// a和b尚未初始化，c赋值300
		int a,b,c = 300;
		
		// 编译错误
		//System.out.println(a);
		// 编译错误
		//System.out.println(b);
		
		System.out.println(c);
		
		a = 10；
		b = 20;
		System.out.println(a);
		System.out.println(b);
	}
}
```

##### 2.3.6 关于java语言中的变量须知：

- 在方法体当中的java代码，是遵守自上而下的顺序执行的。逐行执行。
  - 注意：上一行的代码必须完整的结束之后，下一行才会执行。 

在同一个“作用域”当中，变量名不能重名，但是变量可以重新赋值。

综上述完整代码如下：

```
public class VarText02 {
	public static void main(String[] args) {
		int i = 100;
		System.out.println(i); // 100
		
		i = 200;
		System.out.println(i); // 200
		
		// 以下代码顺序有错误，先声明然后在赋值在访问
		/*
		System.out.println(k);
		int k = 100;
		*/
		
		/*
		int i = 90;
		System.out.println(i);
		*/
	}
}
```

##### 2.3.7 关于java语言中的变量作用域：

什么是作用域：

> - 变量的作用域，其实描述的就是变量的有效范围。
> - 变量的作用域只要记住一句话。出了大括号就不认识了。

综上述所有的代码：

```
public class VarText03 {
	
	// 注意：这里的static不要去掉
	static int k = 90;
	public static void main(String[] args) {
		
		// 变量i的作用域是main方法。
		// 在整个main方法当中是有效的，可见的，可以访问的。
		int i = 100;
		
		System.out.println(i); // 可以
		System.out.println(k); // 可以
		
		for(int a = 0; a < 10; a++) { // a变量的作用域在整个for循环，for循环结束之后，a变量的内存就释放了。
			
		}
		// 这里无法访问a变量
		// System.out.println(a); 
		
		int j; // 作用域是main方法
		for(j = 0; j < 10; j++){
			j = i;
		}
		System.out.println("我是" + j); // 访问的是main方法中的j变量
	}
	public static void doSome() {
		// 这里无法访问main方法当中的变量i
		// 已经出了i变量的作用域。
		//System.out.println(i); // 不可以
		
		System.out.println(k); // 可以
	}
}
```

##### 2.3.8 变量的分类

根据变量生命的位置来分类：

> - 局部变量：在方法体当中声明的变量叫做局部变量；
> - 成员变量：在方法体外【类体之内】声明的变量叫做成员变量；
>
> 注意：在不同的作用域当中，变量名是可以相同的。在同一个作用域当中变量名不能重名。

代码示例如下：

```
public class VarText04 {
	// 成员变量
	int k = 200;
	public static void main(String[] args) {
		// i变量就是局部变量
		int i = 10;
		
		// java遵循 “就近原则”
		System.out.println(i);
	}
	
	// 成员变量
	int i = 100;
	
	// 类体中不能直接编写java语句，除声明变量之外。
	System.out.println(i);
	// doSome方法
	public static void doSome() {
		
		// 局部变量
		int i = 90;
	}
}
```

### 2.4 java的数据类型

##### 2.4.1 数据类型的作用是什么？

- 程序当中有很多数据，每一个数据都有相关的类型的，不同数据类型的数据占用空间大小不同。
- 数据类型的作用是指导JVM在运行程序的时候给该数据分配多大的内存空间。

##### 2.4.2 java的数据类型包括两种：

> - 基本数据类型，引用数据类型【接口、数组、类】

##### 2.4.3 关于基本数据类型：

> - 基本数据类型包括四大种八小种：

第一类：整数型

> - byte，short，int，long

第二类：浮点型

> - float，double

第三类：布尔型

> - boolean

第四类：字符型

> - char

##### 2.4.4 字符串

字符串 “abc”不属于基本数据类型，属于 “引用数据类型”，字符属于基本数据类型：

> - 字符串使用双引号 ：“abc”；
> - 字符使用单引号：‘a’；

##### 2.4.5 八种基本数据类型各自占用空间大小是多少？

| 基本数据类型 | 占用空间大小【单位、字节】 |
| ------------ | -------------------------- |
| byte         | 1                          |
| short        | 2                          |
| int          | 4                          |
| long         | 8                          |
| float        | 4                          |
| double       | 8                          |
| boolean      | 1                          |
| char         | 2                          |

##### 2.4.5 计算机在任何情况下都只能识别二进制：

>  例如：1010101010100101.....

什么二进制？

> - 数据的一种表示形式。十进制表示满十进一原则，二进制表示满二进一原则。

```
十进制：
	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

二进制：
 0 1 10 11 100 101 111 1000 1001 1100 1111 ....
 0 1  2  3  4   5    6   7    8    9   10
```

##### 2.4.6 字节（byte）是什么？

```
1Byte = 8 bit 【一个字节 = 8个比特位】1个比特位表示一个二进制位：1/0
1KB = 1024Byte
1MB = 1024KB
1GB = 1024MB
1TB = 1024GB

1TB = 1024 * 1024 * 1024 * 1024 * 8 这么多Byte
```

##### 2.4.7 整数当中的byte类型：

整数当中的byte类型，占用1个字节，所以byte类型的数据占用8个比特位。那么byte类型的取值范围是什么？

> - 关于java中的数据类型，数字都是有正负之分的，所以在数字的二进制当中有一个二进制位被称为 “符号位”。并且这个“符号位”在所有二进制的最左边，0表示正数，1表示负数。

二进制和十进制之间转换规则：

> - 二进制转换十进制；
> - 十进制转换二进制；

byte类型最大值：01111111

> - byte类型最大值：2的7次方 - 1，结果就是：127

```
00000000 00000000 1000000（二进制）
减去1结果是:
00000000 00000000 0111111（二进制）
```

byte类型最小值是：-128

> - 具体怎么用二进制表示：这个和原码、反码、补码有关；

byte类型取值范围：【-128 ~ 127】

> - byte可以表示256个不同的数字（也就是可以表示256个不同的二进制位，因为一个二进制对应一个数字。）

##### 2.4.8 计算机只认识二进制，那么计算机是怎么表示现实世界当中的文字的呢？

> - 八种基本数据类型当中，byte、short、int、long、float、double、boolean这七种数据类型计算机在表示的时候比较容易，因为底层都是数字，十进制的数字和二进制之间存在一种固定的转换规则。
> - 但是八种基本数据类型当中的char类型表示的是现实世界中的文字，文字和计算机二进制之间 “默认” 情况下是不存在任何转换关系的。
> - 为了让计算机可以表示现实世界当中的文字，我们需要进行人为的干涉，需要人负责提前制定好 “文字” 和 “二进制” 之间的对照关系。这种对照转换关系被称为：字符编码。

计算机最初只支持英文，最先出现的字符编码是：ASCII码：

> - 编码和解码的时候采用同一套字段/对照表，不会出现乱码。
> - 当解码和编码的时候采用的不是同一套对照表，不是同一套规则，会出现乱码问题。

```
'a' ----> 97 【01100001】
'A' ----> 65
'0'-----> 48

'a' ---按照ASCII编码---> 01100001
01100001 ---按照ASCII解码---> 'a'
```

##### 2.4.9 字符编码的历史发展：

- 随着计算机的发展，后来出现一种编码方式，是国际化标准组织ISO制定的，这种编码方式支持西欧语言，向上兼容ASCII码，仍然不支持中文。这种编码方式是：ISO-8859-1，又被称为latin-1。

- 随着计算机向亚洲发展，计算机开始支持中文、韩文、日文等国家文字，其中支持简体中文的编码方式：

  > GB2312 < GBK < GB18030

- 支持繁体中文：大五码 <big5>

- 后来出现了一种编码方式统一了全球的所有文字，容量较大，这种编码方式叫做：Unicode编码，unicode编码方式有多种具体的实现：

  > - UTF-8
  > - UTF-18
  > - UTF-32

- java语言采用的是哪一种编码方式呢？

  > java语言源代码采用的是unicode编码方式，所以 “标识符” 可以写中文。

- 在实际开发中，一般使用UTF-8编码方式较多。【统一编码方式】

##### 2.4.9 八种基本数据类型取值范围：

| 类型描述     | 关键字  | 字节数  | 取值范围                                        | 默认值   |
| ------------ | ------- | ------- | ----------------------------------------------- | -------- |
| 字节型       | type    | 1个字节 | -128 -- 127                                     | 0        |
| 短整型       | short   | 2个字节 | -32768 -- 32767                                 | 0        |
| 整型         | int     | 4个字节 | -2147483648 -- 2147483647                       | 0        |
| 长整型       | long    | 8个字节 | -9223372036854775808 -- 9223372036854775807     | 0        |
| 单精度浮点型 | float   | 4个字节 | 大约±3.40282347E+38E（有效位数6-7位）           | 0.0f     |
| 双精度浮点型 | double  | 8个字节 | 大约±1.79769313486231570E + 308（有效位数15位） | 0.0d     |
| 字符型       | char    | 2个字节 | 0 -- 2 从 0-- 65535                             | '\u0000' |
| 布尔型       | boolean | 1个字节 | true/fasle                                      | false    |

### 2.5 java数据类型详解

##### 2.5.1 char类型详解 -- 简单操作

```java
public class DataType5{
	
	// 这里的static必须加，别问为什么！
	static int k = 1000;
	
	// 变量还是遵循这个语法：必须先声明，在赋值，才能访问。
	// 成员变量没有手动赋值系统会默认赋值【局部变量不会】
	static int f; // 成员变量
	public static void main(String[] args) {
		/*
			int i;
			System.out.println(i);
		*/
		
		System.out.println(k);
		
		System.out.println(f);// 0
		
		// 定义一个char类型的变量，起名c，同时赋值字符 'a'
		char c = 'a';
		System.out.println(c);
		
		// 一个中文占用2个字节，char类型正好是2个字节。
		// 所以java中的char类型变量可以存储一个中文字符。
		char x = '国';
		System.out.println(x);
		
		// 编译错误
		// ab是字符串不能使用单引号括起来
		// char y = 'ab';
		
		// "a" 是字符串类型
		// k变量不是char类型
		// 类型不兼容，编译错误。
		// char k = "a";
		
		// 声明
		char e;
		
		// 赋值
		e = 'e';
		System.out.println(e);
		
		// 再次赋值
		e = 'f';
		System.out.println(e);
	}
}
```

##### 2.5.2 char类型详解 -- 转义符 \

- 转义字符出现在特殊字符之前，会将特殊字符转义成普通字符。

```
\n  换行符
\t  制表符
\'  普通单引号
\\  普通反斜杠
\"  普通的双引号
```

十进制、八进制、十六进制、二进制

```
十进制：0 1 2 3 4 5 6 7 8 9 10 11 12.....
二进制：0 1 10 11 100 101 1000 10001 .....
十六进制：0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20....
八进制：0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
```

转义符相关的代码：

```java
public class DataType06 {
	public static void main(String[] args) {
		// 普通的n字符
		char c1 = 'n';
		System.out.println(c1);
		
		// 依照目前所学知识，以下程序无法编译通过，因为显然是一个字符串，不能使用单引号括起来。
		// 但是经过编译，发现编译通过了，这说明以下并不是一个字符串，而是 “一个” 字符。
		// 反斜杠在java语言中当中具有转义功能。
		// \n为换行符 
		char c2 = '\n';
		
		/*
		System.out.println("Hello");
		System.out.println("World");
		*/
		
		// System.out.println() 和 System.out.print() 区别：
		// println输出之后换行，print表示输出，但是不换行。
		// System.out.print("Hello");
		// System.out.println("world");
		
		System.out.print("A");
		System.out.print(c2);
		System.out.println("B");
		
		// 普通的t字符
		char x = 't';
		System.out.println(x);
		
		// 制表符tab
		// 强调：制表符和空格不同，他们的ASCII不一样，提现在键盘上两个不同的按键。
		char y = '\t';
		System.out.print("A");
		System.out.print(y);
		System.out.println("B");
		
		// 要求在控制台上输出 “反斜杠字符”
		// 反斜杠将后面的单引号转义成不具备特殊含义的普通单引号字符，左边的单引号缺少了结束单引号字符，编译报错。
		
		/*
		char k = '\';
		System.out.println(k);
		*/
		
		/*
			\\ 
			解释：第一个反斜杠具有转义功能，将后面的反斜杠转义为普通的反斜杠字符。
			结论：在java当中两个反斜杠代表一个普通的反斜杠字符。
		*/
		char k = '\\';
		System.out.println(k);
		
		// 在控制台输出一个普通的单引号字符
		// char a = ''; // java中不允许这样编写程序，编译报错。
		// System.out.println(a);
		
		// 以下编译报错：第一个单引号和第二个单引号配对儿，最后的单引号找不到另一半儿！
		// char a = ''';
		// System.out.println(a);
		
		// 反斜杠具有转义功能，将第二个单引号转换成普通的单引号字符
		// 第一个单引号和最后单引号配对儿。
		char a = '\'';
		System.out.println(a);
		
		char f = '"';
		System.out.println(f);
		
		System.out.println("Hello world");
		System.out.println("”Hello world“");
		System.out.println("\"Hello world\"");
		
		char m = '中';
		System.out.println(m);
		
		// JDK中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式
		// 怎么使用这个命令呢？
		// 在命令行输入：native2ascii 回车 然后输入中文 回车 即可得到unicode编码
		char n = '\u4e2d'; // '中' 对应的unicode编码是 4e2d
		System.out.println(n);

		// 编译错误
		//char g = '4e2d';
		// 编译错误
		//char g = 'u4e2d';
		// 通过反斜杠u联合起来后面的一串数字是某个文字的unicode编码
		char g = '\u4e2d';

		/*
		char类型的默认值
		char c10 = '\u0000';
		System.out.println(c10);
		*/

	}
}
```

##### 2.5.3 关于java语言当中的整数型

> - byte、short、int、long
> - java语言当中“整数型字面值”被默认当做int类型来处理，要让这个“整数型字面值”被当做long类型来处理的话，需要在“整数型字面值”后面添加l/L，建议大家使用大写的L。

java语言当中的整数型字面值有三种表示方式：

> 1. 十进制【是一种缺省默认的方式】常用
> 2. 八进制【在编写八进制整数型字面值的时候需要以0开始】
> 3. 十六进制：【在编写十六进制整数型字面值的时候需要以0x开始】

##### 2.5.4 关于java语言当中的整数型

int/long类型

```java
public class DataType07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 010; // 整数型字面值以0开头的，后面那一串数字就是八进制形式；
		int c = 0x10; // 整数型字面值以0x开头的，后面那一串数字就是十六进制形式；
		System.out.println(a); // 10
		System.out.println(b); // 8
		System.out.println(c); // 16
		
		System.out.println(a + b + c); // 34
		
		// 123这个整数型字面值是int类型
		// i变量声明的时候也是int烈性
		// int类型的123赋值给int类型的变量i，不存在类型转换
		int i = 123;
		System.out.println(i);
		
		// 456整数型字面值被当做int类型，占用4个字节。
		// x变量在声明的时候是long类型，占用8个字节。
		// int类型的字面值456赋值给long类型的变量x，存在类型转换。
		// int类型转换long类型。
		// int类型是小容量。
		// long类型是大容量。
		// 小容量可以自动转换成大容量，称为自动类型转换机制。
		long x = 456;
		System.out.println(x);
		
		// 2147483647字面值是int类型，占用4个字节
		// y是long类型，占用8个字节，自动类型转换
		long y = 2147483647;
		System.out.println(y);
		
		// 编译错误：过大的整数：2147483648
		// 2147483648被当做int类型4个字节处理，但是这个字面值超出int类型范围
		// long z = 2147483648;
		
		// 解决错误
		// 2147483648字面值一上来就当做long类型来处理，在字面值后面添加L
		// z是long类型变量，以下程序不存在类型转换。
		long z = 2147483648L;
		System.out.println(z);	
	}
}
```

类型强制转换 byte、short、int、long

```java
public class DataType08 {
	public static void main(String[] args) {
		// 100L是long类型字面值
		// x是long类型变量
		// 不存在类型转换，直接赋值
		long x = 100L;
		
		// x变量是long类型，8个字节
		// y变量是int类型，4个字节
		// 以下程序可以编译通过吗？
		// 编译报错，大容量不能直接赋值给小容量
		//int y = x;
		
		// 大容量转换成小容量，需要进行强制类型转换
		// 强制类型转换需要加“强制类型转换符”
		// 加上强制类型转换符之后编译通过了，但是在运行阶段可能损失精度。
		// 所以强制类型转换谨慎使用，因为损失精度以后可能损失很严重。
		
		/*
			强转原理：
				原始数据：00000000 00000000 00000000 00000000 00000000 00000000 00000000 01100100
				强转之后的数据：00000000 00000000 00000000 01100100
				将左边的二进制砍掉【所有的数据强转的时候都是这样完成的】
		*/
		int y = (int)x;
		System.out.println(y);
		
		// 原始数据：00000000 00000000 00000000 00000000 10000000 00000000 00000000 00000000
		// 强转之后的数据：10000000 00000000 00000000 00000000
		// 10000000 00000000 00000000 00000000目前存储在计算机内部，计算机存储数据都是采用补码的形式存储，
		// 所以10000000 00000000 00000000 00000000现在是一个补码形式。将以上的补码转换到原码就是最终的结果。
		
		long k = 2147483648L;
		int e = (int)k;
		System.out.println(e); // 损失精度严重，结果是负数。【-2147483648】
		
		// 分析以下程序是否可以编译通过？
		// 依据目前所学内容，以下程序是无法编译通过的。
		// 理由：50是int类型的字面值，b是byte类型的变量，显然是大容量int转换成小容量byte。
		// 大容量转换成小容量需要添加强制类型转换符的，以下程序没有添加强转符号，所以编译报错。
		// 但是在实际编译的时候，以下代码编译通过了。这说明，在java语言当中，当一个整数型字面值没有超出byte类型取值范围的话，该字面值可以直接赋值给byte类型的变量。
		byte b = 50; // 可以
		
		byte c = 127; // 可以
		
		//byte b1 = 128; // 编译报错，128这个int类型的字面值已经超出了byte类型的取值范围，不能直接赋值给byte类型的变量。
		
		// 纠正错误，需要使用强制类型转换符，但是一定会损失精度。
		// 原始数据：00000000 00000000 00000000 10000000
		// 强转之后：10000000 【这是存储在计算机内部的，这是衣蛾补码，他的源码是什么？】
		byte b1 = (byte)128; // -128
		System.out.println(b1);
		
		/*
			计算机二进制有三种表示形式：
				原码
				反码
				补码
			计算机在任何情况下底层表示和存储数据的时候采用了补码形式。
			正数的补码：和原码相同
			负数的补码：负数的绝对值对应的二进制码所有二进制位取反，再加1
			
			补码：10000000
			原码计算过程：
				* 1000000 - 1 --> 01111111
				* 1000000 --> 128
				* -128
		*/
		
		// 原始数据：00000000 00000000 00000000 11000110
		// 强制类型转换之后：11000110
		// 11000110现在是计算机当中存储，他是一个补码，将补码转换成原码就是该数字。
		// 11000110 - 1 ---> 11000101
		// 00111010 【2 + 8 + 16 + 32】---58
		// -58
		byte m = (byte)198;
		System.out.println(m);
		
		short s = 32767; // 通过
		short s1 = 32768; // 编译报错
		
		// 65535是int类型，4个字节，cc是char类型，2个字节，按照以前所学的知识，以下程序是编译报错的。
		char cc = 65535;
		cc = 65536;
		
		/*
			当一个整数字面值没有超出byte、short、char的取值范围，
			这个字面值可以直接赋给byte,short,char类型的变量。
			这种机制SUN允许了，目的是为了方便程序员编程。
		*/
	}
}
```

##### 2.5.5 关于java语言当中的浮点型

- float 单精度【4个字节】
- double双精度【8个字节，精度较高】

> - double的精度相对太低，不适合做财务软件。
> - 财务涉及到钱的问题，要求精度较高，所以SUN公司在基础SE类库中为程序员准备了精度较高的类型，只不过这种类型是一种引用数据类型，不属于基本数据类型，它是：java.math.BigDecimal

- 其实java程序中SUN公司提供了一套庞大的类库，java程序员是基于这套类库进行开发的。所以要知道java的SE类库的字节码在哪儿？要知道java的SE类库源码在哪？

  > SE类库字节码：D:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.zip
  >
  > SE类库源码：D:\Program Files\Java\jdk1.8.0_281\src.zip

- 例如：String.java 和 String.class

  - 我们的（String[] args）中的String使用的就是String.class字节码文件。

- 在java语言当中，所有的浮点型字面值【3.0】默认被当做double类型来处理，要想该字面值当做float类型来处理，需要在字面值后面添加F/f。

- 注意：

  - double和float在计算机内部二进制存储的时候存储的都是近似值。
  - 在现实世界当中有一些数字是无限循环的，例如：3.3333333333333.....。
  - 计算机的资源是有限的，用有限的资源存储无限的数据只能存储近似值。

综上述全部代码如下：

```
public class DataType09 {
	public static void main(String[] args) {
		// https://www.jb51.net/article/185654.htm
		// https://www.cnblogs.com/li1234567980/p/11746872.html
		
		// 3.0是double类型的字面值
		// d是double类型的变量
		// 不存在类型转换
		double d = 3.0;
		System.out.println(d);
		
		// 5.1是double类型的字面值
		// f是float类型的变量
		// 大容量转换成小容量需要加强制类型转换符，所以以下程序编译错误
		// float f = 5.1;
		
		// 解决方案：第一种方式，强制类型转换
		//float f = (float)5.1;
		
		// 解决方案：第二种方式，没有类型转换。上来就是float类型的字面值
		float f 5.1f;
	}
}
```

##### 2.5.6 关于Boolean类型

> - 在java语言当中boolean类型只有两个值，true、false，没有其他值。不像C语言当中，0和1表示假和真。
> - 在底层存储的时候boolean类型占用一个字节，因为实际存储的时候false的底层是0，true的底层是1。

```java
这个没有创建java文件
public class boolean {
    public static void main(String[] args) {
        // 编译错误，不兼容类型
        //boolean flag = 1;
        
        boolean loginSuccess = true
        
        if(loginSuccess) {
            System.out.println("恭喜你，登录成功");
        }else {
            System.out.println("对不起，用户名不存在或者密码错误！");
        }
    }
}
```

### 2.6 关于基本数据类型之间的互相转换：转换规则

1. 八种基本数据类型当中除布尔类型之外剩下的7中类型之间都可以互相转换。

##### 2. 小容量向大容量转换，称为自动转换。容量从小到大排序：

> - byte < short < int < long < float <double <char

注意：

> - 任何浮点类型不管占用多少个字节，都比整数容量大。
> - char 和 short 可表示的种类数量相同，但是char可以取更大的正整数。

3. 大容量转换成小容量叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，但是在运行阶段可能会损失精度，所以谨慎使用。

4. 当整数字面值没有超出byte、short、char的取值范围，可以直接赋值给byte、short，char类型的变量。

5. byte、short、char混合运算的时候，各自先转换成int类型在做运算。

6. 多种数据类型混合运算，先转换成容量最大的那种类型在做运算。

注意：

```java
byte b = 3; // 可以编译通过，3没有超出byte类型的取值范围。

int i = 10；
byte b = i/3; // 编译报错，编译期只会检查语法，不会运算i/3

```



数据类型的例子如下：

```java
public class DataTypeTest8 {
  public static void main(String[] args) {
    byte a = 1000; // 出现错误，1000超出了byte的范围
    byte a = 20; //正确，因为20没有超出byte取值范围，所以赋值
    short a = 1000; // 变量名不能重复
    
    short b = 1000; // 正确，因为数值1000没有超出short类型，所以可以赋值
    
    int c = 1000; // 正确，因为默认就是int，并没有超出int范围。
    long d = c; // 正确，可以自动转换。
    
    int e = d; // 错误，出现精度丢失问题，大类型 ---->> 小类型会出现问题。
    int e = (int)d; // 将long强制转换成int类型，因为值1000没有超出int范围，所以强制转换是正确的，不会丢失精度。
    
    /* 因为java的运算会转换成最大的类型，而10和3默认都为int类型，所以运算后的最大类型也是int类型。然后赋值给 int型变量f；
       所以是正确的
    */
    int f = 10/3; //3 
  	long g = 10; // 声明10为long类型
    /*
    	出现错误，多个数值在运算过程中，会转换成容量最大的类型。以下示例最大的类型为double，而h为int，所以就会出现大类型（long）
    	到小类型（int）的转换，将会出现精度丢失问题。
    	程序在编译的时候不做运算，只检查语法。javac只负责语法检测，JVM才会运算。
    */
    int h = g/3; 
    int h = (int)g/3; // 可以强制转换，因为运算结果没有超出int范围。
    long h = g/3; // 可以采用long类型变量来接收运算结果。
    /*
    	出现精度缺失问题，以下问题主要是优先级问题，将g转换成int，然后又将int类型的g转换成byte，最后byte类型的g和3运算，那么他的
    	运算结果类型就是int，所以int赋值给byte就会出现精度缺失问题。
    */
    byte h = (byte)(int)g/3;
    /*
    	正确，给g/3加上了括号，优先级就高于类型转换了。就会先计算g/3，在做类型转换。计算完的结果3转换成int类型，再转换成byte类型。
    	然后再将byte类型的字面值3赋值给byte类型的h变量
    */
    byte h = (byte)(int)(g/3);
   	short h = (short)(g/3); // 可以转换，因为运算结果没有超出short范围。
    
    short i = 10;
    byte j = 5;
    
    /*
     	错误，short和byte运算，首先会转成int在运算，所以运算结果int，int赋值给short就会出现精度丢失问题。
    */
     short k = i + j;
     short k = (short)(i+j); // 可以将运算结果强制转换成short  
     int k = i+j; // 因为运算结果为int，所以可以采用int类型接收
     
     char l = 'a'
     System.out.println(l); // a 
     System.out.println((type)l); // 输出结果为97，也就是a的ascii值
     
     int m = l + 100;
     System.out.println(m); // 输出结果为197，取得a的asscii码值，然后与100进行相加运算
   	 
     double dd = 10/3;
     System.out.println(dd); // 3.0
     dd = 10.0/3;
     System.out.println(dd); // 3.333333333
  }
}
```



