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

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.push(56);
        linkedList3.push(70);

        boolean isInserted = linkedList3.insertAfter(70, 30);
        if (isInserted)
            System.out.println("Element inserted successfully!");
        else
            System.out.println("Element not inserted!");
        linkedList3.show();


        LinkedList<Integer> linkedList4 = new LinkedList<>();
        linkedList4.push(70);
        linkedList4.add(56);
        linkedList4.push(30);
        linkedList4.push(35);
        linkedList4.add(45);

        linkedList4.show();

        Integer poppedData1 = linkedList4.pop();
        if (poppedData1 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The element popped is => " + poppedData1);

        Integer poppedData2 = linkedList4.popLast();
        if (poppedData2 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The element popped is => " + poppedData2);


        linkedList3.show();



    }
}
