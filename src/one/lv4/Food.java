package one.lv4;

public class Food {
    private String name;
    private int price;
    private int id;

    public Food(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }


    public double getPrice() {
        return price;
    }


    public String toString1() {
        return id + "." + name + " " + price + "元";
    }

    public String toString2() {
        return name + " " + price + "元";
    }
}
