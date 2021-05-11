## 一、java运算符

### 1. 运算符按功能划分运算符如下：

算数运算符：

> +、-、*、/、++、--、%

关系运算符

>   <、<=、>、>=、==、!=

布尔运算符（逻辑运算符）

>   &&、||、&、!

位运算符

> &、|、~、^、>>、>>>、<<
>
> &： 按位与（AND）【真真为真，真假为假】
>
> | ：按位或（OR）【假假为假，其余全假】
>
> ^：按位异【相同为假，不同为真】
>
> ~：按位非（NOT）真则假，假则真
>
> ">>"：右移
>
> “>>>”：右移，左边空出来的位以0填充
>
> “<<”：左移

赋值类运算符：

> =、+=、-=、*=、/=、%=

字符串连接运算符：

> +

条件运算符：

> ?:

其他运算符：

#### 1.1 关于java运算符：算数运算符

> - 注意：一个表达式当中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升。没有必要去专门记忆运算符的优先级。

```
+  	求和
-	相减
*	乘积
/	商
%	求余数【取模】
++ 	自加1
--	自减1
```

例子如下：

```
public class OperatorTest01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		
		System.out.println(i + j); // 13
		System.out.println(i - j); // 7
		System.out.println(i * j); // 30
		System.out.println(i / j); // 3
		System.out.println(i % j);// 1
		
		// 以下++为例，--运算符自学。
		// 关于++运算符【自加1】
		
		int k = 10;
		
		// ++运算符可以出现在变量的后面【单目运算符】
		k ++;
		
		System.out.println(k); // 11
		
		int y = 10; 
		
		// ++运算符可以出现在变量的前面【单目运算符】
		
		++ y;
		
		System.out.println(y); //11
		
		// 小结：
		// ++运算符可以出现在变量前，也可以出现在变量后，无论是变量前还是变量后，只要++运算结束，该变量中的值一定会自加1
		
		//++ 出现在变量后：
		// 规则：先做赋值运算，在对变量中保存的值进行加1
		int a = 100;
		int b = a ++;
		System.out.println(a); // 101
		System.out.println(b); // 100

		//++ 出现在变量前
		// 规则：先进行自加1运算，然后在进行赋值操作；
		int m = 20;
		int n = ++m;
		System.out.println(b); // 21
		System.out.println(b); // 21

		int mm = 500;
		System.out.println(mm);

		int e = 100;
		System.out.println(e ++) // 100
		System.out.println(e) // 101

		int s = 100;
		System.out.println(++s) // 101
		System.out.println(s) // 101

		System.out.println("------");
		System.out.println(--s) // 100
		System.out.println(s++) // 100
		System.out.println(s--) // 101
		System.out.println(s--) // 100
		System.out.println(s--) // 99
		System.out.println(s) // 98
	}
}
```

#### 1.2 关系运算符

 ```
>	大于
>=	大于等于
<	小于
<=	小于等于
==	等于
!=	不等于

= 是赋值运算符
== 是关系运算符

关系运算符的运算结果一定是布尔类型：true/false

关系运算符的运算原理：
	int a = 10;
	int b = 10;
	a > b比较的时候，比较的是a中保存的这个值和b中保存的这个值之间的大小比较。
	a == b也是如此。
 ```

```java
public class OperatorTest02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a > b); // false
		System.out.println(a >= b); // true
		System.out.println(a < b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // true
		System.out.println(a != b); // false
		System.out.println(a > b); // false
	}
}
```

#### 1.3 逻辑运算符

##### 1.2.1 逻辑运算符如下：

> - 逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果也是一个布尔类型；

```
&		逻辑与【并且】（两边的算子都是true，结果才是true）
!		逻辑非【或者】（取反，!false就是true，!true就是false。这是一个单目运算符）
|		逻辑或（两边的算子只要一个是true，结果就是true）
^		逻辑异或（两边的算子只要不一样，结果就是true）

&&		短路与
||		短路或

短路与和短路或最终的运算结果是相同的，只不过短路与存在短路现象。
短路或和逻辑或最终的运算结果是相同的，只不过短路或存在短路现象。

什么情况下发生短路现象呢？
什么时候选择使用逻辑与运算符呢？什么时候选择使用短路与运算符呢？
```

> - 从某个角度来看，短路与更智能。由于后面的表达式可能不执行，所以执行效率较高。这种方式在实际的开发中使用较多。短路与比逻辑与使用的多。短路与更常用。
> - 但是，在某些特殊的业务逻辑中，要求运算符两边的算子必须全部执行，此时必须使用逻辑与。不能使用短路与，使用短路与可能导致右边的表达式不执行。

什么情况下发生短路或？

> - 第一个表达式执行结果是true，会发生短路或。

什么情况下发生短路与？

> - 第一个表达式执行结果是false，会发生短路与。

综上述代码如下：

