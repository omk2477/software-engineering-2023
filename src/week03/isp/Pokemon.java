package week03.isp;

public interface Pokemon {
    void attack();
    void defend();
    void fly();
    void swim();
}

class Pikachu implements AttackablePokemon {
    @Override
    public void attack() {
        System.out.println("100만볼트 공격 성공!");
    }

    @Override
    public void defend() {
        System.out.println("방어 성공");
    }
}
