import java.util.*;

// Class representing a node in the list
class ListNode {
    int data;
    ListNode next;

    // Constructor
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseList {

    // Method to reverse the list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Helper method to print the list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();

        // Create the linked list from array
        int arr[] = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        // Print original list
        System.out.print("Original List: ");
        list.printList(head);

        // Reverse the list
        head = list.reverseList(head);

        // Print reversed list
        System.out.print("Reversed List: ");
        list.printList(head);
    }
}

