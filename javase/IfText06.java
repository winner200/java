public class IfText06 {
	public static void main(String[] args) {
		boolean sex = true;
		
		if(sex) {
			System.out.println("男");
		}else {
			System.out.println("女");
		}
		
		sex = false;
		if(sex) System.out.println("男"); else System.out.println("女");
		
		// -------------------------------------------------------------------
		if(sex)
			System.out.println("男");
			System.out.println("呵呵");
		else 
			System.out.println("女");
		
		// 以上程序中编译错误出现在18行，18行以上没有语法错误。
	}
}