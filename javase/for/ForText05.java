public class ForText05 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) { // 循环10次
			System.out.println("Begin");
			for(int j=0; j<1; j++){
				System.out.println("j---->" + j);
			}
			System.out.println("Over");
		}
		
		/*
			结果：
			Begin
			0
			Over
			Begin
			0
			Over
			Begin
			0
			Over
			...10次
		*/
		
		for(int i=1; i<=5; i++){
			System.out.println("开始");
			for(int j=1; j<=5; j++){
				System.out.println(j);
			}
			System.out.println("结束");
		}
		/*
			结果：
				开始
				1
				2
				3
				4
				5结束
				开始
				1
				2
				3
				4
				5结束
				.....5次
		*/
	}
}