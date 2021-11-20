package four.lv5;

public class Lv5 {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("1"); //添加结点
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove(1);//删除第二个结点
        list.get(1); //得到第二个结点
        list.set(1, "3"); //修改第二个结点

        CustomsIterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
