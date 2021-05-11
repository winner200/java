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