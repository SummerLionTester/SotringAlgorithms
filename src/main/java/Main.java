import sorting.algorithms.InsertionSort;
import sorting.Sorting;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int [] array ={6, 3, 1, 5};
        Sorting sorting = new Sorting();
        int [] sortedArray = sorting.descending(array, new InsertionSort());

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }
}
