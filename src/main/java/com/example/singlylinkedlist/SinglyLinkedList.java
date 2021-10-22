package com.example.singlylinkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>
{
    private Node head;
    private Node tail;

    public SinglyLinkedList()
    {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element)
    {
        Node node = new Node(element, head);
        if(head == null)
        {
            head = node;
            tail = head;
        }
        else
        {
            head = node;
        }
    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element, null);

        if(tail == null)
        {
            tail = node;
            head = tail;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }

    @Override
    public E pollFirst() {
        E element;

        if(head == null)
        {
            element = null;
        }
        else
        {
            Node next = head.next;
            element = head.element;
            head.next = null;
            head = next;
        }
        return element;
    }

    @Override
    public E pollLast() {
        E element;

        return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while(current != null)
        {
            joiner.add(current.element.toString());
            current = current.next;
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node
    {
        Node next;
        E element;

        public Node(E element, Node next)
        {
            this.element = element;
            this.next = next;
        }
    }
}
