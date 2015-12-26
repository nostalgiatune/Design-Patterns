
public class Sorter<T extends Comparable> {
    
    Sort<T> algorithm;
    
    public void setAlgorithm(Sort<T> algorithm) {
        this.algorithm = algorithm;
    }
    
    public void sort(T[] array) {
        algorithm.sort(array);
    }
}
