public class Identifier {
    public static void main (String[] args) {
        // 字面值就是数据
		System.out.println("abc");
		
		System.out.println("最近你过得好么？");
		
		System.out.println(10);
		
		System.out.println(100);
		
		System.out.println(false);
		
		System.out.println(true);
		
		System.out.println('A');
		
		System.out.println(3.14);
		
		// 加上引号就不是浮点型的数据了，而是变成了字符串。
		System.out.println("3.14");
		
		// 编译报错，因为单引号中只能存放单个字符，属于字符型字面量。
		//System.out.println('abc');
    }
}