package algorithms;

/**
 * Date: 30/09/2016
 * Author: qinjiangbo@github.io
 */
public class TwoSum {

    /**
     * 统计数组中互为相反数的两个数
     *
     * @param a
     * @return
     */
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] + a[j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
