package chapter13;

import java.util.Iterator;

/**
 * Date: 9/11/16
 * Author: qinjiangbo@github.io
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

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