```
public class OperatorTest03 {
	public static void main(String[] args) {
		// 运算符优先级不确定，加小括号
		System.out.println(5 > 3 & 5 > 2); // true
		System.out.println(5 > 3 & 5 > 6); // false
		System.out.println(5 > 3 | 5 > 6); // true
		
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		System.out.println(true | false); // true
		System.out.println(false | false); // false
		
		System.out.println(!false); // true
		System.out.println(!true); // false
		
		System.out.println(true ^ false); // true
		System.out.println(false ^ false); // false
		System.out.println(true ^ true); // false
		
		// 逻辑与和短路与
		//int x = 10;
		//int y= 8;
		// 逻辑与
		//System.out.println(x < y & ++x < y);
		//System.out.println(x); // 11
		
		// 逻辑与和短路与
		int x = 10;
		int y= 8;
		// 短路与
		// x < y结果是false，整个表达式结果已经确定是false，所以后面的表达式没有在执行，这种现象被称为短路现象。
		// 短路现象才会有短路现象，逻辑与是不会存在短路现象的。
		System.out.println(x < y && ++x < y); 
		System.out.println(x); // 10
	}
}
```

#### 1.4 赋值运算符

##### 1.4.1 赋值运算符

- 赋值类的运算符优先级：先执行等号右边的表达式，将执行结果赋值给左边的运算符。

> - 基本的赋值运算符
> - 扩展的赋值运算符

- 注意一下代码：

```
byte i = 10;
i += 5; 等同于：i = (byte)(i + 5);

int K = 10;
K += 5; 等同于：K = (int)(K + 5);

long a = 10L;
long b = 20;
b += a;// 等同于：y = (int)(a + b);
```

基本赋值运算符：

> =

扩展赋值运算符：

> +=、-=、/=、%=

重要结论如下：

> - 扩展类的赋值运算符不改变运算结果类型，假设最初这个变量的类型是byte类型，无论怎么进行追加或者追减，最终该变量的数据类型还是byte类型。

综上述代码如下：

```
public class OperatorTest04 {
	public static void main(String[] args) {
		// 基本的运算符
		int i = 10;
		System.out.println(i); // 10
		
		i = i + 5;
		System.out.println(i); // 15
		
		// 扩展的赋值运算符：【+= 运算符可以翻译为“追加/累加”】
		i += 5; // 等同于：i = i + 5
		System.out.println(i); // 20
		
		i -= 5; // 等同于：i = i - 5;
		System.out.println(i); // 15
		
		i *= 2; // 等同于：i = i * 5;
		System.out.println(i); // 30
		
		i /= 4; // 等同于：i = i / 4;
		System.out.println(i); // 7
		
		i %= 2; // 等同于：i = i % 2;
		System.out.println(i); // 1

		// ------------------------------------
		// 10没有超出byte取值范围，可以直接赋值。
		byte b = 10;
		//b = 15; // 可以编译通过，因为15没有超出byte取值范围。
		// 编译报错，编译器只会检查语法，不运行程序。编译器发现b+5的类型是int类型，b变量的数据类型是byte类型。
		// 大容量像小容量转换需要加强制类型转换符，所以一下程序编译报错。
		//b = b + 5;

		// 纠正错误：
		b = (byte)(b + 5);

		byte x = 10;
		x += 5; //等同于：x = (byte)(x + 5)，其实并不等同于：x = x + 5;
		System.out.println(x); // 15

		byte y = 0;
		byte y += 128; //等同于：y = (byte)(y + 128);
		System.out.println(y); // -128 编译通过，但是损失精度。

		y += 10000;
		System.out.println(y); // -112 编译通过，但是损失精度。
	}
}
```

##### 1.4.2 字符串连接运算符

关于java中的“+” 运算符：

```
+号运算符在java语言当中有两个作用：
	* 加法运算
	* 字符串的连接运算
```

> - 当 “+” 运算符两边的数据都是数字的话，一定是进行加法运算。
> - 当 “+” 运算符两边的数据只有一个数据是字符串，一定会进行字符串连接运算。并且连接运算的结果还是一个字符串类型。

```
数字 + 数字 ----> 数字【求和】
数字 + "字符串" ---> "字符串"【字符串连接】
```

> - 在一个表达式当中可以出现多个 ”+“ ，在没有添加小括号的前提之下，遵循自左向右的顺序依次运算。如果加了小括号，则先运算括号里面的。

综上述代码如下：

