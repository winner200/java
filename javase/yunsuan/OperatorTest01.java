public class OperatorTest01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		
		System.out.println(i + j); // 13
		System.out.println(i - j); // 7
		System.out.println(i * j); // 30
		System.out.println(i / j); // 3
		System.out.println(i % j);// 1
		
		// ����++Ϊ����--�������ѧ��
		// ����++��������Լ�1��
		
		int k = 10;
		
		// ++��������Գ����ڱ����ĺ��桾��Ŀ�������
		k ++;
		
		System.out.println(k); // 11
		
		int y = 10; 
		
		// ++��������Գ����ڱ�����ǰ�桾��Ŀ�������
		
		++ y;
		
		System.out.println(y); //11
		
		// С�᣺
		// ++��������Գ����ڱ���ǰ��Ҳ���Գ����ڱ����������Ǳ���ǰ���Ǳ�����ֻҪ++����������ñ����е�ֵһ�����Լ�1
		
		//++ �����ڱ�����
		// ����������ֵ���㣬�ڶԱ����б����ֵ���м�1
		int a = 100;
		int b = a ++;
		System.out.println(a); // 101
		System.out.println(b); // 100

		//++ �����ڱ���ǰ
		// �����Ƚ����Լ�1���㣬Ȼ���ڽ��и�ֵ������
		int m = 20;
		int n = ++m;
		System.out.println(b); // 21
		System.out.println(b); // 21

		int mm = 500;
		System.out.println(mm);

		int e = 100;
		System.out.println(e ++) // 100
		System.out.println(e) // 101

		int s = 100;
		System.out.println(++s) // 101
		System.out.println(s) // 101

		System.out.println("------");
		System.out.println(--s) // 100
		System.out.println(s++) // 100
		System.out.println(s--) // 101
		System.out.println(s--) // 100
		System.out.println(s--) // 99
		System.out.println(s) // 98
	}
}