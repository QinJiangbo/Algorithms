package algorithms;

import java.util.Iterator;

/**
 * Date: 22/09/2016
 * Author: qinjiangbo@github.io
 */
public class ListStack<Item> implements Iterable<Item> {

    private Node head; // 栈顶元素
    private int N; // 栈的大小

    /**
     * 判断是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * 获取栈的大小
     *
     * @return
     */
    public int size() {
        return N;
    }

    /**
     * 入栈
     *
     * @param item
     */
    public void push(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = head;
        head = node;
        N++;
    }

    /**
     * 出栈
     *
     * @return
     */
    public Item pop() {
        Item item = head.item;
        head = head.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {

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

    /**
     * 内部类,用于存储每个节点的信息
     */
    private class Node {
        Node next;
        Item item;
    }
}
