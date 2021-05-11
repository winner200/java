public class Break01{
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			if(i == 5){
				break; // 终止的是当前的for循环
			}
			System.out.println("i ------>" + i); // 0 1 2 3 4
		}
		
		// 这里的程序与for循环无关
		System.out.println("Hello world");
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 10; i++){
				if(i == 5){
					break;  // 当前break语句终止的是内层for循环，因为这个for离它最近。
							// 这里break语句不会影响到外层for循环。
				}
				System.out.println("i--->" + i);
			}
		}
		
		
		// 给for循环起名字for1
		for1:for(int j = 0; j < 3; j++) {
			// 给for2循环起名for2
			for2:for(int i = 0; i < 10; i++){
				if(i == 5){
					break for1;
				}
				System.out.println("i--->" + i);
			}
		}
	}
}