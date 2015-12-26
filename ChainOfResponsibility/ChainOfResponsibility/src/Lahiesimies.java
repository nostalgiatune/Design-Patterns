/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuomavt
 */
public class Lahiesimies extends Palkankorottaja {

    @Override
    public boolean korotaPalkkaa(double korotus) {
        if (korotus <= 2) {
            System.out.println("Lähiesimies korotti palkkaa " + korotus + " prosentilla");
            return true;
        }
        else {
            return successor.korotaPalkkaa(korotus);
        }
    }
    
}
