public class ForText01 {
	public static void main(String[] args) {
		// 以下for循环当中 "i" 变量的作用域仅限于当前for循环内部使用。
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// 这个i变量可以在main方法的作用域当中访问吗？无法访问
		// System.out.println("i----" + i); 编译错误，
		
		
		// 死循环
		/*
		for(;;){
			System.out.println("死循环");
		}
		*/
		
		// main方法作用域当中的i变量，只要main方法没有结束，这里的i就能用。
		int i = 0;
		for(; i < 10; i++) {
			System.out.println("i== " + i);
		}
		System.out.println("======" + i); // 10 
		
		int j = 0;
		for (j = 1; j < 10; j++) {
			System.out.println("j---->" + j);
		}
		System.out.println(j);
		
		// 输出1~10中所有的奇数
		for(int i = 1; i <= 10; i += 2){
			System.out.println("i ---->" + i); // 1 3 5 7 9
		}
		
		// 输出1~10中所有的偶数
		for(int i = 2; i<=10; i += 2){
			System.out.println(i); // 2 4 6 8 10
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i====>" + i); // 10 9 8 7 6 5 4 3 2 1
		}
		
		for(int i = 100; i>= 50; i-=10) {
			System.out.println(i); // 100 90 80 70 60 50
		}
		
		for(int i = 0; i<10;) {
			System.out.println("i====>" + i); // 1 2 3 4 5 6 7 8 9 10
			i++;
		}
	}
}






















