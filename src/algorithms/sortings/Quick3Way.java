package algorithms.sortings;

/**
 * @date: 22/01/2017 10:23 PM
 * @author: qinjiangbo@github.io
 */
public class Quick3Way extends BaseSorting {

    @Override
    public void sort(int[] a) {

    }

    /**
     * partition the array
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private int partition(int[] a, int lo, int hi) {
        int v = a[lo];
        int i = lo, j = hi;
        return 0;
    }

    public void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int k = partition(a, lo, hi);
        sort(a, lo, k - 1);
        sort(a, k + 1, hi);
    }
}
