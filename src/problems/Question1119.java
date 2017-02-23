package problems;

/**
 * Created by Richard on 7/5/16.
 */
public class Question1119 {

    public static void main(String[] args) {
        Long[] num = new Long[100];
        for (int i=0; i<100; i++) {
            num[i] = F(i);
            System.out.println(num[i]);
        }
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
}
