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