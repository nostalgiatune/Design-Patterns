public class Greymon implements DigimonState {
    
    private static DigimonState singleton;
    private int bonus = 0;
    
    private Greymon() {}
    
    public static DigimonState instantiate() {
        synchronized (Greymon.class) {
            if (singleton == null)
                singleton = new Greymon();
            return singleton;
        }
    }

    @Override
    public void attack() {
        System.out.println("Greymon attacks");
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