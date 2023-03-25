package week04.pokemongame;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;

    protected Weapon weapon;
    protected Fly fly;

    public Pokemon(String name, int level, int hp, Weapon weapon, Fly fly) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.weapon = weapon;
        this.fly = fly;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void performAttack(Pokemon pokemon) {
        pokemon.weapon.attack(pokemon);
    }
    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void performFly() {
        this.fly.fly();
    }

    public void evolve() {
        System.out.println(this.name + "이(가) 진화했습니다!");
    }

    abstract void sayHello();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
