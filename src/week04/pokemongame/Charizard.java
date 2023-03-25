package week04.pokemongame;

public class Charizard extends Pokemon {
    public Charizard(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
    }

    @Override
    void sayHello() {
        System.out.println("자몽 자몽!");
    }
}
