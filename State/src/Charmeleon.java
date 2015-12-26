
public class Charmeleon implements PokemonState {
    
    final String name = "Charmeleon";
    private static PokemonState singleton;
    private int bonus = 0;
    
    private Charmeleon() {}
    public static PokemonState instantiate() {
        synchronized(Charmander.class) {
            if (singleton == null)
                singleton = new Charmeleon();
            return singleton;
        }
    }

    @Override
    public void tellName() {
        System.out.println("I'm " + name);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with fire blast");
    }

    @Override
    public PokemonState instantiateNextForm() {
        PokemonState nextForm = Charizard.instantiate();
        System.out.println("Evolving from " + name + " to " + nextForm.getName());
        return nextForm;
    }

    @Override
    public void giveBonus(int bonus) {
        this.bonus += bonus;
    }

    @Override
    public int getBonus() {
        return bonus;
    }
    
}
