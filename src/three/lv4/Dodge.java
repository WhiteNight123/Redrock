package three.lv4;

public abstract class Dodge {
    public static final int DODGE = 100;

    private Dodge next;

    abstract void dodgeEnemy(Enemy enemy);

    public Dodge getNext() {
        return next;
    }

    public static class Builder {
        private Dodge head, tail;

        public Dodge build() {
            return this.head;
        }

        public Dodge.Builder add(Dodge dodge) {
            if (head == null) {
                head = tail = dodge;
            } else {
                tail.next = dodge;
                tail = dodge;
            }
            return this;
        }
    }

}
