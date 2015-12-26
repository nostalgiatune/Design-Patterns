
public class Charmander implements PokemonState {
    
    final String name = "Charmander";
    private static PokemonState singleton = null;
    private int bonus = 0;
    
    private Charmander() {}
    public static PokemonState instantiate() {
        synchronized(Charmander.class) {
            if (singleton == null)
                singleton = new Charmander();
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
        System.out.println(name + " attacks with fire breath");
    }

    @Override
    public PokemonState instantiateNextForm() {
        PokemonState nextForm = Charmeleon.instantiate();
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
