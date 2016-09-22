package algorithms;

import java.util.Iterator;

/**
 * Date: 9/11/16
 * Author: qinjiangbo@github.io
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    /**
     * 获取栈的大小
     * @return
     */
    public int size() {
        return N;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 压栈
     * @param item
     * @return
     */
    public Item push(Item item) {
        a[N++] = item;
        if (N == a.length) {
            resize(2 * a.length); // 当数组用完的时候扩容为原来两倍
        }
        return item;
    }

    /**
     * 出栈
     * @return
     */
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) { // 当数组使用量为原来的1/4的时候减容1/2
            resize(a.length / 2);
        }
        return item;
    }

    private void resize(int capacity) {
        Item[] arr = (Item[]) new Object[capacity];
        int length = a.length;
        for (int i = 0; i < length; i++) {
            arr[i] = a[i];
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    /**
     * 内部迭代器实现,是一个倒序迭代器,因为栈是LIFO结构
     */
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
