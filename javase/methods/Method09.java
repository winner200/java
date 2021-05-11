/**
  在返回值类型是void的方法当中使用 “return ;” 语句；
  return 语句出现在返回值为void方法当中主要是为了用来结束当前方法。
 */
public class Method09 {
    public static void main(String[] args) {
        m();
        m1();
        for(int i = 10; i > 0; i--) {
            if(i == 2) {
                return; // 结束的是main方法
            }
            System.out.println("i---->" + i);
        }
        System.out.println("Hello Here！");

        // 编译错误：返回值类型是void，不能返回值；
        // return 10;
    }

    // 编译错误：对于结果类型为空的方法，无法返回值。
    /*
    public static void m() {
        return 10;
    }
    */
    public static void m() {
        return;
    }
    public static void m1() {
        for(int i = 0; i < 10; i++) {
            if(i==5) {
                return; //return 不是终止for循环，终止的是m1方法
                //break; // 终止for循环
            }
            System.out.println("-----" + i);
        }
        System.out.println("Hello world");
    }
}