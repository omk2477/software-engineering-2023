package week06.pokemon;

public class ElectricDecorator implements PokemonDecorator{
    Pokemon pokemon;

    public ElectricDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    @Override
    public void attack() {
        System.out.println("전기 포켓몬 공격");
    }

    @Override
    public int getLevel() {
        return this.pokemon.getLevel();
    }

    @Override
    public int getHP() {
        return this.pokemon.getHP();
    }

    @Override
    public String getName() {
        return this.pokemon.getName();
    }
}
