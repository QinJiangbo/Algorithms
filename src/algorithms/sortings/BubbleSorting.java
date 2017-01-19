package algorithms.sortings;

import java.util.Arrays;

/**
 * @date: 18/01/2017 10:52 PM
 * @author: qinjiangbo@github.io
 */
public class BubbleSorting extends BaseSorting {

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 9, 4, 13, 18};
        new BubbleSorting().sort(a);
        System.out.printf(Arrays.toString(a));
    }

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(i, j, a);
                }
            }
        }
    }
}
