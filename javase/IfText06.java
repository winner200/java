public class IfText06 {
	public static void main(String[] args) {
		boolean sex = true;
		
		if(sex) {
			System.out.println("��");
		}else {
			System.out.println("Ů");
		}
		
		sex = false;
		if(sex) System.out.println("��"); else System.out.println("Ů");
		
		// -------------------------------------------------------------------
		if(sex)
			System.out.println("��");
			System.out.println("�Ǻ�");
		else 
			System.out.println("Ů");
		
		// ���ϳ����б�����������18�У�18������û���﷨����
	}
}