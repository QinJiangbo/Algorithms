package algorithms.unionfind;

import algorithms.general.AlgsData;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.*;

/**
 * @date: 20/01/2017 8:23 PM
 * @author: qinjiangbo@github.io
 */
public class UF {

    private int count; // number of components
    private int[] id; // access to component id (site indexed)

    /**
     * initialize N sites with integer names (0 to N-1)
     * @param N
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
        return find(p) == find(q);
    }

    /**
     * add connection between p and q
     */
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) return;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
        count--;
    }

    /**
     * component identifier for p (0 to N-1)
     * @param p
     * @return
     */
    public int find(int p) {
        return id[p];
    }

    /**
     * number of components
     * @return
     */
    public int count() {
        return count;
    }

    public static void main(String[] args) throws IOException {
        In in = AlgsData.in("tinyUF.txt");
        int N = in.readInt();
        UF uf = new UF(N);
        while (!in.isEmpty()) {
            int p = in.readInt();
            int q = in.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + "  " + q);
        }
        StdOut.println(uf.count() + " components");
    }

}