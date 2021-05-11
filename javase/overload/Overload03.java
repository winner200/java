public class Overload03 {
    public static void main(String[] args) {
        m1();
        m1(1);
        m2(1.0, 2);
        m2(1, 2.0);
        m3(1);
        m3(1.1);
    }
    // 以下两个方法构成重载
    public static void m1(){}
    public static void m1(int a){}

    // 以下两个方法构成重载
    public static void m2(double a, int b){}
    public static void m2(int a, double b){}

    public static void m3(int x){}
    public static void m3(double x){}

    /*
    编译错误：以下不是方法重载，是方法重复。
        public static void m4(int a, int b) {}
        public static void m4(int a, int b) {}
    */

    /* 编译报错
    public static void x() {}
    public static int x() {
        return 1;
    }
    */

    void y() {}
    public static void y() {}
}