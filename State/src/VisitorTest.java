
public class VisitorTest {
    
    public static void main(String[] args) {
        
        Pokemon pokemon = new Pokemon(Charmander.instantiate());
        Digimon digimon = new Digimon(Greymon.instantiate());
        
        CharacterVisitor bonusVisitor = BonusVisitor.instantiate();
        
        pokemon.accept(bonusVisitor);
        pokemon.evolve();
        pokemon.accept(bonusVisitor);
        pokemon.evolve();
        pokemon.accept(bonusVisitor);
        
        digimon.accept(bonusVisitor);
        
        System.out.println();
        System.out.println("Pokemon points: " + pokemon.getPokemonInstance().getBonus());
        System.out.println("Digimon points: " + digimon.getDigimonInstance().getBonus());
    }
}
