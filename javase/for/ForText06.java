/**
    使用for循环输出99乘法表
    1 * 1 = 1
    2 * 1 = 2 2 * 2 = 4
    3 * 1 = 3 3 * 2 = 6 3 * 3 = 9
    .....

    编写for循环找出1~100中所有的素数
    素数：又被称为质数，能够被1和自身整除，不能被其他数字整除的数字称为素数

    升级版：
        编写for循环找出1~10000中所有的素数
        要求每8个换一行输出

 */

public class ForText06 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            // System.out.println(i);
            for (int j = 1; j <= i; j ++){
                System.out.print(i + "*" + j + "=" + i * j);
            }
            // 换行
            // System.out.println();
            System.out.print("\n");
        }

        // 先编写程序，验证7这个数字是否为素数
        /**
         实现思路：
            7 / 1 【不需要】
            7 / 2 【7 % 2 != 0】
            7 / 3 【7 % 3 != 0】
            7 / 4 【7 % 4 != 0】
            7 / 5 【7 % 5 != 0】
            7 / 6 【7 % 5 != 0】
            7 / 7 【不需要】
         */

        
         /*
        // byte b = 0; // 默认将i看做是一个素数【0表示素数，1表示非素数】

        // 外部的for循环只负责取出每一个数字i。
        for(int i = 1; i <= 100; i++) {
            // 这里的代码只判断i是否为素数
            boolean isSuShu = true; // 默认将i看做一个素数【标记在开发中比较常用】
            for(int j = 2; j< i; j++) {
                if(i % j == 0){
                    // 非素数
                    isSuShu = false;
                    // 已经知道i是非素数，跳出循环
                    break;
                }
            }
            if(isSuShu) {
                System.out.println(isSuShu ? i + "是素数" : i + "不是素数");
            }
         }
         */

         // 升级版【加入换行机制】
         int count = 0;
         for(int i = 1; i <= 100; i++) {
            // 这里的代码只判断i是否为素数
            boolean isSuShu = true; // 默认将i看做一个素数【标记在开发中比较常用】
            for(int j = 2; j< i; j++) {
                if(i % j == 0){
                    // 非素数
                    isSuShu = false;
                    // 已经知道i是非素数，跳出循环
                    break;
                }
            }
            if(isSuShu) {
                System.out.print(isSuShu ? i + "是素数" : i + "不是素数");
                count ++;
                // if(count % 8 ==0) {
                //     System.out.println();
                // }

                if(count == 8) {
                    System.out.println();
                    count = 0;
                }
            }
         }
    }
}