public class OOTest03 {
	public static void main(String[] args) {
		
		// u������
		// u�Ǿֲ�����
		User u = new User();
		
		// ��һ���汾����д��
		// u.addr = new Address();
		
		Address a = new Address();
		u.addr = a;
		
		System.out.println(u.addr.city);
		
		a.city = "���";
		
		System.out.println(u.addr.city);
	}
}