```java
public class OperatorTest05 {
	public static void main(String[] args) {
		
		System.out.println(10 + 20); //"30" 这里的加号是求和
		System.out.println(10 + 20 + 30); //"60" 这里的加号也是求和
		System.out.println(10 + 20 + "30"); //"3030" 自左向右的顺序一次计算，第一个加号是求和，第二个加号是字符串连接。
		System.out.println(10 + (20 + "30")); // "102030"
		
		int a = 10;
		int b = 20;
		
		// 要求在控制台中输出："10 + 20 = 30"
		System.out.println("10 + 20 = 30");
		
		// 要求以动态的方式输出：
		System.out.println("10 + 20 =" + a + b); // 10+ 20 = 1020
		
		System.out.println("10 + 20 =" + (a + b)); // 10 + 20 = 30
		
		System.out.println("a + 20 = " + (a + b));
		
		System.out.println(a + "+" + b + " = " + (a + b));
		
		a = 100;
		b = 200;
		
		System.out.println(a + " + " + b + " = " + (a + b));
		
		// 引用数据类型 String
		// String是SUN在javaSE当中提供的字符串类型
		// String.class 字节码文件
		
		// int 是基本数据类型，i是变量名，10是int类型的字面值
		// int i = 10;
		
		// String 是引用数据类型，s是变量，"abc"是String类型的字面值
		// String s = "abc";
		
		// 编译错误。类型不兼容
		//String ss = 10;
		
		// 定义一个String类型的变量，起名username，赋值 "zhangsan"
		String username = "zhangsan";
		System.out.println("登录成功，欢迎username回来！");
		
		System.out.println("登录成功，欢迎"+ username +"回来！");
		
	}
}
```

##### 1.4.3 三目运算符/三元运算符/条件运算符

语法规则：

> - 布尔表达式 ? 表达式1 : 表达式2

三元运算符的执行原理：

> - 当布尔表达式结果是true的时候，选择表达式1作为整个表达式的执行结果。
> - 当布尔表达式结果是false的时候，选择表达式2作为整个表达式的执行结果。

综上述代码如下：

```java
public class OperatorTest06 {
	public static void main(String[] args) {
		// 编译错误，不是一个完整的java语句
		// 10;
		
		// 编译错误：不是一个完整的java语句
		// '男'
		
		// 布尔类型的变量
		boolean sex = false;
		
		// 分析以下程序是否可以编译通过？
		// 编译报错，因为他不是一个完整的java语句。
		// sex ? '男' : '女';
		
		char c = sex ? '男' : '女';
		System.out.println(c);
		
		sex = true;
		c = (sex ? '男' : '女');
		System.out.println(c);
		
		// 语法错误，编译报错，结果可能是String，也可能是char，但是前边不能用char来接收数据。
		// 类型不兼容
		//char c1 = sex ? "男" : '女';
		
		// 编译错误，类型不兼容，因为是语法问题。表达式都不会执行成功
		// sex = false;
		// char c1 = sex ? "男" : '女';
		
		System.out.println(10);
		System.out.println("10");
		System.out.println('1');
		
		// 可以
		System.out.println(sex ? '男' : '女');
		
	}
}
```

## 二、控制语句

#### 选择结构

- if 、if ..else
- switch

##### if语句之键盘按下操作

```java
public class KeyInputTest01 {
	/*
		System.out.println() 负责向控制台输出【从内存到控制台，输出的过程，这是从内存中出来了】

		接受用户键盘输入，从“键盘”到 “内存”。【输入的过程，到内存中去】
	 */
	public static void main(String[] args) {
		// 第一步，创建键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 第二步：调用Scanner对象的next() 方法可以接收用户键盘输入。
		// 程序执行到这里会停下来，等待用户输入。
		// 当用户输入的时候，并且敲回车键的时候，键入的信息会自动赋值给userInputContent
		// 程序执行到这里，用户输入的信息已经到内存中了。
		// 接收文本【以字符串的形式接收】
		String userInputContent = s.next(); //标识符的命名规范：见名知意

		// 接收数字【以整数型int的形式来接收】
		int num = s.nextInt();

		// 将内存中的数据输出到控制台
		// System.out.println("您输入了：" + userInputContent);

		System.out.println("您输入的数字是：" + num);
		System.out.println("计算结果：" + num + 100);
	}
}
```

```java

/*
	需求：
		假设系统给定一个人的年龄（这个人的年龄需要从键盘输入），
		根据年龄来判断这个人处于生命的哪个阶段。年龄必须在[0-150]
		
		[0-5] 幼儿
		[6-10] 少儿
		[11-18] 青少年
		[19-35] 青年
		[35-55] 中年
		[56-150] 老年
*/

public class IfTest01 {
	public static void main(String[] args) {
		// 接收键盘输入：年龄【输入的时候必须输入数字】
		java.util.Scanner s = new java.util.Scanner(System.in);
		//System.out.println("请输入您的年龄：");
		System.out.print("请输入您的年龄："); // 输出提示信息，不然用户根本不知道这里要干嘛！
		int age = s.nextInt(); // 停下来等到用户的输入，输入后自动接收，赋值给age变量。
		System.out.println("age = " + age);
		
		// 根据需求进行业务逻辑判断
		String persionMsg = "幼儿";
		if(age < 0 || age > 150) {
			persionMsg = "您提供的年龄不合法，年龄只需要在[0-150]之间";
		}else if(age <= 5) {
			persionMsg = "幼儿";
		}else if(age > 5 && age <= 10) {
			persionMsg = "少儿";
		}else if (age > 10 && age <= 18) {
			persionMsg = "青少年";
		}else if (age > 18 && age <= 35) {
			persionMsg = "青年";
		}else if (age > 35 && age <= 55) {
			persionMsg = "中年";
		}else if (age > 55 && age <= 150) {
			persionMsg = "老年";
		}
		System.out.println(persionMsg);
	}
	
}
```

