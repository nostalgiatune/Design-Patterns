/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuomavt
 */
public class Paallikko extends Palkankorottaja {

    @Override
    public boolean korotaPalkkaa(double korotus) {
        if (korotus < 5) {
            System.out.println("Paallikko korotti palkkaa " + korotus + " prosentilla");
            return true;
        }
        else
            return successor.korotaPalkkaa(korotus);
    }
    
}
