public class ForText01 {
	public static void main(String[] args) {
		// ����forѭ������ "i" ����������������ڵ�ǰforѭ���ڲ�ʹ�á�
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// ���i����������main�������������з������޷�����
		// System.out.println("i----" + i); �������
		
		
		// ��ѭ��
		/*
		for(;;){
			System.out.println("��ѭ��");
		}
		*/
		
		// main�����������е�i������ֻҪmain����û�н����������i�����á�
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
		
		// ���1~10�����е�����
		for(int i = 1; i <= 10; i += 2){
			System.out.println("i ---->" + i); // 1 3 5 7 9
		}
		
		// ���1~10�����е�ż��
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






















