
public interface PokemonState {
    
    void tellName();
    String getName();
    void attack();
    PokemonState instantiateNextForm();
    void giveBonus(int bonus);
    int getBonus();
    
}
