public class Tulosrivi {
    
    private final Hyppaaja hyppaaja;
    private final double pituuspisteet;
    private final double tyylipisteet;
    private final double kokonaispisteet;

    public Tulosrivi(Hyppaaja hyppaaja, double pituuspisteet, double tyylipisteet) {
        
        this.hyppaaja = hyppaaja;
        this.pituuspisteet = pituuspisteet;
        this.tyylipisteet = tyylipisteet;
        this.kokonaispisteet = pituuspisteet + tyylipisteet;
    }

    public double getPituuspisteet(double pituuspisteet) {
        return pituuspisteet;
    }

    public double getTyylipisteet() {
        return tyylipisteet;
    }

    public double getPituuspisteet() {
        return pituuspisteet;
    }

    public double getKokonaispisteet() {
        return kokonaispisteet;
    }

    public Hyppaaja getHyppaaja() {
        return hyppaaja;
    }
    
}