##### switch语句

> - switch语句也属于选择结构，也是分支语句。

switch语句的语法结构：

```
switch(int或String类型的字面值或变量) {
	case int或String类型的字面值或变量：
		java语句;
		......
		break;
		case int或String类型的字面值或变量：
		java语句;
		......
		break;
	default: 
		java语句;
		......
}
```

switch语句的执行原理：

> - switch后面的小括号当中的“数据”和case后面的“数据”进行一一匹配，匹配成功的分之执行。按照自上而下的顺序一次匹配。
> - 匹配成功的分之执行，分之当中最后有“break”语句的话，整个switch语句终止。
> - 匹配成功的分之执行，分之当中没有“break”语句的话，直接进入下一个分之执行（不进行匹配），这种现象被称为case穿透现象。【提供break语句，可以避免穿透】
> - 所有分之都没有匹配成功，当有default的语句话，会执行default分之当中的程序。
> - switch后面和case后面只能是int或者String类型的数据，不能探测其他数据。
>   - 当然，byte、short、char也可以直接写到switch和case后面，因为他们可以进行自动类型转换。byte、short、char可以自动转换成int类型。
>   - JDK6的，switch和case后面只能探测int类型。
>   - JDK7之后包括7版本在内，引入新特性，switch关键字和case关键字后面可以探测int或Sting类型数据。

case 合并：

```
int i = 10;

switch(i) {
	case 1: case 2: case 3: case 10: // 只要是匹配到其中一个，都会执行此语句。
		System.out.println("Test Code!");
}
```

switch需要注意的点：

```java
public class Switch01 {
	public static void main(String[] args) {
		/* 编译报错
		long a = 10L;
		int b = a;
		*/
		/*
		long x = 100L;
		switch(x) {} // 编译报错，可能会损失精度。
		*/
		
		// 解决编译错误
		long x = 100L;
		switch((int)x) {}
		
		byte b = 10;
		switch(b) {}
		
		short s = 10;
		switch(s) {}
		
		char c = "A";
		switch(c) {}
		
		char cc = 97;
		switch(cc) {}
		
		// 编译报错
		// switch(true){}
		
		String username = "张三";
		switch (username) {}
	}
}
```

#### 循环结构

- for、while、do..while

##### for循环

for循环语法：

```
for(初始化表达式; 布尔表达式; 更新表达式) {
	// 是需要重复执行的代码片段【循环体：由java语句构成】
}
```

##### while循环语句

while循环语句结构：

```
while(布尔表达式) {
	循环体
}
```

while循环执行原理：

```
*true
	- 执行循环体
		*判断布尔表达式的结果：
			*true
				- 执行循环体
					*判断布尔表达式的结果：
						*true
							- 执行循环体
						*false
							- 循环结束
			*false
				- 循环结束
*false
	- 循环结束
```

while循环的循环次数：

> - 0 ~~N 次；
> - 注意：while循环的循环体可能执行0次。

while循环代码如下：

```
/*
	使用while循环输出1-10
*/
public class While02 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10){
			System.out.println(i);
			i++;
		}
		System.out.println("end --->" + i);
		
		System.out.println("--------------------------");
		int j = 10;
		while(j > 0){
			System.out.println(j--); // 10 9 8 7 6 5 4 3 2 1
			System.out.println("--->" + j);
		}
		System.out.println("end j----->" + j);
		
		System.out.println("--------------------------");
		
		int k = 10;
		while(k >= 0) {
			System.out.println(--k); // 9 8 7 6 5 4 3 2 1 0 -1
		}
		System.out.println("end k --->" + k);
	}
}
```

##### do .... while循环：

do ... while循环语法的结构：

```
do {
	循环体;
}while (布尔表达式);
```

do ... while 循环的执行原理：

do .... while 循环的执行次数：

> - do ... while 循环的循环体代码片段执行次数是：1 - N次【至少一次】

使用 do ..... while 循环的注意事项：

> - do ... while 循环语句最终有一个 “ ; ” 别丢了。 

````
public class While03 {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
		}while(i > 100);
		System.out.println("i ---->" + i);
		
		int a = 1;
		do{
			System.out.println(a); // 1 2 3 4 5 6 7 8 9 10
			a ++;
		}while(a <= 10);
	}
}
````

#### 控制循环语句

- break、continue

##### break

