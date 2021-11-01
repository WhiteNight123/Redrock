package one.lv5;

public class Lv5 {
    public static void main(String[] args) {


        MutableArrayList list = new MutableArrayList();

        System.out.print("测试0:");
        list.add("重邮");
        System.out.print(list.get(0));

        System.out.print("测试1:");
        list.add(1);
        System.out.print(list.get(1));

        System.out.print("测试2:");
        list.add("a");
        list.remove(1);
        System.out.print(list.get(1));

        System.out.print("测试3:");
        list.add(1, "红岩网校");
        System.out.print(list.get(1));

        System.out.print("测试4:");
        list.remove("重邮");
        System.out.print(list.get(0));

        System.out.println("测试通过!");
    }
}
