package week04.pokemongame;

public class BubbleBeam implements Weapon {
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("거품광선을 " + pokemon.getName() + "에게 사용합니다!");
    }
}
