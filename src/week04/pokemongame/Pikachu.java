package week04.pokemongame;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
    }

    @Override
    void sayHello() {
        System.out.println("피카 피카~");
    }
}
