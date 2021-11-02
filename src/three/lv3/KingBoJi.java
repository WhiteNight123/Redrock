package three.lv3;

public class KingBoJi extends King {
    @Override
    void review() {

        for (int i = 0; i < soldiers.length; i++) {
            if (i % 2 == 0) {
                System.out.println("同志们好");
                useSoldier(() -> System.out.println("国王好"));
            }
            if (i % 2 != 0) {
                System.out.println("同志们辛苦了");
                useSoldier(() -> System.out.println("不辛苦"));
            }
        }
    }

    //使用lambda表达式进一步优化匿名内部类的语法
    public void useSoldier(Soldier soldier) {
        soldier.response();
    }
}
