public class Mittamies {
    
    private final MakihyppyMediator mediator;
    
    private final String nimi;

    public Mittamies(MakihyppyMediator mediator, String nimi) {
        
        this.nimi = nimi;
        this.mediator = mediator;
    }

    public String getNimi() {
        return nimi;
    }
    
    public double mittaa(int hyppyNumero) {
        return mediator.getHyppy(hyppyNumero).getPituus();
    }
    
}