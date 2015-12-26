
package observerkello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Timer;


public class ObserverKello extends Observable implements ActionListener {
    
    ArrayList<Observer> observers = new ArrayList<>();
    
    Timer timer;
    int hours;
    int minutes;
    int seconds;
    
    public ObserverKello() {
        timer = new Timer(1000, this);
    }
    
    public ObserverKello(int tickSpeedMs) {
        timer = new Timer(tickSpeedMs, this);
    }
    
    public void start() {
        timer.start();
    }
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(this, null);
    }
    
    public int getHour() {
       return hours; 
    }
    
    public int getMinute() {
       return minutes; 
    }
    
    public int getSecond() {
       return seconds; 
    }
    
    public void tick() {
        seconds++;
        if (seconds > 60) {
            seconds = 0;
            minutes++;
            if (minutes > 60) {
                minutes = 0;
                hours++;
            }
        }
        notifyObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tick();
    }
    
    
}
