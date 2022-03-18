package sorting.algorithms;

import sorting.Comparison;
import sorting.SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort extends SortingAlgorithm {
    public int[] sort(int[] array, Comparison comparison) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        if(arrayCopy.length == 0 | arrayCopy.length == 1) return arrayCopy;

        for(int i = 1; i < arrayCopy.length; i++) {
            for(int currentIndex = i;currentIndex > 0; currentIndex--) {
                int prevIndex = currentIndex - 1;
                if(comparison.compare(arrayCopy[currentIndex], arrayCopy[prevIndex])) {
                    swap(arrayCopy, currentIndex, prevIndex);
                }
            }
        }

        return arrayCopy;
    }
}
