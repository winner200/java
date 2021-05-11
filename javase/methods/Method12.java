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