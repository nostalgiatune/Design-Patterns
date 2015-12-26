public class Tuomari {
    
    private final MakihyppyMediator mediator;
    
    private final String nimi;

    public Tuomari(MakihyppyMediator mediator, String nimi) {
        
        this.mediator = mediator;
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }
    
    public void annaTyylipisteet(int hyppyNumero) {
        
        double pisteet =  (int)(Math.random() * 20);
        mediator.lisaaTuomarinPisteet(hyppyNumero, this, pisteet);
    } 
    
}