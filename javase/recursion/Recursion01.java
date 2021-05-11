/*
	关于方法的递归调用
	1. 什么是递归：
		方法自身调用自身。
		a() {
			a();
		}
	2. 递归是很耗费栈内存的。递归算法可以不用的时候尽量别用。
	3. 以下程序运行的时候会发生这样一个错误【不是异常，是错误error】
		at Recursion01.doSome(recursion01.java:24) java.lang.StackOverflowError
		栈内存溢出错误。
		错误发生无法挽回，只有一个结果，就是JVM停止工作。
	4. 递归必须有结束条件，没有结束条件一定会发生栈内存溢出结果。

	注意：
		递归可以不使用尽量别使用。
		但是有些情况下该功能的实现必须依靠递归法方式。例如：目录拷贝
*/
public class Recursion01 {
	// 主方法
	public static void main(String[] args){
		System.out.println("main begin");
		// 调用doSome方法
		doSome();
		System.out.println("mamin over");
	}

	// 以下的代码片段虽然只有一份
	// 但是可以被重复的调用，并且只要调用doSome方法就会在栈内存中新分配一块所属的内存空间。
	public static void doSome() {
		System.out.println("doSome begin");
		doSome(); // 这一行代码不结束，下一行代码是不能执行的。
		System.out.println("doSome over");
	}
}