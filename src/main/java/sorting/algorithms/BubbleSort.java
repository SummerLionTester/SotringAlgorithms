package sorting.algorithms;

import sorting.Comparison;
import sorting.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort extends SortingAlgorithm {

    public int[] sort(int[] array, Comparison comparison) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        if(arrayCopy.length == 0 | arrayCopy.length == 1) return arrayCopy;

        int lengthNotIncludingLast = arrayCopy.length - 1;
        for (int j = lengthNotIncludingLast; lengthNotIncludingLast >= 1; lengthNotIncludingLast--) {
            for (int currentIndex = 0; currentIndex < lengthNotIncludingLast; currentIndex++) {
                int nextIndex = currentIndex + 1;
                if (comparison.compare(arrayCopy[currentIndex], arrayCopy[nextIndex])) {
                    swap(arrayCopy, currentIndex, nextIndex);
                }
            }
        }

        return arrayCopy;
    }
}
