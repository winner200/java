public class Break01{
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			if(i == 5){
				break; // ��ֹ���ǵ�ǰ��forѭ��
			}
			System.out.println("i ------>" + i); // 0 1 2 3 4
		}
		
		// ����ĳ�����forѭ���޹�
		System.out.println("Hello world");
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 10; i++){
				if(i == 5){
					break;  // ��ǰbreak�����ֹ�����ڲ�forѭ������Ϊ���for���������
							// ����break��䲻��Ӱ�쵽���forѭ����
				}
				System.out.println("i--->" + i);
			}
		}
		
		
		// ��forѭ��������for1
		for1:for(int j = 0; j < 3; j++) {
			// ��for2ѭ������for2
			for2:for(int i = 0; i < 10; i++){
				if(i == 5){
					break for1;
				}
				System.out.println("i--->" + i);
			}
		}
	}
}