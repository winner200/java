public class OperatorTest05 {
	public static void main(String[] args) {
		
		System.out.println(10 + 20); //"30" ����ļӺ������
		System.out.println(10 + 20 + 30); //"60" ����ļӺ�Ҳ�����
		System.out.println(10 + 20 + "30"); //"3030" �������ҵ�˳��һ�μ��㣬��һ���Ӻ�����ͣ��ڶ����Ӻ����ַ������ӡ�
		System.out.println(10 + (20 + "30")); // "102030"
		
		int a = 10;
		int b = 20;
		
		// Ҫ���ڿ���̨�������"10 + 20 = 30"
		System.out.println("10 + 20 = 30");
		
		// Ҫ���Զ�̬�ķ�ʽ�����
		System.out.println("10 + 20 =" + a + b); // 10+ 20 = 1020
		
		System.out.println("10 + 20 =" + (a + b)); // 10 + 20 = 30
		
		System.out.println("a + 20 = " + (a + b));
		
		System.out.println(a + "+" + b + " = " + (a + b));
		
		a = 100;
		b = 200;
		
		System.out.println(a + " + " + b + " = " + (a + b));
		
		// ������������ String
		// String��SUN��javaSE�����ṩ���ַ�������
		// String.class �ֽ����ļ�
		
		// int �ǻ����������ͣ�i�Ǳ�������10��int���͵�����ֵ
		// int i = 10;
		
		// String �������������ͣ�s�Ǳ�����"abc"��String���͵�����ֵ
		// String s = "abc";
		
		// ����������Ͳ�����
		//String ss = 10;
		
		// ����һ��String���͵ı���������username����ֵ "zhangsan"
		String username = "zhangsan";
		System.out.println("��¼�ɹ�����ӭusername������");
		
		System.out.println("��¼�ɹ�����ӭ"+ username +"������");
		
	}
}