- break是java语言当中的关键字，被翻译为“中断/折腾”
- break + “;” ，可以成为一个单独的挖完整的java语句：break；
- break语句使用在switch语句当中，用来终止switch的语句执行；
- break同样可以使用在循环语句当中，用来终止循环执行；
- break终止哪个循环呢？
- break；语句使用在for,while,do...while循环语句当中用来跳出循环，终止循环的执行。因为当程序循环到某个条件的时候，后续的循环没必要执行了，在执行也是耗费资源，所以可以终止循环，这样可以提高程序的执行效率。
- 在默认情况下break终止的是离他最近的循环语句。当然也可以指定终止某个循环。需要给循环起名，采用这种语法，break 循环名称。

综上述代码如下：

```
public class Break01{
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			if(i == 5){
				break; // 终止的是当前的for循环
			}
			System.out.println("i ------>" + i); // 0 1 2 3 4
		}
		
		// 这里的程序与for循环无关
		System.out.println("Hello world");
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 10; i++){
				if(i == 5){
					break;  // 当前break语句终止的是内层for循环，因为这个for离它最近。
							// 这里break语句不会影响到外层for循环。
				}
				System.out.println("i--->" + i);
			}
		}
		
		
		// 给for循环起名字for1
		for1:for(int j = 0; j < 3; j++) {
			// 给for2循环起名for2
			for2:for(int i = 0; i < 10; i++){
				if(i == 5){
					break for1;
				}
				System.out.println("i--->" + i);
			}
		}
	}
}
```

##### continue

- continue表示：继续/ go on 下一个。
- continue也是一个continue关键字加一个分号构成一个单独的完整的java语句，主要出现循环语句当中用来控制循环的执行。

break 和 continue的区别：

> - break表示循环不执行了，跳出循环。
> - continue表示终止当前 "本次" 循环，直接进入下一次循环继续执行。

continue也有这样的语法：

> - continue 循环名称;

综上述代码如下：

```java
public class Continue01 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i-----" + i); // 0 1 2 3 4
		}
		System.out.println("Hello World");
		
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				continue; // 只要这个语句执行，当前本次循环停止，直接进入下一次循环 “继续” 执行
			}
			System.out.println("i-----" + i); // 0 1 2 3 4 6 7 8 9 10
		}
		System.out.println("Hello World");
		
		myFor:for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				continue myFor; // 只要这个语句执行，当前本次循环停止，直接进入下一次循环 “继续” 执行
			}
			System.out.println("i-----" + i); // 0 1 2 3 4 6 7 8 9 10
		}
		System.out.println("Hello World");
	}
}
```

## 三、方法

#### 什么是方法

##### 方法的本质是什么

> - 方法就是一段代码片段，并且这段代码片段可以完成某个特定的功能，并且可以被重复的使用。
> - 方法对应的英语单词：Method
> - 方法在C 语言中叫做函数/Function
> - 方法定义在类体当中，在一个类当中可以定义多个方法，方法编写的位置没有先后顺序，可以随意。
> - 方法体当中不能在定义方法。
> - 方法体由java语句构成，方法体当中的代码遵守自上而下的顺序依次执行。

#### 方法的基础语法

方法怎么定义，语法结构：

```
[修饰符列表]  返回值类型  方法名  (形式参数列表) {
	方法体;
}
```

对以上的语法结构进行解释说明：

```
关于修饰符列表
	* 可选项，不是必须的。
	* 目前统一写成：public static
	* 方法的修饰符列表当中 “有static关键字”的话，怎么调用这个方法？
    	- 类名.方法名（实际参数列表）;
返回值类型：
	* 什么是返回值？
		- 一个方法是可以完成某个特定功能的，这个功能结束之后大多数都是需要返回最终的执行结果，执行结果可能是一个具体存在的数据。		而这个具体存在的数据就是返回值。
	* 返回值类型：
		返回值类型是一个具体存在的数据，数据都是有类型的，此处需要指定的是返回值的具体类型。
	* 返回值类型都可以指定哪些类型呢？
		- java任意一种类型都可以，包括基本数据类型和所有的引用数据类型。
	* 也可能这个方法执行结束之后不返回任何数据，java中规定，当一个方法执行结束之后不返回任何数据的话，返回类型位置必须编写：		void关键字。
	* 返回值类型可以是：
		byte,short,int,long,float,double,boolean,char,String,void.....
		
	* 返回值类型若不是void，表示这个方法执行结束之后必须返回一个具体的数值。当方法执行结束的时候没有返回任何数据的话编译器报错。		怎么返回值呢，代码怎么写呢？“return 值;”，并且要求“值” 的数据类型必须和 “方法的返回值类型” 一致。不然编译器报错。
	
	* 返回值类型是void的时候，在方法体当中不能编写“return值;“，这样的语句。但是要注意可以编写 “return;”这样的语句。
	
	* 只要带有return关键字的语句执行，return语句所在的方法结束。【不是JVM结束，是所在的方法结束】
```

方法名：

