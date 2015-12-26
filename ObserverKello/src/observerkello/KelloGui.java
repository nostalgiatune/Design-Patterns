/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerkello;

import java.util.Observable;
import java.util.Observer;


public class KelloGui implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        /*hours = ((ObserverKello)o).getHour();
        minutes = ((ObserverKello)o).getMinute();
        seconds = ((ObserverKello)o).getSecond();*/
        
        System.out.println("Hours: " + ((ObserverKello)o).getHour());
        System.out.println("Minutes: " + ((ObserverKello)o).getMinute());
        System.out.println("Seconds: " + ((ObserverKello)o).getSecond());
        System.out.println("");
    }
}
