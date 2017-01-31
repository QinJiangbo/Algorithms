package algorithms.lists;

import java.util.Iterator;

/**
 * Date: 22/09/2016
 * Author: qinjiangbo@github.io
 */
public class ListQueue<Item> implements Iterable<Item> {

    private Node head;
    private Node tail;
    private int N;

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * 获取队列大小
     *
     * @return
     */
    public int size() {
        return N;
    }

    /**
     * 入列
     *
     * @param item
     */
    public void enqueue(Item item) {
        Node lastNode = tail;
        tail = new Node();
        tail.item = item;
        tail.next = null;
        if (isEmpty()) head = tail;
        else lastNode.next = tail;
        N++;
    }

    /**
     * 出列
     *
     * @return
     */
    public Item dequeue() {
        Item item = head.item;
        head = head.next;
        if (isEmpty()) tail = null;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {

        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Node next;
        Item item;
    }
}
