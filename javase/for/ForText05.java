public class ForText05 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) { // ѭ��10��
			System.out.println("Begin");
			for(int j=0; j<1; j++){
				System.out.println("j---->" + j);
			}
			System.out.println("Over");
		}
		
		/*
			�����
			Begin
			0
			Over
			Begin
			0
			Over
			Begin
			0
			Over
			...10��
		*/
		
		for(int i=1; i<=5; i++){
			System.out.println("��ʼ");
			for(int j=1; j<=5; j++){
				System.out.println(j);
			}
			System.out.println("����");
		}
		/*
			�����
				��ʼ
				1
				2
				3
				4
				5����
				��ʼ
				1
				2
				3
				4
				5����
				.....5��
		*/
	}
}