> - 只要是合法的标识符就行；
> - 方法名最好见名之意；
> - 方法名最好是动词；
> - 方法名首字母要求小写，后面每个单词首字母大写。

##### 形式参数列表：简称形参

> - 形参是局部变量：int a; int b; float s; .....
> - 形参的个数可以是：0-N个；
> - 多个形参之间用 “逗号” 隔开；
> - 形参中起决定性作用的是形参的数据类型，形参的名字就是局部变量的名字。
> - 方法在调用的时候，实际给这个方法传递的真实数据被称为：实际参数；简称实参；
> - 实参列表和形参列表必须满足：
>   - 数量相同
>   - 类型对应相同

例如：方法定义

```
public static int sum(int 变量名, int 合法的标识符就行)
public static int sum(int a,int b) { // int a, int b 是形参列表

}
方法调用：
	sum("abc","dexc"); 编译报错报错。
	sum(10,20); 编译器通过 (10,20) 是实参列表；
```

方法体：

> - 方法体必须由大括号括起来，方法体当中的代码有顺序，遵循自上而下的顺序执行。并且方法体由java语句构成，每一个java语句以 “ ; ”  号结尾；

方法怎么调用？

> - 方法只定义不去调用是不会执行的，只有在调用的时候才会执行。
> - 语法规则：《方法名修饰符列表当中有static》
>   - 类名.方法名(实参列表)；<这是一条java语句，表示调用某个类的某个方法，传递这样的实参。>

综上述方法的案例：

```java
// 方法在调用的时候实参和形参要求个数对应相同，数据类型对应相同。
// 类型不同的时候要求能够进行相应的自动类型转换。
public class Method05 {
    public static void main(String[] args) {
        // 编译报错，参数数量不同。
        // Method05.sum();

        // 编译错误：实参和形参的类型不是对应相同的。
        // Method05.sum(true, false);

        // 可以
        Method05.sum(10L, 20L);

        // 存在类型转换，int--> long
        // Method05.SUM(10, 20);

        // 编译错误：参数类型不是对应相同的
        // Method05.sum(3.0, 20);
    
        // 可以
        Method05.sum((long)3.0, 10);
    }
    public static void sum(long a, long b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
```

```java
/*
	方法的返回值类型不是void的时候。
		1. 返回值类型不是void的时候：
			要求方法必须保证百分百的执行 “return 值”; 这样的语句来完成值的返回。
			没有这个语句编译器会报错。
		2. 一个方法有返回值的时候，当我们调用这个方法的时候，方法返回了一个值，对于调用者来说，这个返回值可以选择接收，也可以选择不接收。
		  但是大部分情况下我们都是选择接收的。
		
*/
public class Method07 {
	public static void main(String[] args) {
		divde(10, 20); // 这里没有接收这个方法的返回数据。
		
		// 这里接收一下方法执行结束之后的返回值
		// 采用变量接收
		// 变量的数据类型需要和返回值的数据类型相同，或者可以自动类型转换。
		// boolean b = divde(10, 3); // 编译报错，类型不兼容
		
		int i = divde(10, 3); // 赋值运算符的右边先执行，将执行结果赋值给左边的变量。
		System.out.println(i);
		
		long x = divde(10, 2);
		System.out.println(x);
		
		System.out.println(divde(10, 2));
	}
	/*
		需求：
			请定义并实现一个方法，该方法可以计算两个int类型数据的商，要求将最终的计算结果返回给调用者。
	*/
	// 编译报错：缺少返回语句
	/*
	public static int divde(int a, int b) {
		
	}
	*/
	
	// 编译错误：缺少返回值
	/*
	public static int divde(int a, int b) {
		return;
	}
	*/
	
	// 编译错误：方法定义的时候要求返回一个int类型，此时返回布尔类型，类型不兼容
	/*
	public static int divde(int a, int b) {
		return true;
	}
	*/
	
	// 可以：但是具体的方法体中编写的代码无法满足当前的需求。
	/*
	public static int divde(int a, int b) {
		return 1;
	}
	*/
	
	/*
	public static int divde(int a, int b) {
		int c = a/b;
		return c;
	}
	*/
	
	public static int divde(int a, int b) {
		// System.out.println("hello!");
		return a / b;
	}
}
```

深入理解return语句

