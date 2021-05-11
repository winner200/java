public class OperatorTest03 {
	public static void main(String[] args) {
		// 运算符优先级不确定，加小括号
		System.out.println(5 > 3 & 5 > 2); // true
		System.out.println(5 > 3 & 5 > 6); // false
		System.out.println(5 > 3 | 5 > 6); // true
		
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		System.out.println(true | false); // true
		System.out.println(false | false); // false
		
		System.out.println(!false); // true
		System.out.println(!true); // false
		
		System.out.println(true ^ false); // true
		System.out.println(false ^ false); // false
		System.out.println(true ^ true); // false
		
		// 逻辑与和短路与
		//int x = 10;
		//int y= 8;
		// 逻辑与
		//System.out.println(x < y & ++x < y);
		//System.out.println(x); // 11
		
		// 逻辑与和短路与
		int x = 10;
		int y= 8;
		// 短路与
		// x < y结果是false，整个表达式结果已经确定是false，所以后面的表达式没有在执行，这种现象被称为短路现象。
		// 短路现象才会有短路现象，逻辑与是不会存在短路现象的。
		System.out.println(x < y && ++x < y); 
		System.out.println(x); // 10
	}
}