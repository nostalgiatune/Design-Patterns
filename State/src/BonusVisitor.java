public class BonusVisitor implements CharacterVisitor {
    
    private static CharacterVisitor instance;
    
    private BonusVisitor() {}
    
    public static CharacterVisitor instantiate() {
        synchronized (BonusVisitor.class) {
            if (instance == null)
                instance = new BonusVisitor();
            return instance;
        }
    }

    @Override
    public void visit(Pokemon pokemon) {
        
        int bonus = 0;
        
        PokemonState instance = pokemon.getPokemonInstance();
        Class<? extends PokemonState> clazz = instance.getClass();
        
        if (clazz == Charmander.class)
            bonus = 1;
        
        else if (clazz == Charmeleon.class)
            bonus = 2;
        
        else if (clazz == Charizard.class)
            bonus = 3;
        
        System.out.println("Visitor gives pokemon of class " + clazz + " " +
                bonus + " points");
        instance.giveBonus(bonus);
    }

    @Override
    public void visit(Digimon digimon) {
        
        int bonus = 0;
        
        DigimonState instance = digimon.getDigimonInstance();
        Class<? extends DigimonState> clazz = instance.getClass();
        
        if (clazz == Greymon.class)
            bonus = 9000;

        System.out.println("Visitor gives digimon of class " + clazz + " " +
                bonus + " points");
        instance.giveBonus(bonus);
    }
    
}