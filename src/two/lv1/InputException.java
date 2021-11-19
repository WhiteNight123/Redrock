package two.lv1;

import java.util.Scanner;

public class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }

    static Scanner sc = new Scanner(System.in);

    public static int getIndex() {
        while (true) {
            String indexStr = sc.next();
            try {
                int index = Integer.parseInt(indexStr);
                if (index < 0 || index > 5) {
                    throw new InputException("请输入0-5...");
                }
                return index;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数...");
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String setName() {
        while (true) {
            String name = sc.next();
            try {
                if (name.length() > 10) {
                    throw new InputException("名字不能超过10个字符...");
                }
                return name;
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static int setHp() {
        while (true) {
            String hpStr = sc.next();
            try {
                int hp = Integer.parseInt(hpStr);
                if (hp <= 0 || hp > 9999) {
                    throw new InputException("生命值在1-9999");
                }
                return hp;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数...");
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
