public class VarText03 {
	
	// ע�⣺�����static��Ҫȥ��
	static int k = 90;
	public static void main(String[] args) {
		
		// ����i����������main������
		// ������main������������Ч�ģ��ɼ��ģ����Է��ʵġ�
		int i = 100;
		
		System.out.println(i); // ����
		System.out.println(k); // ����
		
		for(int a = 0; a < 10; a++) { // a������������������forѭ����forѭ������֮��a�������ڴ���ͷ��ˡ�
			
		}
		// �����޷�����a����
		// System.out.println(a); 
		
		int j; // ��������main����
		for(j = 0; j < 10; j++){
			j = i;
		}
		System.out.println("����" + j); // ���ʵ���main�����е�j����
	}
	public static void doSome() {
		// �����޷�����main�������еı���i
		// �Ѿ�����i������������
		//System.out.println(i); // ������
		
		System.out.println(k); // ����
	}
}