package chapter13;

import java.util.Iterator;

/**
 * Date: 9/11/16
 * Author: qinjiangbo@github.io
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public Item push(Item item) {
        a[N++] = item;
        return item;
    }

    public Item pop() {
        return a[--N];
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class ReverseArrayIterator implements Iterator<Item> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }
    }
}