```java
/**
    深入理解return语句
        * 带有return关键字的java语句只要执行，所在的方法执行结束。
        * 在“同一个作用域”当中，return语句下面不能编写任何代码，因为这些代码永远都执行不到。所以编译报错
 */

 public class Method08 {
     public static void main(String[] args) {
        int retValue = m();
        System.out.println(retValue);
     }

     // 编译报错，缺少返回语句，以下程序编译器认为无法百分百保证 “return 1;” 会执行。
     /*
     public static int m() {
         int a = 10;
         if (a > 3) {
             return 1;
         }
     }
     */

     // 以下程序可以保证 “return 1 或 return 0” 执行，编译通过。
     /*
    public static int m() {
        int a = 10;
        if (a > 3) {
            return 1;
        }else {
            return 0;
        }
    }
    */

    // 可以执行，和以上方法完全相同
    /*
    public static int m() {
        int a = 10;
        if (a > 3) {
            return 1;
        }
        return 0;
    }
    */

    /*
    public static int m() {
        int a = 10;
        if (a > 3) {
            return 1;
            // 这里不能编写代码，编译错误，因为无法访问的语句。
            System.out.println("Hello");
        }
        // 这里的代码可以执行到
        System.out.println("Hello1");
        return 0;
        // 编译错误，无法访问的语句
        // System.out.println("Hello2");
    }
    */
    public static int m() {
    //   return 10 > 3 ? 1 : 0;
    return 2 > 3 ? 1 : 0;
    }
 }
```

##### 方法在执行过程中，在JVM的内存是如何分配的呢？内存是如何变化的？

> - 方法只定义，不调用，是不会执行的，并且在JVM中也不会给该方法分配 “运行所属” 的内存空间。只有在调用这个方法的时候，才会动态的给这个方法分配所属的内存空间。

在JVM内存划分上有这样三块主要的内存空间（当然除了这三块之外还有其他的内存空间）

> - 方法区内存
> - 堆内存
> -  栈内存

关于栈数据结构：

> - 栈：stack, 是一种数据结构
> - 数据结构反应的是数据的存储形态。
> -  数据结构是独立的学科，不属于任何编程语言的范畴，只不过在大多数编程语言当中要使用数据结构。
> -  作为程序员需要提前精通：数据结构 + 算法 【计算机专业必修一门课程】

```
因为java有一套庞大的类库支撑，别人写好了，直接用。【javaSE当中的集合章节中使用了大量的数据结构】
	常见的数据结构：
    	- 数组
   		- 队列
    	- 栈
    	- 二叉树
    	- 哈希表/散列表
```

方法执行的时候代码片段存在哪里？方法执行的时候执行过程的内存在哪里分配？

> - 方法代码片段属于 .class 字节码文件的一部分，字节码文件在类加载的时候，将其放到了方法区当中。所以JVM的三块主要的内存空间中方法区内存最先有数据，存放了代码片段。
> - 代码片段虽然在方法区内存当中只有一份，但是可以被重复调用。每一次在调用这个方法的时候，需要给该方法分配独立的活动场所，在栈内存中分配。【栈内存中分配方法运行的所属内存空间】

```
方法在调用的瞬间，会给该方法分配独立的内存空间，在栈中分配，此时发生压栈动作。
方法执行结束之后，给该方法分配的内存空间全部释放，此时发生弹栈动作。
压栈：给方法分配内存
弹栈：释放该方法的内存空间
```

> - 局部变量在“方法体” 中声明，局部变量在运行阶段内存在栈中分配。

综上述代码如下：

```java
// 其实javaSE类库中字自带的类，例如：String.class、System.class、这些类的类名也是标识符。只要是类名，就一定是标识符。
// 重点：方法调用的时候，在参数传递的时候，实际上传递的是变量中保存的那个 “值” 传过去了。

public class Method11 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int retValue = sumInt(10 ,20);
		
		System.out.println("retValue = " + retValue);
		
		public static int sumInt(int i, int j) {
			int result = i + j;
			int num = 3;
			int retValue = divde(result, num);
			return retValue;
			
		}
		
		public static int divde(int x, int y) {
			int z = x / y;
			return z;
		}
		
	}
}
/*
	画图依据：
		1. 只要涉及到参数传递的问题，传递的是变量中保存的值。
		2. 画图的时候，必须遵循 “方法自上而下的顺序依次执行”这个原则。
*/
```

方法执行过程，画图分析，内存如何分配

```java
// 分析以下程序的输出结果【画图分析】
// 画图应该这样画：
//	程序执行
public class Method12 {
	public static void main(String[] args) {
		int i = 10;
		method(i);
		System.out.println("main----->" + i); // 10
	}
	public static void method(int i) {
		i++;
		System.out.println("method---->" + i); // 11
	}
}
```

#### 方法的重载机制overload

> - 方法重载又称为：overload

什么时候考虑使用方法重载。

> - 功能相似的时候，尽可能让方法名相同。
> - 但是功能不同的时候，不相似的时候，尽可能让方法名不同。

什么条件满足了之后构成了方法重载。

> - 在同一个类当中，方法名相同。
>
> 参数列表不同：
>
> - 数量不同
> - 顺序不同
> - 类型不同

方法重载和什么有关系，和什么没有关系。

> - 方法重载和方法名 + 参数列表有关系。
> - 方法重载和返回值类型无关。
> - 方法重载和修饰符列表无关。

综上述方法重载例子如下：

