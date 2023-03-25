package week04.pokemongame;

public class Thunderbolt implements Weapon {
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("썬더볼트를 " + pokemon.getName() + "에게 사용합니다!");
    }
}
