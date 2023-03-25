package week04.pokemongame;

public class noFly implements Fly {
    @Override
    public void fly() {
        System.out.println("날 수 없어요!");
    }
}
