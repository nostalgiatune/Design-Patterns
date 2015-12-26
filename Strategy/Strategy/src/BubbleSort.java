
public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(T[] array) {
        
        int length = array.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i=0; i<length-1; i++) {
                if (array[i].compareTo(array[i+1]) > 0) {
                    T temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        }
    }
    
}
