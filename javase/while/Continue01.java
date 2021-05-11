public class Continue01 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i-----" + i); // 0 1 2 3 4
		}
		System.out.println("Hello World");
		
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				continue; // 只要这个语句执行，当前本次循环停止，直接进入下一次循环 “继续” 执行
			}
			System.out.println("i-----" + i); // 0 1 2 3 4 6 7 8 9 10
		}
		System.out.println("Hello World");
		
		myFor:for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				continue myFor; // 只要这个语句执行，当前本次循环停止，直接进入下一次循环 “继续” 执行
			}
			System.out.println("i-----" + i); // 0 1 2 3 4 6 7 8 9 10
		}
		System.out.println("Hello World");
	}
}