package algorithms.sortings;

/**
 * @date: 18/01/2017 10:46 PM
 * @author: qinjiangbo@github.io
 */
public abstract class BaseSorting {

    // sorting method
    public abstract void sort(int[] a);

    public void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
