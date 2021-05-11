
/**
 方法的调用不一定是在main方法中，可以在其他方法当中。只要是程序可以执行到的位置，都可以去调用其他方法。
 */

public class Method04 {
    public static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        Method04.doSome();
    }
    public static void main(String[] args) {
        Method04.sum(1,2);

        System.out.println("Hello World");
    }
    public static void doSome() {
        System.out.println("你好，我是doSum");
    }
}