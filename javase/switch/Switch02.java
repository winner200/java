/*
	switchȷʵ����̽��String���ͣ�����Java7�������ԡ�
*/

public class Switch02 {
	public static void main(String[] args) {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.print("���������ڼ���");
		String dayofWeek = Scanner.next();
		switch(dayofWeek) {
			case "����һ" : 
				System.out.println(1);
				break;
			case "���ڶ�" :
				System.out.println(2);
				break;
			default :
				System.out.println("�Բ�������������ݷǷ�");
		}
	}
}