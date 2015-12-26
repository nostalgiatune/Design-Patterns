
public class Charizard implements PokemonState {
    
    final String name = "Charizard";
    private static PokemonState singleton;
    private int bonus = 0;
    
    private Charizard() {}
    public static PokemonState instantiate() {
        synchronized(Charmander.class) {
            if (singleton == null)
                singleton = new Charizard();
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
        System.out.println(name + " attacks with firestorm");
    }

    @Override
    public PokemonState instantiateNextForm() {
        System.out.println("Charizard can't evolve any further");
        return Charizard.instantiate();
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
