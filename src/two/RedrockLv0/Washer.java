package two.RedrockLv0;

public class Washer extends Box{
    public Washer(String box, int length, int height) {
        super(box, length, height);
    }
    public void func(Animal animal){
        System.out.println("洗"+animal.getAnimal());
    }
}
