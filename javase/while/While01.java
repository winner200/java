public class While01 {
    public static  void main(String[] args) {
        /* 
        while(true) {
            System.out.println("死循环");
        }
        */

        // 编译器检测到该程序用法无法被执行，所以编译错误。因为上面死循环
        // System.out.println("Hello World");

        int i = 10;
        int j = 3;
        while (i > j) {
            System.out.println("h哈哈");
        }
        // 编译通过
        System.out.println("h哈哈");


        /* 
        while(10 > 3) {
            System.out.println("h哈哈");
        }
        */
        // 编译错误，无法访问的语句
        System.out.println("Hello world");
    }
}