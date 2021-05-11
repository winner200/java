public class While03 {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
		}while(i > 100);
		System.out.println("i ---->" + i);
		
		int a = 1;
		do{
			System.out.println(a); // 1 2 3 4 5 6 7 8 9 10
			a ++;
		}while(a <= 10);
	}
}