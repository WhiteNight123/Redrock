package four.lv4;

public class Character {
    private String name;
    private int hp;
    private int atk;

    public Character(String name, int hp, int atk) {
        this.hp = hp;
        this.atk = atk;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    private void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    private void setAtk(int atk) {
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Character character) {
        character.hp -= this.atk;
        System.out.println(this.name + "对" + character.name + "造成了" + this.atk + "点伤害");
        if (character.hp > 0) {
            character.attack(this);
        } else {
            System.out.println(character.name + "已阵亡");
        }
    }

    @Override
    public String toString() {
        return name + "\t hp=" + hp + "\t atk=" + atk;
    }
}
