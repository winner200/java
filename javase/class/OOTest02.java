public class OOTest02 {
	public static void main(String[] args) {
		
		// ����user����
		// u�Ǿֲ�����
		// u��һ������
		// u�����ڴ��ַָ����ڴ��User����
		User u = new User();
		
		// ���User�����ڲ�ʵ��������ֵ
		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.addr);
		
		// �޸�User�����ڲ�ʵ��������ֵ
		u.no = 110;
		u.name = "jack"; // "jack"��һ��java��������String����
		u.addr = new Address();
		
		// ��main��������Ŀǰֻ�ܿ���һ������ ��u��;
		// һ�ж���ֻ��ͨ��u�����ʡ�
		System.out.println(u.name + "��ס���ĸ����У�" + u.addr.city);
		System.out.println(u.name + "��ס���ĸ��ֵ���" + u.addr.street);
		System.out.println(u.name + "�ʱࣺ" + u.addr.zipcode);
	}
}