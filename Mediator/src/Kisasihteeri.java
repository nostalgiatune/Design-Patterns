
import java.util.Collection;

public class Kisasihteeri {
    
    private final MakihyppyMediator mediator;
    
    private final String nimi;

    public Kisasihteeri(MakihyppyMediator mediator, String nimi) {
        
        this.mediator = mediator;
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }
    
    public void laskeJaLisaaPisteet() {
        
        Hyppaaja hyppaaja = mediator.getHyppaaja();
        
        for (int i=0; i<2; i++) {
            
            double pituuspisteet = 0.1 * mediator.getMittamies().mittaa(i);

            Collection<Double> tuomarienPisteet = mediator.getTuomarienPisteet(i).values();
            double min = tuomarienPisteet.stream().mapToDouble(d->d).min().getAsDouble();
            double max = tuomarienPisteet.stream().mapToDouble(d->d).max().getAsDouble();

            double tyylipisteet = tuomarienPisteet.stream()
                    .mapToDouble(d->d)
                    .filter(pisteet -> pisteet != min && pisteet != max)
                    .sum();

            Tulosrivi tulosrivi = new Tulosrivi(hyppaaja, pituuspisteet, tyylipisteet);
            mediator.getTulostaulu().lisaaTulosrivi(tulosrivi);
        }
    }
    
}