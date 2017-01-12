package execises;

/**
 * Created by Richard on 6/30/16.
 */
public class Question117 {
    public static void main(String[] args) {
        printCodeA();
        printCodeB();
        printCodeC();
    }

    public static void printCodeA() {
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t);
    }

    public static void printCodeB() {
        int sum = 0;
        for(int i = 1; i < 1000; i++) {
            for(int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void printCodeC() {
        int sum = 0;
        for(int i = 0; i < 1000; i *=2) {
            for(int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
