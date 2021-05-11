class B {
	// 如果里面不写入口方法，那么运行时会报错。
	/*
	public static void main(String[] args){
		System.out.println("B s main method invoke！");
	}
	*/
}

class X {
	public static void main(String[] args) {
		System.out.println("X s main method invoke！");
	}
}

class Y {
	public static void main(String[] args) {
		System.out.println("Y s main method invoke！");
	}
}

/*
public class Y {
	
}
*/

// 只能有一个public类。因为类名是跟源文件名称对应的。
public class K {
	public static void main(String[] args) {
		System.out.println("k s main method invoke！");
	}
}