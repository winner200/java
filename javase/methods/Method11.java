// ��ʵjavaSE��������Դ����࣬���磺String.class��System.class����Щ�������Ҳ�Ǳ�ʶ����ֻҪ����������һ���Ǳ�ʶ����
// �ص㣺�������õ�ʱ���ڲ������ݵ�ʱ��ʵ���ϴ��ݵ��Ǳ����б�����Ǹ� ��ֵ�� ����ȥ�ˡ�

public class Method11 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int retValue = sumInt(10 ,20);
		
		System.out.println("retValue = " + retValue);
		
		public static int sumInt(int i, int j) {
			int result = i + j;
			int num = 3;
			int retValue = divde(result, num);
			return retValue;
			
		}
		
		public static int divde(int x, int y) {
			int z = x / y;
			return z;
		}
		
	}
}
/*
	��ͼ���ݣ�
		1. ֻҪ�漰���������ݵ����⣬���ݵ��Ǳ����б����ֵ��
		2. ��ͼ��ʱ�򣬱�����ѭ ���������϶��µ�˳������ִ�С����ԭ��
*/