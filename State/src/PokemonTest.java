
public class PokemonTest {
    
    public static void main(String[] args) {
        
        Pokemon pokemon = new Pokemon(Charmander.instantiate());
        pokemon.tellName();
        pokemon.attack();
        pokemon.evolve();
        pokemon.tellName();
        pokemon.attack();
        pokemon.evolve();
        pokemon.tellName();
        pokemon.attack();
        pokemon.evolve();
    }
}
