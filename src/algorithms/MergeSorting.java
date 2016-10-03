package algorithms;

/**
 * Date: 03/10/2016
 * Author: qinjiangbo@github.io
 */
public class MergeSorting {

    /**
     * 交换元素
     */
    public static void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
