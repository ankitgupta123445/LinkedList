package defination;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT {
    private Node head = null;
    private int size = 0;

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    private class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
    @Override
    public void add(int index, Object item) {

    }


}
