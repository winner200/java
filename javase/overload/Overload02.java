/*
	�ó�����һ�������������һ�·������ص��ŵ�
		* ����Ա���÷�����ʱ�򣬱ȽϷ��㣬��Ȼ���õ��ǲ�ͬ�ķ��������Ǿ͸о���ʹ��һ������һ����
		��Ҫ�������ķ�������
		* ��������
	ǰ�᣺
		�������Ƶ�ʱ�򣬷�����������ͬ��
		���ܲ�ͬ��ʱ�򣬾����������������������ֲ�ͬ��
*/
public class Overload02 {
	public static void main(String[] args) {
		// ���������Ͳ�ͬ����Ӧ���õķ�����ͬ����ʱ���ַ������������������ˡ���������ʵ�β������������͡�
		System.out.println(sum(1, 2));
		System.out.println(sum(1.0, 2.0));
		System.out.println(sum(1L, 2L));
	}
	
	// �����������������˷������ػ���
	public static int sum(int a, int b) {
		System.out.println("sum(int, int)");
		return a + b;
	}
	public static long sum(long a, long b) {
		System.out.println("sum(long, long)");
		return a + b;
	}
	public static double sum(double a, double b) {
		System.out.println("sum(double, double)");
		return a + b;
	}
	
}