public class Switch01 {
	public static void main(String[] args) {
		/* ���뱨��
		long a = 10L;
		int b = a;
		*/
		/*
		long x = 100L;
		switch(x) {} // ���뱨�����ܻ���ʧ���ȡ�
		*/
		
		// ����������
		long x = 100L;
		switch((int)x) {}
		
		byte b = 10;
		switch(b) {}
		
		short s = 10;
		switch(s) {}
		
		char c = "A";
		switch(c) {}
		
		char cc = 97;
		switch(cc) {}
		
		// ���뱨��
		// switch(true){}
		
		String username = "����";
		switch (username) {}
	}
}