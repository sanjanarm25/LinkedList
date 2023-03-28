package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);

        linkedList1.show();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);

        linkedList2.show();

        LinkedList<Integer> linkedList6 = new LinkedList<>();
        linkedList6.push(56);
        linkedList6.push(70);

        boolean isInserted = linkedList6.insertAfter(70, 30);
        if (isInserted)
            System.out.println("Element inserted successfully!");
        else
            System.out.println("Element not inserted!");
        linkedList6.show();



    }
}
