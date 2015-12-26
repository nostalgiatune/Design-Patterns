
import java.util.Observable;

public class Hyppaaja extends Observable {
    
    
    private final MakihyppyMediator mediator;
    
    private final String nimi;
    
    public Hyppaaja(MakihyppyMediator mediator, String nimi) {
        this.nimi = nimi;
        this.mediator = mediator;
        addObserver(mediator);
    }

    public String getNimi() {
        return nimi;
    }
    
    public void hyppaa() {

        mediator.setHyppy(0, new Hyppy(150 + (Math.random() * 100)));
        mediator.setHyppy(1, new Hyppy(150 + (Math.random() * 100)));
        setChanged();
        notifyObservers();
    }
    
}