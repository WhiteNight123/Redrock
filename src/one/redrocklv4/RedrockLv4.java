package one.redrocklv4;

public class RedrockLv4 {
    public static void main(String[] args) {
        Food[] foods = new Food[5];
        foods[0] = new Food("辣子鸡丁", 38, 1);
        foods[1] = new Food("水煮肉片", 22, 2);
        foods[2] = new Food("糖醋里脊", 18, 3);
        foods[3] = new Food("干锅牛肉", 39, 4);
        foods[4] = new Food("干锅排骨", 29, 5);
        Restaurant restaurant = new Restaurant("重邮饭店");
        restaurant.welcome(foods);
        restaurant.pay();

    }
}
