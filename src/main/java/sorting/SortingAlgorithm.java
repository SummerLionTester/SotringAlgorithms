package sorting;

public abstract class SortingAlgorithm {

    protected abstract int[] sort(int[] array, Comparison comparison);

    public void swap(int[] from, int firstIndex, int secondIndex) {
        int tmp = from[secondIndex];
        from[secondIndex] = from[firstIndex];
        from[firstIndex] = tmp;
    }
}
