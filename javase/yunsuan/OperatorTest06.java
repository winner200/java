public class OperatorTest06 {
	public static void main(String[] args) {
		// ������󣬲���һ��������java���
		// 10;
		
		// ������󣺲���һ��������java���
		// '��'
		
		// �������͵ı���
		boolean sex = false;
		
		// �������³����Ƿ���Ա���ͨ����
		// ���뱨����Ϊ������һ��������java��䡣
		// sex ? '��' : 'Ů';
		
		char c = sex ? '��' : 'Ů';
		System.out.println(c);
		
		sex = true;
		c = (sex ? '��' : 'Ů');
		System.out.println(c);
		
		// �﷨���󣬱��뱨�����������String��Ҳ������char������ǰ�߲�����char���������ݡ�
		// ���Ͳ�����
		//char c1 = sex ? "��" : 'Ů';
		
		// ����������Ͳ����ݣ���Ϊ���﷨���⡣���ʽ������ִ�гɹ�
		// sex = false;
		// char c1 = sex ? "��" : 'Ů';
		
		System.out.println(10);
		System.out.println("10");
		System.out.println('1');
		
		// ����
		System.out.println(sex ? '��' : 'Ů');
		
	}
}