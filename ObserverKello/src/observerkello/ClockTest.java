
package observerkello;


public class ClockTest {
    
    public static void main(String[] args) {
        
        ObserverKello kelloLogic = new ObserverKello(1000);
        KelloGui kelloGui = new KelloGui();
        kelloLogic.addObserver(kelloGui);
        kelloLogic.start();
        
        while(true);
    }
}
