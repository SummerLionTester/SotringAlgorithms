package sorting;

public class Sorting {

    public int[] descending(int[] array, SortingAlgorithm sortingAlgorithm) {
        return sortingAlgorithm.sort(array, Compare::isGreater);
    }

    public int[] ascending(int[] array, SortingAlgorithm sortingAlgorithm) {
        return sortingAlgorithm.sort(array, Compare::isLess);
    }
}

