package week04.pokemongame;

public class main {
    public static void main(String[]args){
        Pokemon pikachu = new Pikachu("피카츄", 1, 10, new Thunderbolt(), new noFly());
        Pokemon squirtle = new Squirtle("꼬부기", 1, 20, new BubbleBeam(), new noFly());
        Pokemon charizard = new Charizard("리자몽", 10, 50, new Flamethrower(), new Wings());

        pikachu.sayHello();
        squirtle.sayHello();
        charizard.sayHello();
        pikachu.performAttack(squirtle);
        squirtle.performAttack(charizard);
        charizard.performAttack(pikachu);
        squirtle.performFly();
        charizard.performFly();
        charizard.evolve();
    }
}
