/**
  使用递归计算1~N 的和
    --> 1 + 2 + 3 + 4
    --> 4 + 3 + 2 + 1
 */
public class Recursion02 {
    public static void main(String[] args) {
        // 1~4 的和
        int n = 4;
        int reValue = sum(n);
        System.out.println(reValue);
    }
    public static int sum(int n) {
        // 4 + 3 + 2 + 1
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}