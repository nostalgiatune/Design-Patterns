
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class MakihyppyMediator implements Observer {
    
    public static void main(String[] args) {
        
        MakihyppyMediator mediator = new MakihyppyMediator();
        mediator.getHyppaajat().forEach(Hyppaaja::hyppaa);
        mediator.getTulostaulu().nayta();
    }
    
    // Viimeisimmän hypyn tiedot
    private Hyppaaja hyppaaja;
    private final Hyppy[] hypyt = new Hyppy[2];
    private final Map<Tuomari, Double> tuomarienPisteet1 = new HashMap<>(); // hyppy 1
    private final Map<Tuomari, Double> tuomarienPisteet2 = new HashMap<>(); // hyppy 2
    
    // Getterissä helpompi indeksoida taulukosta, kuin käyttää ehtolausetta
    private final Map[] pisteet = { tuomarienPisteet1, tuomarienPisteet2 };
    
    private final Tulostaulu tulostaulu = new Tulostaulu();
    
    private final List<Hyppaaja> hyppaajat = Arrays.asList(
            new Hyppaaja(this, "Matti Nykanen"),
            new Hyppaaja(this, "Janne Ahonen"),
            new Hyppaaja(this, "Sami Niemi")
    );
    
    private final List<Tuomari> tuomarit = Arrays.asList(
            new Tuomari(this, "Tuomari 1"),
            new Tuomari(this, "Tuomari 2"),
            new Tuomari(this, "Tuomari 3"),
            new Tuomari(this, "Tuomari 4"),
            new Tuomari(this, "Tuomari 5")
    );
    
    private final Kisasihteeri kisasihteeri = new Kisasihteeri(this, "Kisasihteeri");
    private final Mittamies mittamies = new Mittamies(this, "Mittamies");
    

    public Mittamies getMittamies() {
        return mittamies;
    }

    public List<Hyppaaja> getHyppaajat() {
        return hyppaajat;
    }

    public synchronized Hyppaaja getHyppaaja() {
        return hyppaaja;
    }
    
    public synchronized void setHyppy(int hyppyNumero, Hyppy hyppy) {
        hypyt[hyppyNumero] = hyppy;
    }

    public synchronized Hyppy getHyppy(int hyppyNumero) {
        return hypyt[hyppyNumero];
    }
    
    public synchronized void lisaaTuomarinPisteet(int hyppyNumero, Tuomari tuomari, double pisteet) {
       this.pisteet[hyppyNumero].put(tuomari, pisteet);
    }
    
    public synchronized Map<Tuomari, Double> getTuomarienPisteet(int hyppyNumero) {
        return pisteet[hyppyNumero];
    }

    public synchronized Tulostaulu getTulostaulu() {
        return tulostaulu;
    }

    @Override
    public synchronized void update(Observable o, Object arg) {
        
        if (o instanceof Hyppaaja) {
            hyppaaja = (Hyppaaja) o;
            pisteyta();
        }
    }
    
    private synchronized void pisteyta() {
        
        tuomarit.forEach(tuomari -> {
            tuomari.annaTyylipisteet(0);
            tuomari.annaTyylipisteet(1);
        });
        
        kisasihteeri.laskeJaLisaaPisteet();
    }
    
}