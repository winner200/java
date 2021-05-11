/*
	实现计算器当中的
	 +、-、*、/、%
	 
	 实现思路：
		1. 选择所有数据从键盘输入
		2. 使用switch语句进行判断
		3. 需要从控制台输入三次：
			* 第一个数字
			* 运算符
			* 第二个数字
	最终在控制台是这样的一个场景：
		欢迎使用简单的计算器系统：
			请输入第一个数字：10
			请输入运算符：+
			请输入第二个数字：20
			运算结果：10 + 20 = 30
*/
public class Switch04 {
	public static void main(String[] args) {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单的计算机系统");
		// 接收第一个数字
		System.out.print("请输入第一个数字：");
		int num1 = Scanner.nextInt();
		//System.out.println(num1);
		// 接收运算符
		System.out.print("请输入运算符：");
		String character = Scanner.next();
		System.out.println(character);
		// 接收第二个数字
		System.out.print("请输入第二个数字：");
		int num2 = Scanner.nextInt();
		//System.out.println(num1);
		
		// 接收运算结果
		int result = 0;
		switch(character) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
		}
		System.out.println("运算结果为：" + num1 + character + num2 + " = " + result);
	}
}