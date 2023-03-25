package week04.pokemongame;

public class Squirtle extends Pokemon {
    public Squirtle(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
    }

    @Override
    void sayHello() {
        System.out.println("꼬북 꼬북...");
    }
}
