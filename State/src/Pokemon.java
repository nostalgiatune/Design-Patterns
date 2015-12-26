
public class Pokemon {
    
    // State object
    private PokemonState instance;
    
    public Pokemon(PokemonState instance) {
        this.instance = instance;
    }
    
    public void tellName() {
        instance.tellName();
    }
    
    public void attack() {
        instance.attack();
    }
    
    public void evolve() {
        instance = instance.instantiateNextForm();
    }
    
    public void changePokemonInstance(PokemonState pokemonInstance) {
        this.instance = pokemonInstance;
    }
}
