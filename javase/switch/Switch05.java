/*
	����ϵͳ���������ɣ����жϸÿ����ĳɼ��ȼ���
	
	1. ��Ч�ɼ���Χ����0-100��
	2. �����ɼ����ܴ���С��
	3. ���Գɼ��͵ȼ�֮��Ķ��չ�ϵ��
		[90-100]	A
		[80-90]		B
		[70-80]		C
		[60-70]		D
		[0-60]		E
	4. ��������������switch�����ɣ����ܲ���if��
	
	���ţ�(int)(�ɼ� / 10)
		0 
		1
		2
		3
		4
		5
		6
		7 70.5/10 = 7.5 ת����int ���7
		8
		9
		10
*/
public class Switch05 {
	public static void main(String[] args) {
		// �����ɼ�
		//double score = 90;
		double score = 70.2;
		// ת����int
		int grade = (int)(score / 10);
		switch(grade) {
			case 9 : case 10 :
				System.out.println("A");
				break;
			case 8 : 
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default :
				System.out.println("E");
			
		}
	}
}