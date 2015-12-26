/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuomavt
 */
public class Toimitusjohtaja extends Palkankorottaja {

    @Override
    public boolean korotaPalkkaa(double korotus) {
        System.out.println("Toimitusjohtaja korotti palkkaa " + korotus + " prosentilla");
        return true;
    }
    
}
