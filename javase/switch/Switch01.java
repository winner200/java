public class Switch01 {
	public static void main(String[] args) {
		/* 编译报错
		long a = 10L;
		int b = a;
		*/
		/*
		long x = 100L;
		switch(x) {} // 编译报错，可能会损失精度。
		*/
		
		// 解决编译错误
		long x = 100L;
		switch((int)x) {}
		
		byte b = 10;
		switch(b) {}
		
		short s = 10;
		switch(s) {}
		
		char c = "A";
		switch(c) {}
		
		char cc = 97;
		switch(cc) {}
		
		// 编译报错
		// switch(true){}
		
		String username = "张三";
		switch (username) {}
	}
}