package asiakas;

import arvuuttaja.*;
import java.util.Collections;
import java.util.Stack;

public class Asiakas extends Thread {
    
    private Arvuuttaja arvuuttaja;
    private LukuMemento lukuMemento;
    private final Stack<Integer> arvaukset = new Stack<>(); // Huolehditaan, että sama luku arvataan vain kerran
    
    @Override
    public void run() {
        
        liityPeliin();
        
        for (int i=0; i<Arvuuttaja.MAX_EXCLUSIVE; i++) {
            arvaukset.add(i);
        }
        Collections.shuffle(arvaukset);
        
        boolean oikein = false;
        while (!oikein) {
            
            int arvaus = arvaukset.pop();
            oikein = arvaa(arvaus);
            
            if (oikein)
                System.out.println("Asiakas " + Thread.currentThread().getName() + 
                    " arvasi oikein: " + arvaus);
            else
                System.err.println("Asiakas " + Thread.currentThread().getName() + 
                    " arvasi väärin: " + arvaus);
        }
    }
    
    public void setArvuuttaja(Arvuuttaja arvuuttaja) {
        
        this.arvuuttaja = arvuuttaja;
    }
    
    private void liityPeliin() {
        
        lukuMemento = arvuuttaja.liityPeliin();
    }
    
    private boolean arvaa(int arvaus) {

        return arvuuttaja.arvaa(lukuMemento, arvaus);
    }
}