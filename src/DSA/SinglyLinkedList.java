package DSA;

import java.io.PrintStream;
import java.util.List;

public class SinglyLinkedList {

    private   ListNode head;
    private static class ListNode {
        private int data; // Generic type
        private ListNode next;
        public ListNode(int data){ // constructor
            this.data = data;
            this.next = null;
        }
    }
    public void display() {
        ListNode current = head;
        while (current != null){
            System.out.printf(current.data + " --> ");
            current = current.next;
        }
        System.out.printf(" null");
    }



    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
      //  sll.head = new ListNode(10);
       // ListNode second = new ListNode(11);
     //   ListNode third = new ListNode(18);
      //  ListNode fourth = new ListNode(21);
      //  sll.head .next = second;
      //  second.next = third;
      //  third.next = fourth;

       /* sll.InsertFirst(65);
        sll.InsertFirst(12);
        sll.insertLast(67);
        sll.insertLast(68);
        sll.InsertFirst(1 );
       ListNode current = sll.head;
        while (current!= null){
            System.out.print(current.data + " -->  ");
            current = current.next;
        }
        System.out.print("null");


        System.out.println(" Length is -" + sll.length());


        */
        sll.Insert(1, 5);
        sll.insertLast(8);
        sll.InsertFirst(1);
        sll.Insert(3,7);
        sll.Insert(2,4);
        sll.Insert(3,6);
        sll.Insert(1,0);
        sll.Insert(8, 10);
        sll.display();
        System.out.println(sll.deleteFirst().data);
        sll.display();
    }
    public ListNode deleteFirst(){
        if (head==null){
            return null;
        }
        else {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
    }
         public void Insert(int position, int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }
            else {
            ListNode previous = head;
            int count = 1;

            while (count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
         }
    public void InsertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
     public void insertLast(int value){

        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){

        current = current.next;
            }
        current.next = newNode;
    }
}
