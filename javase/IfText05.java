/*
	需求：
		判断当前的天气：
			当外面下雨的时候：
				带雨伞：
					判断性别：
						当性别为男：带一把大黑伞
						当性别为女：带一把小花伞
			当外面是晴天的时候：
				判断天气的温度：
					当天气温度在30度以上：
						当性别为男：带黑色墨镜
						当性别为女：擦防晒霜
		天气状况：1表示下雨、0表示晴天
		性别：1表示男、0表示女
*/
public class IfText05 {
	public static void main(String[] args) {
		// 接收键盘输入：输入的时候必须为字符串
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
		System.out.println("说明1：1表示下雨，0表示晴天");
		System.out.println("说明2:1表示男，0表示女");
		System.out.println("说明3：温度为数字");
		
		// 接收天气情况
		System.out.print("请输入当前天气状况：");
		int weather = s.nextInt();
		
		// 接收性别
		System.out.print("请输入性别：");
		int sex = s.nextInt();
		System.out.println("当前性别为：" + weather);
		if(weather == 1) {
			// 下雨天
			//System.out.print("请输入性别：" + sex==1 ? + "男");
			System.out.println("您的性别为：" + sex);
			if(sex == 1) {
				System.out.println("带一把大黑伞");
			}else if(sex == 0) {
				System.out.println("带一把小花伞");
			}else {
				System.out.println("对不起，您的性别是怎么回事？");
			}
		}else if(weather == 0) {
			// 晴天
			// 接收温度
			System.out.print("请输入当前天气的温度：");
			int tem = s.nextInt();
			if(tem > 30) {
				if(sex == 1) {
				System.out.println("带黑色墨镜");
				}else if(sex == 0) {
					System.out.println("擦防晒霜");
				}else {
					System.out.println("对不起，您的性别是怎么回事？");
				}
			}
			
		}else {
			System.out.println("对不起，您输入得天气情况不存在！");
		}
	}
}