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