public class Recursion03 {
    public static void main(String[] args) {
        int n = 5;
        int resValue = method(n);
        System.out.println(resValue); // 120
    }
    public static int method(int    n) {
        int result = 1;
        for(int i = n; i>0; i--) {
            result *= i; 
        }
        return result;
    }
}