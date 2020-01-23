package defination;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT {
    @Override
    public void add(int index, Object item) {

    }

    private class Node<E> {
        private E data;
        private Node node;
    }
}
