package ocp;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("삐까삐까");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이 100만볼트 공격을 합니다.");
    }

    @Override
    public void evolve() {
//        setLevel(getLevel() + 1);
        this.level++;
        this.hp += 30;
        System.out.println(getName() + "이 레벨 " + this.level + "으로 Up, 체력은 " + this.hp + "으로 증가함");
    }
}
