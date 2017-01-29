package algorithms.sortings;

/**
 * @date: 21/01/2017 11:15 PM
 * @author: qinjiangbo@github.io
 */
public class QuickSorting extends BaseSorting {

    public void sort(int[] a, int lo, int hi) {
        int k = partition(a, lo, hi);
        sort(a, lo, k - 1);
        sort(a, k + 1, hi);
    }

    /**
     * partition the array elements
     *
     * @param a array
     * @param hi
     * @param lo
     */
    private int partition(int[] a, int lo, int hi) {
        int k = a[lo]; // guard
        int i = lo + 1, j = hi;
        while (i <= j) {
            while (a[i] <= a[k]) {
                i++;
            }
            while (a[j] >= a[k]) {
                j--;
            }
            swap(i, j, a);
        }
        swap(lo, j, a);
        return j;
    }

    @Override
    public void sort(int[] a) {
        int lo = 0, hi = a.length;
        sort(a, lo, hi);
    }
}
