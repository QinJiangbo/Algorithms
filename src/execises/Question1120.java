package execises;

/**
 * Created by Richard on 7/5/16.
 */
public class Question1120 {

    public static void main(String[] args) {
        System.out.println(ln(Nfactor(7)));
    }

    /**
     * log based on 10
     * @param N
     * @return
     */
    public static int ln(int N) {
        int count = 0;
        for (int i=N; i>9; i=i/10) {
            count++;
        }
        return count;
    }

    /**
     * N!阶乘
     * @param N
     * @return
     */
    public static int Nfactor(int N) {
        int sum = 1;
        while (N > 0) {
            sum  = sum * N;
            N--;
        }
        return sum;
    }
}
