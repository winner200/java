/*
	ʵ�ּ��������е�
	 +��-��*��/��%
	 
	 ʵ��˼·��
		1. ѡ���������ݴӼ�������
		2. ʹ��switch�������ж�
		3. ��Ҫ�ӿ���̨�������Σ�
			* ��һ������
			* �����
			* �ڶ�������
	�����ڿ���̨��������һ��������
		��ӭʹ�ü򵥵ļ�����ϵͳ��
			�������һ�����֣�10
			�������������+
			������ڶ������֣�20
			��������10 + 20 = 30
*/
public class Switch04 {
	public static void main(String[] args) {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥵ļ����ϵͳ");
		// ���յ�һ������
		System.out.print("�������һ�����֣�");
		int num1 = Scanner.nextInt();
		//System.out.println(num1);
		// ���������
		System.out.print("�������������");
		String character = Scanner.next();
		System.out.println(character);
		// ���յڶ�������
		System.out.print("������ڶ������֣�");
		int num2 = Scanner.nextInt();
		//System.out.println(num1);
		
		// ����������
		int result = 0;
		switch(character) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
		}
		System.out.println("������Ϊ��" + num1 + character + num2 + " = " + result);
	}
}