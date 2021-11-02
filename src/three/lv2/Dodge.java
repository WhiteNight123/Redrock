package three.lv2;

public abstract class Dodge {
    Dodge next;

    public void setNext(Dodge next) {
        this.next = next;
    }

    public final int DODGE = 100;

    abstract void dodgeEnemy(Enemy enemy);
}
