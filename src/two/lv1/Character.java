package two.lv1;

//父类
public class Character implements FightInterface {
    protected String name;
    protected int hp;
    protected double atk;
    protected double def;
    protected int damage;

    public Character(String name, int hp, double atk, double def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public int getDamage() {
        return damage;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    //打印血量
    public void print(Character[] c1) {
        for (int i = 0; i < c1.length; i++) {
            System.out.println(i + "." + c1[i].getName() + "血量:" + c1[i].getHp());
        }
    }

    public void attack(FightInterface fi, Character c1, Character[] c2) {
    }

    @Override
    public void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character[] c2, int index) {

    }

    @Override
    public void skill(Character c1) {

    }

    @Override
    public void equip(FightInterface fi, Hero hero) {

    }
}
