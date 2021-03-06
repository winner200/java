// public 表示公共的
// class表示定义一个类
// HelloWold 表示一个类名
public class HelloWord { // 表示定义一个公开的类，起名HelloWold
	
	// 类体重不允许直接编写java语句【除声明变量只外】
	// System.out.println("Helloword");
	
    // 类体【记住】

    /**
     * public 表示公开的
     * static 表示静态的
     * void 表示空
     * main 表示方法名是main
     * （String[] args）是一个main方法的形式参数列表
     * 
     * 需要记住的是：
        以下的是一个程序的主方法，是程序的执行入口。
        是SUN公司规定的，固定的编写方式。
     */
    public static void main(String[] args) { // 表示定义一个公开的静态的主方法 args是方法名，可以随便写。其他的不行

        // 方法体
        // 方法体

        // java语句【java语句以“;” 终止，分号必须是半角分号】
        // 先记住：以下代码是像控制台输出一段信息；
        // 以下的双引号必须是半角的双引号。
        // java中所有的"字符串" 都使用双引号括起来。 
        System.out.println("Helloword");

        // 在向控制台输出消息
        System.out.println("HelloWord jackson");

        // 输出中文
        System.out.println("你好，杰克！");

        // 输出中文【提醒：以下程序员两边的双引号是去哪交的，这里的双引号不是java的一部分，这里全角的双引号只是一个普通的字符串】
        System.out.println("我是一个程序员");
    }
}