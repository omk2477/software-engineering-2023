package week07.pokemon;

interface Battleable {
    void attack();
}
class Pokemon implements Battleable {
    public void attack() {
        System.out.println("공격!");
    }
}

class Trainer {
    private final Battleable battleable;

    public Trainer(Battleable battleable) {
        this.battleable = battleable;
    }

    public void battle() {
        battleable.attack();
    }

    public void catchPokemon() {
        System.out.println("포켓몬 획득~");
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Trainer jiwoo = new Trainer(pokemon);
        jiwoo.catchPokemon();
        jiwoo.battle();
    }
}