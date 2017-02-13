package algorithms.general;

/**
 * Date: 29/09/2016
 * Author: qinjiangbo@github.io
 */
public class ThreeSum {

    /**
     * 统计一个数组中和为0的三个数的组合个数
     *
     * @param a
     * @return
     */
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
