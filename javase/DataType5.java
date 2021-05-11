/*
	关于八种基本数据类型的默认值
*/

public class DataType05{
	
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