package asiakas;

import arvuuttaja.*;

public class Testi {
    
    public static void main(String[] args) {
        
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        Asiakas arvaaja1 = new Asiakas();
        Asiakas arvaaja2 = new Asiakas();
        Asiakas arvaaja3 = new Asiakas();
        
        arvaaja1.setArvuuttaja(arvuuttaja);
        arvaaja2.setArvuuttaja(arvuuttaja);
        arvaaja3.setArvuuttaja(arvuuttaja);
        
        arvaaja1.start();
        arvaaja2.start();
        arvaaja3.start();
    }
}