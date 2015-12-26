
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        
        //threadsWithOwnIterators(ints);
        //threadsWithSharedIterator(ints);
        iterateMutatingList(ints);
    }
    
    public static void threadsWithOwnIterators(List<Integer> ints) {
        
        Thread t1 = new Thread(()->{
            Iterator<Integer> i1 = ints.iterator();
            while (i1.hasNext())
                System.out.println(Thread.currentThread().getName() + ": " + i1.next());
        });
        
        Thread t2 = new Thread(()->{
            Iterator<Integer> i2 = ints.iterator();
            while (i2.hasNext())
                System.out.println(Thread.currentThread().getName() + ": " + i2.next());
        });
        
        t1.start();
        t2.start();
    }
    
    // Säieturvallinen
    public static void threadsWithSharedIterator(List<Integer> ints) {
        
        Object lock = new Object(); // säikeet vuorottelemaan
        Iterator<Integer> i = ints.iterator();
        
        Thread t1 = new Thread(()->{
            synchronized (lock) {
                while (i.hasNext()) {
                    System.out.println(Thread.currentThread().getName() + ": " + i.next());
                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lock.notify();
            }
        });
        
        Thread t2 = new Thread(()->{
            synchronized (lock) {
                while (i.hasNext()) {
                    System.out.println(Thread.currentThread().getName() + ": " + i.next());
                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lock.notify();
            }
        });
        
        t1.start();
        t2.start();
    }
    
    // Heittää poikkeuksen
    public static void iterateMutatingList(List<Integer> ints) {
        
        Iterator<Integer> i = ints.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            ints.set(2, 999); // toimii
            ints.add(123); // ei toimi
        }
    }
    
}