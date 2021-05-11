public class ForText03 {
	/*
		在前一个程序的基础上，计算1~100所有奇数的和
		1 + 3 + 5 + 7 + 9..... + 99;
		
		运算符 += 就是专门完成追加的。
	*/
	public static void main(String[] args) {
		// 定义一个变量【盒子】，初始化值为0
		int sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			// i一定是奇数，累加求和。
			// System.out.println("i----->" + i);
			
			// sun存储的是最终求和的结果。
			// 不能每一次执行到这里，都把求和结果归零。
			// 定义sum变量不能放在这里，因为这里是循环体。
			// int sum = 0;
			
			sum += i;
			
			// 输出语句放到这里表示每循环一次则输出一个数据
			// System.out.println("sum = " + sum);
		}
		// 以上时for循环结束之后，最终输出求和的结果
		System.out.println(sum);
	}
}