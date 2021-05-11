/*
	方法调用：
		1. 方法的修饰符列表当中有static关键字，完整的调用方式是：类名.方法名(实参列表);
		2. 但是有的时候 “类名.” 可以省略，什么情况下可以省略呢？
			m1() {
				m2();
			}
			m1方法和m2方法在同一个类体当中的时候，“类名.” 可以省略不写。
		3. 建议在java源文件当中，只定义一个class，比较清晰。这里只是为了讲课的方便。才在java源文件当中编写了多个class。这种方式不要模仿。
*/

public class Method06 {
	public static void main(String[] args) {
		// 调用方法
		Method06.m();
		
		// 对于方法的修饰符列表当中有static关键字的：“类名.” 可以省略不写吗？
		m();
		
		// 调用其他类【不是本类中的方法】
		A.doOther();
		
		// 省略“类名.” 试试
		// 编译报错，“类型.” 省略之后，默认从当前类中找 "doOther" 方法，在当前类中该方法不存在。
		// doOther();
	}
	public static void m() {
		System.out.println("m method execute!");
		
		// 完整的方式
		Method06.m2();
		// 省略的方式
		m2();
		
		// 不想调用当前本类的m2方法，这个时候就必须添加“类名.” 了。
		A.m2();
	}
	public static void m2() {
		System.out.println("m2 method execute!");
	}
}

class A {
	public static void doOther() {
		System.out.println("A，s doOther method invoke");
	}
	
	public static void m2() {
		System.out.println("A, m2 doOther method invoke");
	}
}