package two.lv0;

public class Animal {
    private String animal;
    private int length;
    private int height;
    private int weight;

    public Animal() {

    }

    public Animal(String animal, int length, int height, int weight) {
        this.animal = animal;
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public void move(Animal animal,Box box) {
        if (animal.getLength() <= box.getLength() && animal.getHeight() <= box.getHeight()) {
            System.out.println("把" + animal.getAnimal() + "装进" + box.getBox());
        }else {
            System.out.println(animal.getAnimal()+"太大了,装不进去...");
        }
    }
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
