
/*
	需求：
		假设系统给定一个人的年龄（这个人的年龄需要从键盘输入），
		根据年龄来判断这个人处于生命的哪个阶段。年龄必须在[0-150]
		
		[0-5] 幼儿
		[6-10] 少儿
		[11-18] 青少年
		[19-35] 青年
		[35-55] 中年
		[56-150] 老年
*/

public class IfTest01 {
	public static void main(String[] args) {
		// 接收键盘输入：年龄【输入的时候必须输入数字】
		java.util.Scanner s = new java.util.Scanner(System.in);
		//System.out.println("请输入您的年龄：");
		System.out.print("请输入您的年龄："); // 输出提示信息，不然用户根本不知道这里要干嘛！
		int age = s.nextInt(); // 停下来等到用户的输入，输入后自动接收，赋值给age变量。
		System.out.println("age = " + age);
		
		// 根据需求进行业务逻辑判断
		String persionMsg = "幼儿";
		if(age < 0 || age > 150) {
			persionMsg = "您提供的年龄不合法，年龄只需要在[0-150]之间";
		}else if(age <= 5) {
			persionMsg = "幼儿";
		}else if(age > 5 && age <= 10) {
			persionMsg = "少儿";
		}else if (age > 10 && age <= 18) {
			persionMsg = "青少年";
		}else if (age > 18 && age <= 35) {
			persionMsg = "青年";
		}else if (age > 35 && age <= 55) {
			persionMsg = "中年";
		}else if (age > 55 && age <= 150) {
			persionMsg = "老年";
		}
		System.out.println(persionMsg);
	}
	
}