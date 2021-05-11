public class Method02 {
	public static void main(String[] args) {
		// 计算两个int类型数据
		Method02.sunInt(10,20);
	}
	
	// 单独定义一个方法
	// 该方法完成计算两个int类型数据的和，并且将结果输出
	
	public static void sunInt(int a,int b) {
		int c = a + b;
		System.out.println(a + " + " + b + " + " + " = " + c);
	}
}