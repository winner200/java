public class ForText03 {
	/*
		��ǰһ������Ļ����ϣ�����1~100���������ĺ�
		1 + 3 + 5 + 7 + 9..... + 99;
		
		����� += ����ר�����׷�ӵġ�
	*/
	public static void main(String[] args) {
		// ����һ�����������ӡ�����ʼ��ֵΪ0
		int sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			// iһ�����������ۼ���͡�
			// System.out.println("i----->" + i);
			
			// sun�洢����������͵Ľ����
			// ����ÿһ��ִ�е����������ͽ�����㡣
			// ����sum�������ܷ��������Ϊ������ѭ���塣
			// int sum = 0;
			
			sum += i;
			
			// ������ŵ������ʾÿѭ��һ�������һ������
			// System.out.println("sum = " + sum);
		}
		// ����ʱforѭ������֮�����������͵Ľ��
		System.out.println(sum);
	}
}