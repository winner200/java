/*
	����
		�жϵ�ǰ��������
			�����������ʱ��
				����ɡ��
					�ж��Ա�
						���Ա�Ϊ�У���һ�Ѵ��ɡ
						���Ա�ΪŮ����һ��С��ɡ
			�������������ʱ��
				�ж��������¶ȣ�
					�������¶���30�����ϣ�
						���Ա�Ϊ�У�����ɫī��
						���Ա�ΪŮ������ɹ˪
		����״����1��ʾ���ꡢ0��ʾ����
		�Ա�1��ʾ�С�0��ʾŮ
*/
public class IfText05 {
	public static void main(String[] args) {
		// ���ռ������룺�����ʱ�����Ϊ�ַ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ñ�ϵͳ����ͨ����ϵͳ�������һЩ�򵥵��ж�");
		System.out.println("˵��1��1��ʾ���꣬0��ʾ����");
		System.out.println("˵��2:1��ʾ�У�0��ʾŮ");
		System.out.println("˵��3���¶�Ϊ����");
		
		// �����������
		System.out.print("�����뵱ǰ����״����");
		int weather = s.nextInt();
		
		// �����Ա�
		System.out.print("�������Ա�");
		int sex = s.nextInt();
		System.out.println("��ǰ�Ա�Ϊ��" + weather);
		if(weather == 1) {
			// ������
			//System.out.print("�������Ա�" + sex==1 ? + "��");
			System.out.println("�����Ա�Ϊ��" + sex);
			if(sex == 1) {
				System.out.println("��һ�Ѵ��ɡ");
			}else if(sex == 0) {
				System.out.println("��һ��С��ɡ");
			}else {
				System.out.println("�Բ��������Ա�����ô���£�");
			}
		}else if(weather == 0) {
			// ����
			// �����¶�
			System.out.print("�����뵱ǰ�������¶ȣ�");
			int tem = s.nextInt();
			if(tem > 30) {
				if(sex == 1) {
				System.out.println("����ɫī��");
				}else if(sex == 0) {
					System.out.println("����ɹ˪");
				}else {
					System.out.println("�Բ��������Ա�����ô���£�");
				}
			}
			
		}else {
			System.out.println("�Բ����������������������ڣ�");
		}
	}
}