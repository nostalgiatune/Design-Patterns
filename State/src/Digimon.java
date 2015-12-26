
public class Digimon implements Visitable {
    
    private final DigimonState instance; // Can't evolve further

    public Digimon(DigimonState instance) {
        this.instance = instance;
    }

    @Override
    public void accept(CharacterVisitor visitor) {
        visitor.visit(this);
    }
    
    public void attack() {
        instance.attack();
    }
    
    public DigimonState getDigimonInstance() {
        return instance;
    }
    
}