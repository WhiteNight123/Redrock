package one;

public class RedrockLv1 {
    public static void main(String[] args) {

        //打印九九乘法表
        System.out.println("乘法口诀表:");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }

        //打印五角星
        int length = 50;
        int width = 20;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                //打印1-6行
                if (i <= 6) {
                    if (j >= length / 2 - i + 1 && j <= length / 2 + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                    //打印7-11行
                } else if (i <= 11 && i >= 7) {
                    if (j >= 3 * (i - 6) && j <= length - 3 * (i - 6)) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                    //打印12-25行
                } else {

                    if (j >= length / 2 - i + 2 && j <= length - 3 * (i - 6)) { //打印左半边
                        System.out.print("*");
                    } else if (j >= 3 * (i - 6) && j <= length / 2 + i - 2) { //打印右半边
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }

            }
            System.out.println();

        }
    }
}
