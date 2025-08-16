package Strivers.LinkedList;

import java.util.Scanner;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class middleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // Print the linked list from the given node
    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
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

        System.out.println("Enter the values of the nodes:");
        int val = sc.nextInt();
        ListNode head = new ListNode(val);
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        middleOfLinkedList solution = new middleOfLinkedList();
        System.out.println("Original List:");
        solution.printList(head);

        ListNode middle = solution.middleNode(head);
        System.out.println("Middle node onward:");
        solution.printList(middle);

        sc.close();
    }
}
