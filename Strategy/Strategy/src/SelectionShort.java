
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SelectionShort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(T[] arr) {
        
        T temp;
        int first;
        
        for (int i=arr.length-1; i > 0; i--) {
            first = 0;
            
            for (int j=1; j <= i; j++) {
                if (arr[j].compareTo(arr[first]) > 0)
                    first = j;
            }
            temp = arr[first];
            arr[first] = arr[i];
            arr[i] = temp;
        }
    }
    
}
