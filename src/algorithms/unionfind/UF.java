package algorithms.unionfind;

/**
 * @date: 20/01/2017 8:23 PM
 * @author: qinjiangbo@github.io
 */
public class UF {

    private int count; // number of components
    private int[] id; // access to component id (site indexed)

    /**
     * initialize N sites with integer names (0 to N-1)
     * @param n
     */
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * return true if p and q are in the same component
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return false;
    }

    /**
     * add connection between p and q
     * @param p
     * @param q
     */
    public void union(int p, int q) {

    }

    /**
     * component identifier for p (0 to N-1)
     * @param p
     * @return
     */
    public int find(int p) {
        return 0;
    }

    /**
     * number of components
     * @return
     */
    public int count() {
        return 0;
    }

}