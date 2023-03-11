package srp;

public class PokemonEvolver {
    public void evolve(Pokemon pokemon) {
        pokemon.setLevel(pokemon.getLevel() + 1);
        System.out.println("레벨 up!");
    }
}
