package two.RedrockLv0;

public class Call {
    public static void main(String[]args){
        Cellphone cellphone = new Cellphone();
        Animal animal=new Animal("dd",1,1,1);
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                animal.setAnimal("jk");
                System.out.println(animal.getAnimal());
            }
        });
    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
