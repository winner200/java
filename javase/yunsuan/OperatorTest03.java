public class OperatorTest03 {
	public static void main(String[] args) {
		// ��������ȼ���ȷ������С����
		System.out.println(5 > 3 & 5 > 2); // true
		System.out.println(5 > 3 & 5 > 6); // false
		System.out.println(5 > 3 | 5 > 6); // true
		
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		System.out.println(true | false); // true
		System.out.println(false | false); // false
		
		System.out.println(!false); // true
		System.out.println(!true); // false
		
		System.out.println(true ^ false); // true
		System.out.println(false ^ false); // false
		System.out.println(true ^ true); // false
		
		// �߼���Ͷ�·��
		//int x = 10;
		//int y= 8;
		// �߼���
		//System.out.println(x < y & ++x < y);
		//System.out.println(x); // 11
		
		// �߼���Ͷ�·��
		int x = 10;
		int y= 8;
		// ��·��
		// x < y�����false���������ʽ����Ѿ�ȷ����false�����Ժ���ı��ʽû����ִ�У��������󱻳�Ϊ��·����
		// ��·����Ż��ж�·�����߼����ǲ�����ڶ�·����ġ�
		System.out.println(x < y && ++x < y); 
		System.out.println(x); // 10
	}
}