```java
public class Overload03 {
    public static void main(String[] args) {
        m1();
        m1(1);
        m2(1.0, 2);
        m2(1, 2.0);
        m3(1);
        m3(1.1);
    }
    // 以下两个方法构成重载
    public static void m1(){}
    public static void m1(int a){}

    // 以下两个方法构成重载
    public static void m2(double a, int b){}
    public static void m2(int a, double b){}

    public static void m3(int x){}
    public static void m3(double x){}

    /*
    编译错误：以下不是方法重载，是方法重复。
        public static void m4(int a, int b) {}
        public static void m4(int a, int b) {}
    */

    /* 编译报错
    public static void x() {}
    public static int x() {
        return 1;
    }
    */

    void y() {}
    public static void y() {}
}
```

## 四、面向对象

#### 4.1 面向过程和面向对象的区别

##### 面向过程

> - 主要关注的点是：实现具体过程，因果关系（集成显卡的开发思路）

优点：

> - 对于业务逻辑比较简单的程序可以达到快速开发，前期投入成本较低。

缺点：

> - 采用面向过程的方式开发很难解决非常复杂的业务逻辑，另外面向过程的方式导致软件元素之间的“耦合度” 非常高，只要其中有一环出现问题，整个系统受到影响。导致最终的软件“扩展力”差。
> - 另外由于没有独立体的概念，所以无法达到组件复用。

##### 面向对象

> - 主要关注的点是：主要关注对象【独立体】能完成哪些功能【独立显卡额开发思路】

优点：

> - 耦合度低，扩展力强。更容易解决现实世界当中更复杂的业务逻辑。组件复用性强。

缺点：

> - 前期的投入成本较高，需要进行独立的抽取，大量的系统分析与设计。

#####  语言特性

> - c语言是纯面向过程的、c++ 半面向对象、java纯面向对象

#### 4.2 面向对象的三大特征

- 封装
- 继承
- 多态

##### 所有面向对象的编程语言都有这么三大特征：

> - 采用面向对象的方式开发一个软件，声明周期当中：【整个生命周期中贯穿使用OO面向对象的方式】

- 面向对象的分析：OOA
- 面向对象的设计：OOD
- 面向对象的编程：OOP

#### 4.3 类和对象的概念

##### 什么是类

> - 类在现实世界当中是不存在的，是一个模板，是一个概念。是人类大脑思考抽象的结果。
> - 类代表了一类事物。
> - 在现实世界当中，对象A与对象B之间具有共同特征，进行抽象总结一个模板，这个模板被称为类。

##### 什么是对象

> - 对象是实际存在的个体，现实世界当中世界存在。

描述一下整个软件的开发过程：

> - 程序员先观察现实世界，从现实世界当中寻找对象。
> - 寻找了N 多个对象之后，发现所有的对象都有共同的特征。
> - 程序员在大脑中形成了一个模板【类】。
> - java程序员可以通过java代码来表述一个类，java程序员中有了类的定义，然后通过类就可以创建对象。
> - 有了对象之后，可以让对象直接协作起来形成一个系统。

类 ---- 【实例化】-> 对象

对象又被称为实例/inctance

对象 --- 【抽象】--->类

重点：

> - 类描述的是对象的共同特征；
> - 共同特征：例如身高特征
> - 这个身高特征在访问的时候必须先创建对象，通过对象去访问这个特征。
> - 因为这个特征具体到某个对象上面以后值不同。有的对象身高1.8，有的对象身高2.8

一个类主要描述什么信息呢？

> - 一个类主要描述的是状态 + 动作。
> - 状态信息：名字、身高、性别、年龄
> - 动作信息：吃、唱歌。跳舞、学习。
> - 状态：一个类的属性；
> - 动作：一个类的方法；

```
类:{
	// 属性：描述对象的状态信息；
	// 方法；描述对象的动作信息；
}
```

> - 注意：状态和动作当具体到某个对象之后，发现最终的结果可能不一样。
> - 对象和对象之间有共同特征，但是具体到对象之后，有数据上的差异。

#### 4.4 类的定义

##### 语法结构

```
[修饰符] class 类名 {
	属性；
	方法；
}

学生类，描述所有学生对象的共同特征：
学生对象有哪些状态信息：
	* 学号【int】
	* 名称【String】
	* 性别【boolean】
	* 年龄【年龄是一个属性、年龄是一个数据、是数据就应该有数据类型】
	* 住址【String】
	.....
	
学生对象有哪些动作：
	* 吃饭
	* 睡觉
	* 学习
	* 玩
	* 唱歌
	* 跳舞

重点：属性通常是采用一个变量的形式来完成定义的。
	int no;
	int age;
	String name;
	String address;
	boolean sex;
	
java 语言包含两种数据类型：
 - 基本数据类型
 	byte、short、int、long、float、double、boolean、char
 - 引用数据类型
 		String.class SUN提供的
 		System.class SUN提供的
 		Student.class 程序员自定义的
 	
 		int age = 10;
 		String username = “张三”;
 		Student s = ???;
```

- java语言中所有的class都属于引用数据类型。 

