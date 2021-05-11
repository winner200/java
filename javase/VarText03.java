public class VarText03 {
	
	// 注意：这里的static不要去掉
	static int k = 90;
	public static void main(String[] args) {
		
		// 变量i的作用域是main方法。
		// 在整个main方法当中是有效的，可见的，可以访问的。
		int i = 100;
		
		System.out.println(i); // 可以
		System.out.println(k); // 可以
		
		for(int a = 0; a < 10; a++) { // a变量的作用域在整个for循环，for循环结束之后，a变量的内存就释放了。
			
		}
		// 这里无法访问a变量
		// System.out.println(a); 
		
		int j; // 作用域是main方法
		for(j = 0; j < 10; j++){
			j = i;
		}
		System.out.println("我是" + j); // 访问的是main方法中的j变量
	}
	public static void doSome() {
		// 这里无法访问main方法当中的变量i
		// 已经出了i变量的作用域。
		//System.out.println(i); // 不可以
		
		System.out.println(k); // 可以
	}
}