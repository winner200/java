
/*
	����
		����ϵͳ����һ���˵����䣨����˵�������Ҫ�Ӽ������룩��
		�����������ж�����˴����������ĸ��׶Ρ����������[0-150]
		
		[0-5] �׶�
		[6-10] �ٶ�
		[11-18] ������
		[19-35] ����
		[35-55] ����
		[56-150] ����
*/

public class IfTest01 {
	public static void main(String[] args) {
		// ���ռ������룺���䡾�����ʱ������������֡�
		java.util.Scanner s = new java.util.Scanner(System.in);
		//System.out.println("�������������䣺");
		System.out.print("�������������䣺"); // �����ʾ��Ϣ����Ȼ�û�������֪������Ҫ���
		int age = s.nextInt(); // ͣ�����ȵ��û������룬������Զ����գ���ֵ��age������
		System.out.println("age = " + age);
		
		// �����������ҵ���߼��ж�
		String persionMsg = "�׶�";
		if(age < 0 || age > 150) {
			persionMsg = "���ṩ�����䲻�Ϸ�������ֻ��Ҫ��[0-150]֮��";
		}else if(age <= 5) {
			persionMsg = "�׶�";
		}else if(age > 5 && age <= 10) {
			persionMsg = "�ٶ�";
		}else if (age > 10 && age <= 18) {
			persionMsg = "������";
		}else if (age > 18 && age <= 35) {
			persionMsg = "����";
		}else if (age > 35 && age <= 55) {
			persionMsg = "����";
		}else if (age > 55 && age <= 150) {
			persionMsg = "����";
		}
		System.out.println(persionMsg);
	}
	
}