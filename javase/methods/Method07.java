/*
	�����ķ���ֵ���Ͳ���void��ʱ��
		1. ����ֵ���Ͳ���void��ʱ��
			Ҫ�󷽷����뱣֤�ٷְٵ�ִ�� ��return ֵ��; ��������������ֵ�ķ��ء�
			û��������������ᱨ��
		2. һ�������з���ֵ��ʱ�򣬵����ǵ������������ʱ�򣬷���������һ��ֵ�����ڵ�������˵���������ֵ����ѡ����գ�Ҳ����ѡ�񲻽��ա�
		  ���Ǵ󲿷���������Ƕ���ѡ����յġ�
		
*/
public class Method07 {
	public static void main(String[] args) {
		divde(10, 20); // ����û�н�����������ķ������ݡ�
		
		// �������һ�·���ִ�н���֮��ķ���ֵ
		// ���ñ�������
		// ����������������Ҫ�ͷ���ֵ������������ͬ�����߿����Զ�����ת����
		// boolean b = divde(10, 3); // ���뱨�����Ͳ�����
		
		int i = divde(10, 3); // ��ֵ��������ұ���ִ�У���ִ�н����ֵ����ߵı�����
		System.out.println(i);
		
		long x = divde(10, 2);
		System.out.println(x);
		
		System.out.println(divde(10, 2));
	}
	/*
		����
			�붨�岢ʵ��һ���������÷������Լ�������int�������ݵ��̣�Ҫ�����յļ��������ظ������ߡ�
	*/
	// ���뱨��ȱ�ٷ������
	/*
	public static int divde(int a, int b) {
		
	}
	*/
	
	// �������ȱ�ٷ���ֵ
	/*
	public static int divde(int a, int b) {
		return;
	}
	*/
	
	// ������󣺷��������ʱ��Ҫ�󷵻�һ��int���ͣ���ʱ���ز������ͣ����Ͳ�����
	/*
	public static int divde(int a, int b) {
		return true;
	}
	*/
	
	// ���ԣ����Ǿ���ķ������б�д�Ĵ����޷����㵱ǰ������
	/*
	public static int divde(int a, int b) {
		return 1;
	}
	*/
	
	/*
	public static int divde(int a, int b) {
		int c = a/b;
		return c;
	}
	*/
	
	public static int divde(int a, int b) {
		// System.out.println("hello!");
		return a / b;
	}
}