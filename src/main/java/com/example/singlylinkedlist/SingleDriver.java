package com.example.singlylinkedlist;

public class SingleDriver
{
    public static void main(String[] args)
    {
        LinkedList<String> LinkedList = new SinglyLinkedList<>();

        LinkedList.addFirst("First");
        LinkedList.addFirst("Second");
        LinkedList.addFirst("Third");
        LinkedList.addFirst("Fourth");
        LinkedList.addFirst("Fifth");

        LinkedList.addLast("Sixth");
        LinkedList.addLast("Seventh");
        LinkedList.addLast("Eighth");

        System.out.println(LinkedList);
    }
}
