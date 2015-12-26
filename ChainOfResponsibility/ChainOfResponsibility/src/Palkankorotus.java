
public class Palkankorotus {
    
    public static void main(String[] args) {
        
        Palkankorottaja lahiesimies = new Lahiesimies();
        Palkankorottaja paallikko = new Paallikko();
        Palkankorottaja toimitusjohtaja = new Toimitusjohtaja();
        
        lahiesimies.setSuccessor(paallikko);
        paallikko.setSuccessor(toimitusjohtaja);
        
        lahiesimies.korotaPalkkaa(4);
    }
}
