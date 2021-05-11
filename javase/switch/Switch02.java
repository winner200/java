/*
	switch确实可以探测String类型，这是Java7的新特性。
*/

public class Switch02 {
	public static void main(String[] args) {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.print("请输入星期几：");
		String dayofWeek = Scanner.next();
		switch(dayofWeek) {
			case "星期一" : 
				System.out.println(1);
				break;
			case "星期二" :
				System.out.println(2);
				break;
			default :
				System.out.println("对不起，您输入的数据非法");
		}
	}
}