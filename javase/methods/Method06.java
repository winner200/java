/*
	�������ã�
		1. ���������η��б�����static�ؼ��֣������ĵ��÷�ʽ�ǣ�����.������(ʵ���б�);
		2. �����е�ʱ�� ������.�� ����ʡ�ԣ�ʲô����¿���ʡ���أ�
			m1() {
				m2();
			}
			m1������m2������ͬһ�����嵱�е�ʱ�򣬡�����.�� ����ʡ�Բ�д��
		3. ������javaԴ�ļ����У�ֻ����һ��class���Ƚ�����������ֻ��Ϊ�˽��εķ��㡣����javaԴ�ļ����б�д�˶��class�����ַ�ʽ��Ҫģ�¡�
*/

public class Method06 {
	public static void main(String[] args) {
		// ���÷���
		Method06.m();
		
		// ���ڷ��������η��б�����static�ؼ��ֵģ�������.�� ����ʡ�Բ�д��
		m();
		
		// ���������ࡾ���Ǳ����еķ�����
		A.doOther();
		
		// ʡ�ԡ�����.�� ����
		// ���뱨��������.�� ʡ��֮��Ĭ�ϴӵ�ǰ������ "doOther" �������ڵ�ǰ���и÷��������ڡ�
		// doOther();
	}
	public static void m() {
		System.out.println("m method execute!");
		
		// �����ķ�ʽ
		Method06.m2();
		// ʡ�Եķ�ʽ
		m2();
		
		// ������õ�ǰ�����m2���������ʱ��ͱ�����ӡ�����.�� �ˡ�
		A.m2();
	}
	public static void m2() {
		System.out.println("m2 method execute!");
	}
}

class A {
	public static void doOther() {
		System.out.println("A��s doOther method invoke");
	}
	
	public static void m2() {
		System.out.println("A, m2 doOther method invoke");
	}
}