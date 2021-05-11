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

/*
	十进制：0 1 2 3 4 5 6 7 8 9 10 11 12.....
	二进制：0 1 10 11 100 101 1000 10001 .....
	十六进制：0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20....
	八进制：0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
*/






























