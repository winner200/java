public class DataType06 {
	public static void main(String[] args) {
		// ��ͨ��n�ַ�
		char c1 = 'n';
		System.out.println(c1);
		
		// ����Ŀǰ��ѧ֪ʶ�����³����޷�����ͨ������Ϊ��Ȼ��һ���ַ���������ʹ�õ�������������
		// ���Ǿ������룬���ֱ���ͨ���ˣ���˵�����²�����һ���ַ��������� ��һ���� �ַ���
		// ��б����java�����е��о���ת�幦�ܡ�
		// \nΪ���з� 
		char c2 = '\n';
		
		/*
		System.out.println("Hello");
		System.out.println("World");
		*/
		
		// System.out.println() �� System.out.print() ����
		// println���֮���У�print��ʾ��������ǲ����С�
		// System.out.print("Hello");
		// System.out.println("world");
		
		System.out.print("A");
		System.out.print(c2);
		System.out.println("B");
		
		// ��ͨ��t�ַ�
		char x = 't';
		System.out.println(x);
		
		// �Ʊ��tab
		// ǿ�����Ʊ���Ϳո�ͬ�����ǵ�ASCII��һ���������ڼ�����������ͬ�İ�����
		char y = '\t';
		System.out.print("A");
		System.out.print(y);
		System.out.println("B");
		
		// Ҫ���ڿ���̨����� ����б���ַ���
		// ��б�ܽ�����ĵ�����ת��ɲ��߱����⺬�����ͨ�������ַ�����ߵĵ�����ȱ���˽����������ַ������뱨��
		
		/*
		char k = '\';
		System.out.println(k);
		*/
		
		/*
			\\ 
			���ͣ���һ����б�ܾ���ת�幦�ܣ�������ķ�б��ת��Ϊ��ͨ�ķ�б���ַ���
			���ۣ���java����������б�ܴ���һ����ͨ�ķ�б���ַ���
		*/
		char k = '\\';
		System.out.println(k);
		
		// �ڿ���̨���һ����ͨ�ĵ������ַ�
		// char a = ''; // java�в�����������д���򣬱��뱨��
		// System.out.println(a);
		
		// ���±��뱨����һ�������ź͵ڶ�����������Զ������ĵ������Ҳ�����һ�����
		// char a = ''';
		// System.out.println(a);
		
		// ��б�ܾ���ת�幦�ܣ����ڶ���������ת������ͨ�ĵ������ַ�
		// ��һ�������ź����������Զ���
		char a = '\'';
		System.out.println(a);
		
		char f = '"';
		System.out.println(f);
		
		System.out.println("Hello world");
		System.out.println("��Hello world��");
		System.out.println("\"Hello world\"");
		
		char m = '��';
		System.out.println(m);
		
		// JDK���Դ���native2ascii.exe������Խ�����ת����unicode������ʽ
		// ��ôʹ����������أ�
		// �����������룺native2ascii �س� Ȼ���������� �س� ���ɵõ�unicode����
		char n = '\u4e2d'; // '��' ��Ӧ��unicode������ 4e2d
		System.out.println(n);

		// �������
		//char g = '4e2d';
		// �������
		//char g = 'u4e2d';
		// ͨ����б��u�������������һ��������ĳ�����ֵ�unicode����
		char g = '\u4e2d';

		/*
		char���͵�Ĭ��ֵ
		char c10 = '\u0000';
		System.out.println(c10);
		*/

	}
}

/*
	ʮ���ƣ�0 1 2 3 4 5 6 7 8 9 10 11 12.....
	�����ƣ�0 1 10 11 100 101 1000 10001 .....
	ʮ�����ƣ�0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20....
	�˽��ƣ�0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
*/






























