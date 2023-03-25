package week03.ocp;

public class Charizard extends Pokemon {
    public Charizard(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("파일파일");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 화염공격을 합니다!");
    }

    @Override
    public void evolve() {
        this.hp += 60;
        this.level++;
        System.out.println(getName() + "이 레벨 " + this.level + "으로 Up, 체력은 " + this.hp + "으로 증가함");
    }
}
