package four.lv4;

import java.lang.reflect.Field;

public class Fight {
    Character hero;
    Character boss;

    public void start() {
        init();
        hero.attack(boss);
    }

    public void end() {
        init();
        try {
            Class<?> c1 = null;
            c1 = Class.forName("four.lv4.Character");
            Field aktField = null;
            aktField = c1.getDeclaredField("atk");
            aktField.setAccessible(true);
            aktField.set(boss, 9); //将boss的攻击力修改为10
            aktField.set(hero, 99999); //将英雄的攻击力修改为99999
        } catch (Exception e) {
            e.getMessage();
        }
        hero.attack(boss);
    }

    public void init() {
        hero = new Character("后羿", 1000, 500);
        boss = new Character("风暴龙王", 99999, 9999);
        System.out.println(hero);
        System.out.println(boss);
    }
}
