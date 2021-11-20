package four.lv5;

import java.util.NoSuchElementException;

public class CustomArrayList<E> {
    Node<E> first = null;
    Node<E> last = null;
    int size = 0;

    //一个内部类
    private class Itr implements CustomsIterator<E> {
        Node<E> node = first;

        @Override
        public boolean hasNext() { //判断是否有下一个元素
            return node.next != null;
        }

        @Override
        public E next() { //返回下一个元素
            node = node.next;
            return node.item;
        }
    }

    //返回这个内部类
    public CustomsIterator<E> iterator() {
        return new Itr();
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(E e) { //默认添加在最后
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Node<E> node = find(index);
        if (index == 0) {
            first = node.next;
        } else if (index == size - 1) {
            last = node.prev;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        size--;
    }

    //查找基于索引的Node
    public Node<E> find(int index) {
        if (!(index >= 0 && index < size)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void get(int index) {
        System.out.println(find(index).item);
    }

    public void set(int index, E e) {
        find(index).item = e;
    }
}