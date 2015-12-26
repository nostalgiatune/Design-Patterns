package arvuuttaja;


public class Arvuuttaja {
    
    public static final int MAX_EXCLUSIVE = 10; // Lukujen yläraja
    
    public LukuMemento liityPeliin() {
        
        Integer luku = (int) (Math.random() * MAX_EXCLUSIVE);
        System.out.println("Arvuuttaja antoi asiakkaalle " + Thread.currentThread().getName() + 
                " luvun " + luku);
        return new LukuMemento(luku);
    }
    
    public boolean arvaa(LukuMemento lukuMemento, int arvaus) {
        return lukuMemento.luku == arvaus;
    }
    
}