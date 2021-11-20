package four.lv3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Lv3 {
    public static void main(String[] args) {
        double result = 0;
        double a;
        String b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入计算式如 2 + -1 (用空格分割)");
        sc.useDelimiter("\n");
        while (true) {
            String formula = sc.next();
            List<String> list = Arrays.asList(formula.split(" "));
            try {
                if (list.size() != 3) {
                    throw new InputException("请按格式输入(2 + -1)...");
                }
                a = Integer.parseInt(list.get(0));
                b = list.get(1);
                if (!Objects.equals(b, "+") && !Objects.equals(b, "-") &&
                        !Objects.equals(b, "*") && !Objects.equals(b, "/")) {
                    throw new InputException("只支持四则运算...");
                }
                c = Integer.parseInt(list.get(2));
                break;
            } catch (InputException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        switch (b) {
            case "+":
                result = a + c;
                break;
            case "-":
                result = a - c;
                break;
            case "*":
                result = a * c;
                break;
            case "/":
                try {
                    if (c == 0) {
                        throw new ArithmeticException("不能除以0");
                    }
                    result = (int) (a / c * 1000) / 1000.0; //转换成3位小数
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
        System.out.println("result=" + result);
    }

    static class InputException extends Exception {
        public InputException(String message) {
            super(message);
        }
    }
}

