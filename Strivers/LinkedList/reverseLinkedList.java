package Strivers.LinkedList;

import java.util.Scanner;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    // Default constructor
    ListNode() {}
    // Constructor with value
    ListNode(int val) { this.val = val; }
    // Constructor with value and next node
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   
        ListNode current = head;

        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev;
    }

    // Print the linked list
    public void printList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes in the linked list: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Linked list is empty.");
        }

        // Taking input for linked list
        System.out.println("Enter the values of the nodes:");
        int val = sc.nextInt();
        ListNode head = new ListNode(val);
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        reverseLinkedList solution = new reverseLinkedList();
        System.out.println("Original List:");
        solution.printList(head);

        ListNode newHead = solution.reverseList(head);
        System.out.println("Reversed List:");
        solution.printList(newHead);

        sc.close();
    }
}
