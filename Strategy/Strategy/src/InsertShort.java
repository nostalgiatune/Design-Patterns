
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertShort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(T[] arr) {
        
        for (int i=1; i<arr.length; i++) {
            int j=i;
            
            while (j > 0 && arr[j-1].compareTo(arr[j]) > 0) {
                T temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    
}
