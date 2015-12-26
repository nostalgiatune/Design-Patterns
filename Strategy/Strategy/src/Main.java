
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        
        Sorter<Integer> sorter = new Sorter<>();
        Integer[] arr = new Integer[100];
        for (int i=0; i<100; i++)
            arr[i] = i;
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        arr = list.toArray(arr);
        
        sorter.setAlgorithm(new SelectionShort<Integer>());
        sorter.sort(arr);
        for (Integer i : arr)
            System.out.println(i);
    }
}
